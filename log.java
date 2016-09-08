/****************************************************************************
 *
 * Created by: Perry Martin
 * Created on: Sept 8 2016
 * This program calculates the number of logs that will fit on a truck,
 *     if you know their length
 *
 ****************************************************************************/


// for input
import java.util.Scanner; 



class Main {
  public static void main(String[] args) {
   
  // Name of scanner and setup 
  Scanner input = new Scanner(System.in);
  
  System.out.println("select lenght of log: 1 = 1m ,2 = 0.5m , 3 = 0.25");
  int lenghtOfLogs = input.nextInt();
  
  // this was just to see if the iput worked
 // System.out.println(lenghtOfLogs);
  
  // I used switch just to try something new (codecademy)
   switch (lenghtOfLogs) { 
   	
   	case 1 : System.out.println("You can hold 55 logs on the truck");
   	break;
   	
   	case 2 : System.out.println("You can hold 110 logs on the truck");
   	break;
   	
   	case 3 : System.out.println("You can hold 220 logs on the truck");
  	break;
  	
   }
   
   //End
   
   
   
  }
}
