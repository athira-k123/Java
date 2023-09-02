import java.net.*;
import java.util.Scanner;
class URLExample
{
public static void main(String[] args) throws Exception
	{
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the URL");
	URL url=new URL(in.next());
	System.out.println("protocal is:"+url.getProtocol());
	System.out.println("host name is:"+url.getHost());
	System.out.println("port number is:"+url.getPort());
	System.out.println("path is:"+url.getPath());
    System.out.println("file is:"+url.getFile());
	System.out.println(url);
	}
}
