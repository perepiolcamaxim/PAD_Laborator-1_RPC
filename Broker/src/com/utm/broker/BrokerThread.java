package com.utm.broker;

import com.google.gson.Gson;
import com.utm.common.Payload;
import java.io.*;
import java.net.Socket;

public class BrokerThread implements Runnable
{
    private Socket clientSocket;
    private PayloadHandler handler;
    private PrintWriter writer = null;
    private BufferedReader reader = null;

    public BrokerThread(Socket clientSocket)
    {
        this.clientSocket = clientSocket;
        try
        {
            writer = new PrintWriter(clientSocket.getOutputStream());
            reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        }
        catch (IOException e)
        {
            System.out.println("Can't open stream!");
        }
        handler = new PayloadHandler();
    }

    @Override
    public void run()
    {
        try
        {
            String inputLine;
            int outputLine;

            while ((inputLine = reader.readLine()) != null)
            {
                Gson gson = new Gson();
                Payload payload = gson.fromJson(inputLine, Payload.class);

                outputLine = handler.handle(clientSocket, payload);

                if (outputLine == 1)
                {
                    writer.println("Payload received!");
                    writer.flush();
                } else
                {
                    writer.println("Hello receiver!");
                    writer.flush();
                }
            }
        }
        catch (InterruptedIOException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            System.out.println("Client disconected");
            try
            {
                writer.close();
                reader.close();
                ConnectionStorage.remove(clientSocket);
                clientSocket.close();
            }
            catch (IOException ioException)
            {
                ioException.printStackTrace();
                System.out.println("Can't clone the socket!");
            }
        }
    }
}
