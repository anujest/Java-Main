public class A {
    
    static int a=m1();
    static {
        System.out.println("Example SB");
    }
    int x=m2();
    {
        System.out.println("Example NSB");
    }
    A(){
        System.out.println("Example of constructor");
    }
static int m1() {
    System.out.println("Example static block is created");
    return 10;
}
int m2() {
    System.out.println("Example non static block is created");
    return 20;
}
void abc() {
    System.out.println("Example abc");
}
void bbc() {
    System.out.println("Example bbc");
}
}