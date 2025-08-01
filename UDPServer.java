//two clases are provided by java programming to do the udp socket programming 
//datagram socket 
//datagram packet 
//both client and server programs user datagram socket class to send and recive datagram packet 

//write a program to establish connection between client and server using udp 

import java.net.*;

import java.io.*;

public class UDPServer{


public static void main(String[] args)throws Exception
{


// step 1 create datagram socket objct 

DatagramSocket ds = new DatagramSocket(1235);

//step 2 create empty space for incoming message of byte array type
byte[] buffer = new byte[1024]; // the byte space should always be 2^n 
// step 3 create datagram packet object 

DatagramPacket dp = new DatagramPacket(buffer,buffer.length);

//step 4 is receive the packets from the client by invoking recieve method and receive method is inside datagram socket 

ds.receive(dp);

//conver the byte code message to the string message type

String message = new String(dp.getData(),0,dp.getLength());
System.out.println("Message from client"+message);



}


}
