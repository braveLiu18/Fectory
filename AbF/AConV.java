package AbF;

public class AConV implements AFruitAndVegetable{

	@Override
	public Fruit CreateF() {
		// TODO Auto-generated method stub
		return new Apple();
	}

	@Override
	public Vegetable CreateV() {
		// TODO Auto-generated method stub
		return new tomato();
	}
	 
}
