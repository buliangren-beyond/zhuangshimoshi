package zhuangshi;

public class Cream extends Decorate{
	public void putCream() {
		System.out.println("add Cream");
	}
	
	public Cream(BirthdayCake birthdayCake) {
		super(birthdayCake);
	}
}
