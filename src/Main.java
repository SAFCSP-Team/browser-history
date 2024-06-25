import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        Stack stack = new Stack();

        // Open the file
        BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
        String line;
        // Define the email pattern
        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}");
        // Read each line of the file
        while ((line = reader.readLine()) != null) {
            // Find matches within the line
            Matcher matcher = emailPattern.matcher(line);
            while (matcher.find()) {
                // Print each found email
                stack.push(matcher.group());
            }
        }
        // Close the reader
        reader.close();

        String filePath = "example.txt";
        
        try {
            // Step 3: Use FileWriter to create and write to the file
            FileWriter writer = new FileWriter(filePath);
            
            // Print the emails in reverse order
            String email;
            while (stack.peek() != null) {
                email = stack.pop();
                writer.write(email + "\n");
            }
            // Step 5: Close the FileWriter
            writer.close();
            
            System.out.println("File created successfully: " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        
    }
}