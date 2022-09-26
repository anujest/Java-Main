
public class divide {
	
public static void main(String[] args) {
//	int a=1;
//	int b=2;
//	float result;
//	result=(float)a/b;
	
//	System.out.printf("\n%.6f",result);
//	System.out.print(result);
//	System.out.print(result+"\n");
	try {
		Float f=new Float("3.0");
		int x=f.intValue();
		byte b1=f.byteValue();
		double d=f.doubleValue();
		System.out.println(x+b1+d);
		
	}catch (Exception e) {
		e.printStackTrace();
		
	}
	
}
}
