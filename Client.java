package zhuangshi;
//в╟йндёй╫
public class Client {
	public static void main(String args[]) {
		BirthdayCake cake = new Cake();
		Cream cream = new Cream(cake);
		cream.putCream();
		Fruit fruit = new Fruit(cream);
		fruit.add();
		fruit.show();
	}
}
