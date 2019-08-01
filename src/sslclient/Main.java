package sslclient;
import java.io.*;
import java.net.*;
import javax.net.ssl.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
       SSLSocketFactory ssf =
           (SSLSocketFactory)SSLSocketFactory.getDefault();
       Socket sslSocket = ssf.createSocket("localhost", 50000);

       PrintWriter pR = new PrintWriter(sslSocket.getOutputStream(), true);
       pR.println("Hello Secure Sockets!");
       pR.println("I Love security!");
       pR.close();
       sslSocket.close();
    }
}
