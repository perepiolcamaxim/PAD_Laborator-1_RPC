package com.utm.broker;
import com.utm.common.ConnectionSetting;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BrokerSocket
{
    private ServerSocket serverSocket;
    private Socket clientSocket;

    public void start()
    {
        try
        {
            serverSocket = new ServerSocket(ConnectionSetting.port);
        }
        catch (IOException e)
        {
            System.out.println("Can't conect to port!");
        }

        while(true)
        {
            try
            {
                clientSocket = serverSocket.accept();

                BrokerThread brokerThread = new BrokerThread(clientSocket);  // se creaza thread nou
                Thread thread = new Thread(brokerThread);
                thread.start();
            }
            catch (IOException e)
            {
                System.out.println("Can't bind socket!");
            }
        }
    }

}
