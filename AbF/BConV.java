package AbF;

public class BConV implements BFruitAndVegetable {
	public Fruit CreateF() {
		return new Banana();
		
	}

    public Vegetable CreateV() {
		return new tomato();
    	
    }
}
