public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(5.5, 4,"Melice");
        dog.move();
        dog.walk();

        Bird bird = new Bird(2.2, 1, "Cannard");
        bird.move();
        bird.walk();
        //todo Реализовать класс Утка и Собака по описанным в ТЗ правилам.
    }
}
