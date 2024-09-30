import java.util.*;
class comparison
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string : ");
        String s1=sc.next();
        System.out.println("enter second string : ");
        String s2=sc.next();
       int l1=s1.length();
       int  l2=s2.length();
       int min;
        String s="";
        if(l1<=l2)
        {
            min=l1;
        }
        else
        {
            min=l2;
        }
        for(int i=0;i<min;i++)
        {
            s=s+s1.charAt(i)+s2.charAt(i);
        }
        if(min==l1)
        {
            s=s+s2.substring(min-1);
        }
        else
        {
            s=s+s1.substring(min-1);
        }
        System.out.println(s);
    }
}