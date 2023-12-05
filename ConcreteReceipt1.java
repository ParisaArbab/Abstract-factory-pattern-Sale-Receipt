//
import java.util.Scanner;
//package RECEIPT;
public class ConcreteReceipt1 extends Header1{
    Footer1 f;
    public void r1_body()
    {
        h1_body();
        System.out.println("Receipt body1");
        System.out.println("Footer1");
        f.f1_body();
    }
}


