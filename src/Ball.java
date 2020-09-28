import java.util.Scanner;

public class Ball {
    String type;
    int size;

    public Ball() {
    }

    public Ball(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public void setValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose type of the ball: " + "\n"
                + "1)Football" + "\n"
                + "2)Volleyball" + "\n");

        int input = scanner.nextInt();
        switch (input) {
            case 1:
                this.type = "football";
                break;
            case 2:
                this.type = "volleyball";
                break;
            default:
                throw new IllegalArgumentException("This type is not found :(");
        }

        System.out.println("Print size of the ball:");
        this.size = scanner.nextInt();
    }

    public String toString() {
        return "Ball type: " + this.type + "\n" + "Ball size: " + this.size;
    }
}
