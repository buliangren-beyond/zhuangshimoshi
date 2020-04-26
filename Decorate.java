package zhuangshi;

public class Decorate implements BirthdayCake{
	private BirthdayCake birthdayCake;
	public Decorate(BirthdayCake birthdayCake) {
		this.birthdayCake = birthdayCake;
	}
	public void show() {
		birthdayCake.show();
	}
}
