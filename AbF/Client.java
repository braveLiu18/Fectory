package AbF;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AFruitAndVegetable fector1 = new AConF();
		AFruitAndVegetable fector2 = new AConV();
		BFruitAndVegetable fector3 = new BConF();
		BFruitAndVegetable fector4 = new BConV();
		fector1.CreateF().eat();
		fector2.CreateV().eat();
		fector3.CreateF().eat();
		fector4.CreateV().eat();
	}

}
