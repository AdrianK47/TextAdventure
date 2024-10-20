import java.util.*;

public class TextAdventure 
{
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;
  Timer timer = new Timer();

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 600, 800);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Bob", 100, 0);
  }

  public void play()
  {
    String input;
    // start of adventure. You can change this if you like
    console.setImage("title.png");

    // ask the user for their name.
    System.out.println("What is your name?\n");
    input = inScanner.nextLine();

    // Change ourHero's name
    // ADD CODE HERE
    ourHero = new Player(input, 100, 0);


    // describe the starting situation. Feel free to change this
    System.out.println("Long ago, two races rules over Earth: HUMANS and MONSTERS. \nOne day, war broke out between the two races. \nAfter a long battle, the humans were victorious. \nThey sealed the monsters underground with a magic spell. \nMany years later... \nLegends say that those who climb the mountain never return.\n You, a human wandered into the mountain and tripped into a hole, falling all the way down.");
    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE
    System.out.println("You wake up in a room with light shining from a hole at the celing of the room. In front of you, there is an gate with a omnious presence looming outward. \n" + "What would you like to do? \n" + "Continue: go forward into the dark \n" + "Nap: go back to sleep and give up escaping\n" + ourHero.getName() + ":");
    input = inScanner.nextLine();

    if(input.equals("Continue")){
      enterZone1();
    }
  }

  private void enterZone1()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  }

  private void enterZone2()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone3()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone4()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone5()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone6()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void gameEnd()
  {
    // ADD CODE HERE

    inScanner.close();
  }
}