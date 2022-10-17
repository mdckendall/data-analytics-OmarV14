import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {
    
		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Press 1 to learn about salary.\r\nPress 2 to learn about the job.\r\nPress 3 to learn about demand.\r\nPress 4 to view current students.\r\nPress 5 to quit.\r");
    
    int userInput = scan.nextInt();

    while (true) {
      if (!(userInput > 5 || userInput <= 0)) {
      break;
      }
    
    userInput = scan.nextInt(); 
     }
    do {
    if ((userInput <= 5 || userInput > 0)) {
      if (userInput == 1) {
      System.out.println("$98,345 average salary in South Florida!");
      System.out.println("Press 1 to learn about salary.\r\nPress 2 to learn about the job.\r\nPress 3 to learn about demand.\r\nPress 4 to view current students.\r\nPress 5 to quit.\r");
      userInput = scan.nextInt();
    }
    else if (userInput == 2) {
      System.out.println("US News - 100 Best Jobs!");
      System.out.println("Press 1 to learn about salary.\r\nPress 2 to learn about the job.\r\nPress 3 to learn about demand.\r\nPress 4 to view current students.\r\nPress 5 to quit.\r");
      userInput = scan.nextInt();
    }
    else if (userInput == 3) {
      System.out.println("Top 10 Forbes In-Demand Jobs!");
      System.out.println("Press 1 to learn about salary.\r\nPress 2 to learn about the job.\r\nPress 3 to learn about demand.\r\nPress 4 to view current students.\r\nPress 5 to quit.\r");
      userInput = scan.nextInt();
    }
    else if (userInput == 4) {
      System.out.println("Current Students:");
      while (fileScanner.hasNextLine()) {
        String line = fileScanner.nextLine();
        System.out.println(line);
      }
      System.out.println("Press 1 to learn about salary.\r\nPress 2 to learn about the job.\r\nPress 3 to learn about demand.\r\nPress 4 to view current students.\r\nPress 5 to quit.\r");
      userInput = scan.nextInt();
    }
    else if (userInput == 5) {
      return;
    }
      
    }
    } while ((userInput <= 5 || userInput > 0));
      
    }
  }  
    

    
    
  