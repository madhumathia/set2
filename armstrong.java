import java.io.*;
class armstrong
{
    public static void main(String args[])throws IOException
    {
        int c=0,a,temp;
        DataInputStream dis = new DataInputStream(System.in);
        int n = Integer.parseInt(dis.readLine());
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
        {
            System.out.println("armstrong number");
        }else
        {
            System.out.println("not an armstrong number");
        }
    }
}
