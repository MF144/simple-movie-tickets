import java.util.*;

    
public class Main {

  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    String[] movies = {"Bad Boys for Life", "Beanpole", "Demon Slayer: Infinity Train", "Emma", "Mank", "Tenet"};  
    String[] times = {"7:00 A.M.", "10:00 A.M.", "1:00 P.M.", "4:00 P.M."};
    String[] snacks = {"Burger", "Hotdog", "Ice Cream", "Popcorn"};
    Double[] prices = {249.99, 149.99, 209.99, 209.99,209.99, 249.99};
    int menuChoice, movieChoice, snackChoice, timeChoice, numSeats = 0;
    String chosenMovie = "";
    String chosenSnack = "";
    String chosenTime = "";
    double chosenPrice = 0.0;
    double totalPrice = 0.0;

 do {
    System.out.println("Welcome to the Aetherworld Cinema Online Ticket System!");
    System.out.println("=========================================");
    System.out.println("[1] Choose movie");
    System.out.println("[2] Choose time schedule");
    System.out.println("[3] Choose snacks");
    System.out.println("[4] Choose seats");
    System.out.println("[5] Submit current ticket");
    System.out.println("[6] Exit");
    System.out.println("=========================================");
    System.out.print("Input choice: "); 

    menuChoice = sc.nextInt();

    if (menuChoice == 1) 
    {
      System.out.println("List of available movies:");System.out.println("[1] Bad Boys for Life");System.out.println("[2] Beanpole");System.out.println("[3] Demon Slayer: Infinite Train");
      System.out.println("[4] Emma");
      System.out.println("[5] Tenet");
      System.out.println("[6] Mank");
      System.out.print("Choose your movie: ");
      movieChoice = sc.nextInt();
     
     switch (movieChoice) {
      case 1:
      chosenMovie = movies[0];
      chosenPrice = prices[0];
      break;
      case 2:
      chosenMovie = movies[1];
      chosenPrice = prices[1];
      break;
      case 3:
      chosenMovie = movies[2];
      chosenPrice = prices[2];
      break;
      case 4:
      chosenMovie = movies[3];
      chosenPrice = prices[3];
      break;
      case 5:
      chosenMovie = movies[4];
      chosenPrice = prices[4];
      break;
      case 6:
      chosenMovie = movies[5];
      chosenPrice = prices[5];
      default:
      System.out.println("Invalid entry!");
     }    
    continue;
    }
    
    else if (menuChoice == 2) 
    {
      System.out.println("List of available time slots:");
      System.out.println("[1] 7:00 A.M");
      System.out.println("[2] 10:00 A.M");
      System.out.println("[3] 1:00 P.M");
      System.out.println("[4] 4:00 P.M");
      timeChoice = sc.nextInt();

      switch(timeChoice) {
        case 1:
        chosenTime = times[0];
        case 2:
        chosenTime = times[1];
        case 3:
        chosenTime = times[2];
        case 4:
        chosenTime = times[3];
        default:
        System.out.println("Invalid entry!");
      }
      continue;
    }
    
    else if (menuChoice == 3) 
    {
      System.out.println("List of available time slots:");
      System.out.println("[1] Burger");
      System.out.println("[2] Hotdog");
      System.out.println("[3] Ice Cream");
      System.out.println("[4] Popcorn");    
      snackChoice = sc.nextInt();

      switch(snackChoice) {
        case 1:
        chosenSnack = snacks[0];
        case 2:
        chosenSnack = snacks[1];
        case 3:
        chosenSnack = snacks[2];
        case 4:
        chosenSnack = snacks[3];
        default:
        System.out.println("Invalid entry!");
      }
      continue;
    }
    
    else if (menuChoice == 4) 
    {
      System.out.print("How many seats? "); 
      numSeats = sc.nextInt();
      continue;
    }

    else if (menuChoice == 5)
    {
    totalPrice = chosenPrice * numSeats;
     System.out.println("Verifying your ticket...");
     System.out.println("Movie: " + chosenMovie);
     System.out.println("Price: P" + chosenPrice);
     System.out.println("Snack: " + chosenSnack);
     System.out.println("Time: " + chosenTime);
     System.out.println("Total Price: P" + totalPrice);
     System.out.println("Ticket submitted.");
     continue;
    } 
    

    else if (menuChoice == 6)
    {
      break;
    }
    else 
    {
     System.out.println("Invalid entry!");
     break;
    }
  }  while (menuChoice != 6);
   }
  }
