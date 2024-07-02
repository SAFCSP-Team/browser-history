import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;


public class Main {

    static Display display = new Display();
    
    static Stack stack = new Stack();

    public static void main(String[] args) throws IOException {


        // function read file pasing the file as string 
        BufferedReader reader = new BufferedReader(new FileReader("history.txt"));
        String line;
         
        while ((line = reader.readLine()) != null) {
            
            stack.push(line);
        }
        
        reader.close();

        while(true) {

            // input dialog
            String choice = JOptionPane.showInputDialog("1. Add site\n2. Navi\n3. Exit");
            break;
        }

        
        // add site
        add_site("https://safcsp.org.sa");

        // display url history
        while(stack.peek() != null){
            System.out.println(stack.pop());
        }
    }

    public static void add_site(String url){
        stack.push(url);
    }
}