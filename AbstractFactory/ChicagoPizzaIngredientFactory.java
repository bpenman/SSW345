
public class ChicagoPizzaIngredientFactory {
	 
		public Dough createDough() {
			return new ThickCrustDough();
		}
	 
		public Sauce createSauce() {
			return new PlumTomatoeSauce();
		}
	 
		public Cheese createCheese() {
			return new MozarellaCheese();
		}
	 
		public Veggies[] createVeggies() {
			Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
			return veggies;
		}
	 
		public Pepperoni createPepperoni() {
			return new SlicedPepperoni();
		}

		public Clams createClam() {
			return new FrozenClams();
		}
}
