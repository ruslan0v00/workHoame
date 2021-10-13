package peaksoft.school;

public class Lion implements Animal {
    private String breed;
    private String colorLion;
    private int age;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "breed='" + breed + '\'' +
                ", colorLion='" + colorLion + '\'' +
                ", age=" + age +
                '}';
    }

    public String getColorLion() {
        return colorLion;
    }

    public void setColorLion(String colorLion) {
        this.colorLion = colorLion;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Lion() {
    }

    @Override
    public String animalPlus() {
      return   "animalLionMinus";
    }

    @Override
    public String animalMinus() {
        return "animalLionMinus";
    }
}
