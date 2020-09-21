package com.utm.broker;

import com.utm.common.ConnectionInfo;
import com.utm.common.Payload;
import java.net.Socket;

public class PayloadHandler          // se lamureste ce sa faca cu inputul
{
    private Socket clientSocket;

    public void handle(Socket clientSocket, Payload payload)
    {
        this.clientSocket = clientSocket;

        if(payload.getId() == 0)  //  e receiver, vezi ce topic vrea si inscre-l in storage
        {
            ConnectionInfo connectionInfo = new ConnectionInfo(clientSocket, payload);
            ConnectionStorage.add(connectionInfo);
            System.out.println("Lista de receiveri:");
            ConnectionStorage.print();
        }
        else      // e publisher, vezi ce topic contine si pune mesajul in storage
        {
            System.out.println("Publisher:  " + payload.getId() + " " + payload.getTopic() + " " + payload.getMessage());
        }
    }
}
