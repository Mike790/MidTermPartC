/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.*;
/**
 *
 * @author XeroS
 */
public class TestUserprofile {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a user ID");
    String userID = input.next();
    System.out.println("Enter a favourite genre. 0 = Comedy, 1 = Drama, 2 = Action, 3 = Mystery");
    int userGenre = input.nextInt();
    
    UserProfile myProfile = new UserProfile(userID, userID);
    myProfile.setGenre(myProfile.genres[userGenre]);
    
    System.out.println("You created a profile with an ID of " + myProfile.getUserID() + " and a favourite genre of " + myProfile.getGenre());
  }
    
}
