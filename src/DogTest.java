public class DogTest {
    public static void run() {
        Dog[] dogs = new Dog[10];
        for (int i = 0; i < 10; i++) {
            dogs[i] = new Dog();
            dogs[i].setName("Dog#" + i);
            dogs[i].setAge(i);
            System.out.println(dogs[i].toString());
        }

        for (int i = 0; i < 10; i++) {
            dogs[i].humanAge();
            System.out.println(dogs[i].toString());
        }
    }
}
