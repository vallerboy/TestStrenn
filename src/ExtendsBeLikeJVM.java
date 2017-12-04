public class ExtendsBeLikeJVM {
    {
        System.out.println("Jestem iniszjalajzerem :)");
    }
    //TestInit2 testInit2 = new TestInit2();
    public ExtendsBeLikeJVM(){
        System.out.println("Jestem konstruktorem TestInit");
    }
    public static void main(String[] args) {
        System.out.println("Jestem mainem");
        new TestInit2();
    }}
class TestInit2 extends TestInit{
    static { System.out.println("static init testInit2"); }
    { System.out.println("tutaj juz zglupniecie"); }
    static TestInit2 testInit2 = new TestInit2();
    public TestInit2(){
        System.out.println("Konstruktor z testinit2");
    }}
