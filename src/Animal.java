public class Animal {
    private double weight;
    private Integer age;
    private String name;

    public void walk(){
        System.out.println("животное идет по земле");
    }

    public Animal() {
    }

    public Animal(double weight, Integer age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
