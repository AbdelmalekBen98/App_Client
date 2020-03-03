/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appclient;

/**
 *
 * @author Abdelmalek
 */
import java.net.*;
import java.io.*;

public class Client {
	Socket socket;
	DataInputStream in ;
       
        DataOutputStream out;
	/*
        public Client(String adresse, int port)
	{
		try {
			socket =new Socket(adresse,port);
			in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			message=in.readLine();
                        System.out.println(message);
			//socket.close();
		}
		catch(IOException e)
		{e.printStackTrace();}
	}
        */
        public Client(String adresse, int port)
        {
            try {
			socket =new Socket(adresse,port);
			in=new DataInputStream(socket.getInputStream());
			
			
                        out = new DataOutputStream(socket.getOutputStream()); 
                              String message="";                                               
    
                        while (true) 
                        {
                            message=in.readUTF();
                            System.out.println("sev :  "+message);
                                
                        }
			//socket.close();
		}
		catch(IOException e)
		{e.printStackTrace();}
        }
	public String getMyIP()
	{ InetAddress ip; String s="127.0.0.1";
	try{
		ip=InetAddress.getLocalHost();
		s=ip.getHostAddress();
	}
	catch(UnknownHostException e)
	{e.printStackTrace();}
	return s;
	}
	
	

}

