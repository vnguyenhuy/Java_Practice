package animal;

import java.util.Scanner;

class Main {

  public static int FirstFactorial(int num) {
    // code goes here
    if(num > 1) {
      return num*FirstFactorial(num - 1);
    } 
    else return 1;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    int num = Integer.parseInt(s.nextLine());
    System.out.print(FirstFactorial(num)); 
  }

}
