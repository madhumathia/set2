import java.io.*;
class swap
{
    public static void main(String args[])throws IOException
    {
        int num1,num2,temp;
        DataInputStream dis = new DataInputStream(System.in);
        num1=Integer.parseInt(dis.readLine());
        num2=Integer.parseInt(dis.readLine());
        System.out.println("before Swapping : "+num1+"\t"+num2);
        {
            temp=num1;
            num1=num2;
            num2=temp;
        }
        System.out.println("after swaping : "+num1+"\t"+num2);
        }
}
