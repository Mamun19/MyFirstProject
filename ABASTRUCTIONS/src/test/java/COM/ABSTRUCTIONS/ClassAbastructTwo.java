package COM.ABSTRUCTIONS;

public class ClassAbastructTwo extends ClassAbstructions {
	
	
	
	public void AmazonCom() {
		System.out.println("helo java");
	}
	public static void main(String[] args) {
		ClassAbastructTwo obj=new ClassAbastructTwo();
		obj.AmazonCom();
		obj.getName();
		obj.getID();
		
		
	}
	@Override
	public void getName() {
		System.out.println("I am completed");
	}
	@Override
	public void getID() {
		System.out.println("I am completed too");
		
	}

}
