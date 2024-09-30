import java.util.*;
abstract class Bank
{
    protected double balance;
    public abstract double getbalance();
}
class bank1 extends Bank
{
    public bank1(double balance)
    {
        this.balance=balance;
    }
    public double getbalance()
    {
        return balance;
    }
}
public class test
{
    public static void main(String[] args)
    {
        Bank b1= new bank1(100);
        System.out.println(b1.getbalance());
    }
}