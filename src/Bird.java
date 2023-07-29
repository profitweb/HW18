public class Bird extends Animal{
    public Bird() {
    }

    public Bird(double weight, Integer age, String name) {
        super(weight, age, name);
    }

    public void move(){
        System.out.println("Утка по кличке " + super.getName() + " летит в облаках .");
    }


}
