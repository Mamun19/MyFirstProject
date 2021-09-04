package COM.ABSTRUCTIONS;

public class ConstructorClass {
	ConstructorClass(){
		
	}
	
	ConstructorClass(int salary){
		System.out.println("my salary:"+salary);
		
	}
	
	public static void main(String[] args) {
		
		ConstructorClass obj1 = new ConstructorClass();
		
		ConstructorClass obj=new ConstructorClass(100);
		
		
		
	}

}
