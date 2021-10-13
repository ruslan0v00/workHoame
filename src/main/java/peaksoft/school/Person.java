package peaksoft.school;

public class Person {
    private Animal animal1;


    @Override
    public String toString() {
        return "Person{" +
                "animal1=" + animal1 +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAnimal1(Lion animal1) {
        this.animal1 = animal1;
    }

    public void animalMinus() {
        System.out.println(animal1.animalMinus());
    }

    public void animalPilus() {
        System.out.println(animal1.animalPlus());
    }

    public Person(Lion animal1) {
        this.animal1 = animal1;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

}
