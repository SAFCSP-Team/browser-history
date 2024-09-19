import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.Stack;

class BrowserHistory{
    Stack<String> Stack = new Stack<String>();

    BrowserHistory(){
        try {
      File myObj = new File("G:\\My Drive\\programing\\java\\dataStructure\\examProjects\\advanceProjects\\browser-history\\src\\history.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        Stack.add(data);
      
        
    }myReader.close();}catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
}
    
    
  public void printAll(){
  
    for(int x =0; Stack.size() >x; x++){
      System.out.println(Stack.get(x));
    }

    }

    
  
  public void previousUrl(){
    if(Stack.firstElement() == Stack.lastElement()){
        System.out.println("going back is impossible");
    }else{
        System.out.println("Previous site: " +Stack.lastElement());
        Stack.pop();
        
        


    }
  }
  public void add(String url){
    Stack.add(url);
  }
  public void update() throws IOException{
    String f = "G:\\My Drive\\programing\\java\\dataStructure\\examProjects\\advanceProjects\\browser-history\\src\\history.txt";
    File temp = new File(f);
    FileWriter file = new FileWriter(f);

if (temp.exists()) {
    RandomAccessFile raf = new RandomAccessFile(temp, "rw");
    raf.setLength(0);
    raf.close();
    for(int x =0 ; Stack.size() >x; x++){
        file.write(Stack.get(x) + "\n");
        
    }file.close();
    System.out.println("Goodbye...");
  }

  

}}
