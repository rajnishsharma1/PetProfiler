public class Dog extends Pet { //inheritance: inherits the properties and definitions of pet class
    public Dog(String name, int age) {
        super(name, age, 7);
    }

    //polymorphism
    @Override
    public String selfDescribe() {
        return "Fun Dog looking to make friends! " + super.selfDescribe(); //immediate ansestor
    }
}
