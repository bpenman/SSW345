
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore nyStore = new NYPizzaStore();
		nyStore.orderPizza("cheese");
		
		PizzaStore chStore = new ChicagoPizzaStore();
		chStore.orderPizza("veggie");
	}

}
