import java.net.*;
import java.util.Scanner;
class UDPServer{

	
	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(1234);
			String str,str1;
			do
			{
				byte[] b = new byte[1024];
				
				DatagramPacket dp = new DatagramPacket(b,b.length);
				ds.receive(dp);
				str = new String(b);
				System.out.println("Message from CLIENT is "+str);
				str=str.trim();
				if(str.equals("Bye"))
					break;
				
				Scanner sc = new Scanner(System.in);
				System.out.print("SERVER Enter message : ");
				str1 = sc.nextLine();
				byte[] b1 = str1.getBytes();
				InetAddress ia = InetAddress.getLocalHost();
				DatagramPacket dp1 = new DatagramPacket(b1,b1.length,ia,dp.getPort());
				ds.send(dp1);
				if(str1.equals("Bye"))
					break;
			}while(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
