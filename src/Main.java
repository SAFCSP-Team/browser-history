import java.io.*;
import java.util.Scanner;

class Main {


    public static void main(String [] args) throws IOException{
            BrowserHistory obj = new BrowserHistory();
            Scanner myObj = new Scanner(System.in); 
            Scanner o = new Scanner(System.in); 

            
            while (true) {
                
                try {
                    System.out.println("URL history tracker program\r\n" + //
                "Enter your choice\r\n" + //
                "_________________________\r\n" + //
                "1-> Print all the URL\r\n" + //
                "2-> Add a new URL\r\n" + //
                "3-> Return the last URL\r\n" + //
                "4-> Exit");
                int mainScreen = myObj.nextInt();
                    if(mainScreen == 1){
                        obj.printAll();
                    }if(mainScreen ==2){
                        System.out.print("Enter site URL: ");
                       String url = o.nextLine();
                        obj.add(url);
                    }if(mainScreen == 3){
                        obj.previousUrl();
                  }if(mainScreen == 4){
                        obj.update();
                        break;
                    }
                }catch (Exception e) {
                    System.out.println("Invalid input." + "\n" + e);
                    myObj.next();}
}
}}
