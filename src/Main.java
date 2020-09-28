public class Main {

    public static void main(String[] args) {
        ShapeTest.run();
        DogTest.run();

        Ball football_ball = new Ball("football", 15);
        System.out.println(football_ball.toString());

        Book book = new Book("book", 300);
        System.out.println(book.toString());
    }
}
