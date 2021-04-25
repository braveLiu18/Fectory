package AbF;

public class BConF implements BFruitAndVegetable {
	public Fruit CreateF() {
		return new Banana();
		
	}

    public Vegetable CreateV() {
		return new tomato();
    	
    }

}
