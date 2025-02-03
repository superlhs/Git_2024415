/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024415;

import java.util.Scanner;

/**
 *
 * @author Low Hung Seong
 */
public class Git_2024415 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Low Hung Seong - 2024415");
    


Scanner myKB = new Scanner (System.in); //create a scanner
       
       String name; //assign a name for string variable to store user name
       //To get input from user and make sure it is text only
       //No numbers and symbol allowed
       //If the input is not valid - ask the user to try again and give an error  
        
        while(true) {
             System.out.println("Please enter your name"); //prompt user too enter their name
             System.out.println("You must enter letters only, no numbers and sysmbols are allowed"); //prompt user to enter text only
             name = myKB.nextLine();
           
             if (!name.matches("[a-zA-Z]")){ //Validate the inpt to make sure it contains only letters
             break; 
             }else {
                 System.out.println("Name cannot caontain number or special character. Please try again");
             } //Error message
         }
             
         //string methods
         name = name.toLowerCase(); //convert name to lowercase
        
         String FirstLetter = name.substring(0,1).toUpperCase(); //convert first letter to uppercase
         
     System.out.println(FirstLetter + name);
    }
}
