
//Client
import java.net.*;
import java.util.Scanner;
class UDPClient {
	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket();
			String str1,str;
			do{
				Scanner sc = new Scanner(System.in);
				System.out.print("CLIENT Enter message : ");
				str = sc.nextLine();
				byte[] b = str.getBytes();
				InetAddress ia = InetAddress.getLocalHost();
				DatagramPacket dp = new DatagramPacket(b,b.length,ia,1234);
				ds.send(dp);
				if(str.equals("Bye"))
					break;
				
				byte b1[] = new byte[1024];
				DatagramPacket dp1 = new DatagramPacket(b1,b1.length);
				ds.receive(dp1);
				str1 = new String(b1);
				System.out.println("Message from SERVER is: "+str1);
				str1=str1.trim();
				if(str1.equals("Bye"))
					break;
			} while(true);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
