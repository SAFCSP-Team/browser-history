import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    static Display display = new Display();

    public static void main(String[] args) throws IOException {

        Stack stack = new Stack();

        // function read file pasing the file as string 
        BufferedReader reader = new BufferedReader(new FileReader("history.txt"));
        String line;
         
        while ((line = reader.readLine()) != null) {
            
            stack.push(line);
        }
        
        reader.close();

        // add url sites 
        display.addSite("https://iabdulmalik.com");
        
        // display url history
        while(stack.peek() != null){
            System.out.println(stack.pop());
        }
    }
}