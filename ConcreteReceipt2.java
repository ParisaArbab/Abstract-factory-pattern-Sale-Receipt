public class ConcreteReceipt2 extends Header2 {
    Footer2 f;

    public void r2_body() {
        h2_body();
        System.out.println("Receipt body2");
        System.out.println("Footer2");
        f.f2_body();
    }
}
