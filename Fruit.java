package zhuangshi;

public class Fruit extends Decorate{
	public void add() {
		System.out.println("add Fruit");
	}
	public Fruit(BirthdayCake birthdayCake) {
		super(birthdayCake);
	}
}
