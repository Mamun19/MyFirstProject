package COM.ABSTRUCTIONS;

public class NewConstructor2 extends NewConstructor1 {
	
	int b;
	
	
	NewConstructor2(){
		
		System.out.println("I am extending super keyword");
		
	}
	
	
	NewConstructor2(int number, int num){
		super(number);
		b=num;
		
		System.out.println("I am trying to geting B" + b);
		
	}
	
		public static void main(String[] args) {
			NewConstructor2 obj1 = new NewConstructor2();	
		NewConstructor2 obj = new NewConstructor2(100,200);
		
		
		}
	
	
	
	

	
	

}
