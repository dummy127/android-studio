//write client program 

import java.net.*; // for Socket class 
//import java.util.*;
import java.io.*;

public class TCPClient{

public static void main(String[] args)throws Exception

{

// create a link to establish a conncetion between client and server

Socket s = new Socket("localhost",1999); 
DataOutputStream dos = new DataOutputStream(s.getOutputStream());

dos.writeUTF("Hi, I am Aradhya Ambole");

s.close();

}
}