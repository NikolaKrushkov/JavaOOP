public class main {
        public static void main(String[] args) {
            Dog dog = new Dog();
            Mammal mammal = new Dog();
            Animal animal = new Dog();
            animal.eat("meat");
            Puppy puppy = new Puppy();
            dog.bark();
            puppy.bark();
            if(animal instanceof Dog) {
                ((Dog) animal).bark();
            }
        }
    }

