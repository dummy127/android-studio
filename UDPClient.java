//client program UDP to send the data from client to server

import java.net.*;
 
public class UDPClient{

public static void main(String[] args)throws Exception

{

//create datagram socket object 
DatagramSocket ds = new DatagramSocket();
String message = "Hi, How are you server!!!";
//pack the message in datagrampacket
InetAddress ip = InetAddress.getByName("localhost");// to fetch the ip address of localhost

DatagramPacket dp = new DatagramPacket(message.getBytes(),message.length(),ip,1235);
ds.send(dp);


}

}