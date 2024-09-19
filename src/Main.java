import java.io.*;
import java.util.Scanner;

class Main {


    public static void main(String [] args) throws IOException{
            BrowserHistory obj = new BrowserHistory();
            Scanner mainScreen = new Scanner(System.in); 
            Scanner scannerUrl = new Scanner(System.in); 

            
            while (true) {
                
                try {
                    System.out.println("URL history tracker program\r\n" + //
                "Enter your choice\r\n" + //
                "_________________________\r\n" + //
                "1-> Print all the URL\r\n" + //
                "2-> Add a new URL\r\n" + //
                "3-> Return the last URL\r\n" + //
                "4-> Exit");
                int userInput = mainScreen.nextInt();
                    if(userInput == 1){
                        obj.printAll();
                    }if(userInput ==2){
                        System.out.print("Enter site URL: ");
                       String url = scannerUrl.nextLine();
                        obj.add(url);
                    }if(userInput == 3){
                        obj.previousUrl();
                  }if(userInput == 4){
                        obj.update();
                        break;
                    }
                }catch (Exception e) {
                    System.out.println("Invalid input." + "\n" + e);
                    mainScreen.next();}
}
}}
