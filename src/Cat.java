public class Cat extends Pet { //inheritance: inherits the properties and definitions of pet class
    public Cat(String name, int age) {
        super(name, age, 8);
    }

    //polymorphism in java: an object can have many forms
    //taking selfdescribe() method from pet and creating another form of it!
    @Override
    public String selfDescribe() {
        //here fun cat ready to party is added to the suffix of the ancestor class
        return "Fun cat ready to party " + super.selfDescribe(); //super means immediate ancestor
    }
}
