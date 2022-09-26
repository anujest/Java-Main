public class B  extends A{
    static int b=m3();
    static {
        System.out.println("Sample static block");
    }
 int y=m4();
 {
     System.out.println("Sample non static block");
 }
 B(){
     System.out.println("Smaple Constructor");
 }
 static int m3() {
     System.out.println("Sample static block is created");
     return 30;
 }
 int m4() {
     System.out.println("Samplne non Static block is created");
     return 40;
 }
  void abc() {
      System.out.println("Sample abc");
  }
  public static void main(String[] args) {
      System.out.println("simple main");
B b=new B();
b.abc();
b.bbc();
            
}
}