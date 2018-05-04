import java.io.*;
class hello
{
    public static void main(String args[])throws IOException
    {
        int n;
        DataInputStream dis = new DataInputStream(System.in);
        n=Integer.parseInt(dis.readLine());
        for(int i=1;i<=n;i++)
        {
            System.out.println("Hello");
        }
    }
}

