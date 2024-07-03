import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Display {

    // inject stack
    private static Stack stack = new Stack();
    
    private static Scanner scanner = new Scanner(System.in);

    public void display() throws IOException {
        while(true) {

            // input dialog
            // String choice = JOptionPane.showInputDialog("1.New site\n2. Previous site\n3. Exit");
            
            System.out.println("_________________________\n1-> New site URL\n2-> Previous site URL\n3-> Exit");
            String choice = scanner.nextLine();

            if(choice.equals("1")) {
                System.out.print("Enter site URL: ");
                String url = scanner.nextLine();
                System.out.println();
                add_site(url);
            } else if(choice.equals("2")) {

                System.out.println("Previous site: "+ stack.pop());
                System.out.println();
                
            } else if(choice.equals("3")) {
                System.out.println("Exiting...");
                scanner.close();
                break;
            } else {
                // JOptionPane.showMessageDialog(null, "Invalid choice");
                System.out.println("Invalid choice");
            }
        }  
    }

    public void readFile() throws IOException{
        // function read file pasing the file as string 
        BufferedReader reader = new BufferedReader(new FileReader("history.txt"));
        String line;
         
        while ((line = reader.readLine()) != null) {
            
            stack.push(line);
        }
        reader.close();
    }

    public static void add_site(String url){
        
        stack.push(url);
    }
}
