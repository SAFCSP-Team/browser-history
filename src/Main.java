import java.io.IOException;

public class Main {

    static Display display = new Display();
    
    static Stack stack = new Stack();

    public static void main(String[] args) throws IOException {

        display.readFile();
        display.display();
    }
}