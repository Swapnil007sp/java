public class Q6 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.makeSound();

		Cat c1 = new Cat();
		c1.makeSound();
	}
}

abstract class Animal {
	abstract void makeSound();
}

class Dog extends Animal {
	public void makeSound() {
		System.out.println("Method from Dog Class");
	}
}

class Cat extends Animal {
	public void makeSound() {
		System.out.println("Method from Cat Class");
	}
}