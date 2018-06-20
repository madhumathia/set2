import java.io.*;
class armstrong
{
    public static void main(String args[])throws IOException
    {
        int c=0,a,temp1,temp2,i,n=0;
        DataInputStream dis = new DataInputStream(System.in);
       // int n = Integer.parseInt(dis.readLine());
        int n1 =Integer.parseInt(dis.readLine());
        int n2=Integer.parseInt(dis.readLine());
        for(i=n1+1;i<n2;i++)
        {
            temp1 =i;
            temp2=i;
            while(temp1!=0)
            {
                temp1=temp1/10;
                n++;
            }
            while(temp2!=0)
            {
                a=temp2%10;
                c=c+(a*a*a);
                temp2=temp2/10;
            }
        if(c==i)
        {
            System.out.println(i);
        }
        n=0;
        c=0;
        }
    }
    
}


