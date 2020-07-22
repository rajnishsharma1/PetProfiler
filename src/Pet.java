public class Pet {
    //properties
    private String name = "";
    private int age = 0;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private int ageMultiplier = 1;

    //used inheritance to specialize in pet class for the descendant cat and dog
    public Pet(String name, int age, int ageMultiplier) {
        this.name = name;
        this.age = age;
        this.ageMultiplier = ageMultiplier;
    }

    public String selfDescribe() {
        return "Hello my name is " + name + ". And I am " + calculateRealAge() + " in human years!";
    }
    public int calculateRealAge(){
        return age * ageMultiplier;
    }
}
