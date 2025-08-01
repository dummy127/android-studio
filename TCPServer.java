//client server programming 
//a tcp connection java programming provides two predefined classes inside the //netpackege which are
//server socket and socket classes
//here we will create two programs one is client program and another one is server //program

//to create server program we need both the predifined classes but for the client //program we need only one class in needed that is socket class

//write a program for one way commnnication between client and server using java //socket (this is tcp connection)

//step 1 is import java net package 

import java.net.*;
import java.util.*;
import java.io.*;


public class TCPServer {

public static void main(String[] args) throws Exception
{

// step 2 create a server socket object

	ServerSocket ss = new ServerSocket(1999);
	//step -3 keep the server in waiting state
	Socket link = ss.accept(); // to invoke  

// step 4 we have to read the input from the client 

  	Scanner input = new Scanner(link.getInputStream());

	String message = input.nextLine();
	System.out.println("message from client"+message);
	
}

}