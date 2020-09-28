import java.util.Scanner;

public class Shape {

    int width, height;
    String type;

    public Shape() {
    }

    public Shape(int width, int height, String type) {
        this.width = width;
        this.height = height;
        this.type = type;
    }

    public void setValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose type of the shape: " + "\n"
                + "1)Triangle" + "\n"
                + "2)Square" + "\n");

        int input = scanner.nextInt();
        switch (input) {
            case 1:
                this.type = "triangle";
                break;
            case 2:
                this.type = "square";
                break;
            default:
                throw new IllegalArgumentException("This type is not found :(");
        }

        System.out.println("Print height of the shape:");
        this.height = scanner.nextInt();
        System.out.println("Print width of the shape:");
        this.width = scanner.nextInt();
    }

    public String toString() {
        if (type == "square") {
            return "Square" + "\nHeight: "
                    + height + "\nWidth: " + width +
                    "\nArea: " + height * width;
        } else {
            return "Triangle" + "\nHeight: "
                    + height + "\nBase: " + width +
                    "\nArea: " + height * width * 0.5;
        }
    }
}
