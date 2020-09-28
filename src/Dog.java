public class Dog {
    String name;
    int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void humanAge() {
        this.age = this.age * 7;
    }

    public String toString() {
        return "Dog's name is: " + this.name + "\nDog's age is: " + this.age;
    }
}
