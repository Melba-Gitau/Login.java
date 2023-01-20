import java.io.*;
import java.util.*;
public class Main
{
      public static void main(String[]args){
    try{
      File user = new File("Login.txt");
      if(user.createNewFile()){
          System.out.println("File creted.");
      }else{
          System.out.println("File already exists.");
      }
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name: ");
      String  name = sc.nextLine();
      System.out.println("Enter yr pin: ");
      int x = sc.nextInt();
      
      
      FileWriter enter = new FileWriter("Login.txt");
      enter.write(name);
      enter.write(x);
      enter.close();
      
      //to read 
      File reader = new File("Login.txt");
      Scanner y = new Scanner(reader);
      while(y.hasNextLine()){
          String data = y.nextLine();
          int num = y.nextInt();
          System.out.println(data);
      }
      y.close();
	}catch(Exception e){
	    System.out.println("Error established");
	}
}
}
