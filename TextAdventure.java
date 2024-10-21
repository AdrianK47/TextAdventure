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
    System.out.println("You wake up in a room with light shining from a hole at the celing of the room. In front of you, there is an gate with a ominous presence looming outward. \n" + "What would you like to do? \n" + "Continue: go forward into the dark \n" + "Nap: go back to sleep and give up escaping\n" + ourHero.getName() + ":");
    input = inScanner.nextLine();

    if(input.equals("Continue") || input.equals("continue")){
      enterZone1();
    }
    else{
      gameEnd();
    }
  }

  private void enterZone1()
  {
    String input;
    // change image
    // ADD CODE HERE

    // Place the hallway drawing here.

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You go through the ominous gate. As you continue walking through, you see a lit room with a patch of flowers... Except, one flower looks awfully unnatural. \n" + "What would you like to do? \n" + "Continue: go forward to the flower patch \n" + "Return: go back to the previous room and give up escaping\n" + ourHero.getName() + ":");
    input = inScanner.nextLine();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    if(input.equals("Continue") || input.equals("continue")){
      enterZone2();
    }
    else{
      gameEnd(); 
    }
  }

  private void enterZone2()
  {
    String input;
    // change image
    // ADD CODE HERE

    // Place the flower patch drawing here.

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You walk up to the flower patch, where your suspicion was true. The yellow flower in the middle has a face!");
    System.out.println("The flower speaks: ");
    //System.out.println("Hey are you a human?") Keep or change this with the actual dialouge with flowey.
    //Also make different pictures to make flowey talking more fluid.

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    System.out.println("The flower asks you a favor: Defeat the foes ahead. \n" + "What would you like to do? \n" + "Accept: accept the flower's quest \n" + "Refuse: y̷̳̜̩̬̟̠͔̣̣̍͒Ŏ̷͇͊̿̈́u̷̢̡̢̙͎͇̫̳̗̳̠̻̰̬̒̌͒̑̂̒̈́ ̶̡̦̼͕̜̭̠̠̿̌̿͜M̶̬̩̟̭͙̿͆̋̅̚͜ĭ̷͕̺̩̾Ģ̷̢͈͓̟̭̖̳̖͐̒̾͒̑̇̊̀͛̃̑̋̈́̓̊̕͘ḧ̷̡͖̱̘̭͓͔̩̰́̀̃̈̂̎̿̎̇̃̚̚̚͝͝͠ͅT̷̢̨̡̡̳͉̱̐͊͌̀͋̾̅̆̑͌̿́͋͗̚ͅ ̷̨̡̧̧̧̮̲̫̺̟͇̦̺̙̩͌͒̔͌n̵̖̈́̊O̶̢̜̝̝̭̠͍̼̫̻̫̩̪͗͆̿̆̀̀͌̓̆̍̍̾͘̕͘͝͝t̴̤̹̬̽̿͂̃͌̅̔̕͜͠ ̸͓̤͓͍͔͍̭̞̭̞̬̎̂̒̈́̊̐̌͘͜M̵̡̛̛̦̰̪̻̖̮̩͖͚̝̞̭̮̬̟̏͆͑́́̒̀͊̈́̈͛̀̏̾̕a̷̧̨̧̨͚̰̳̥͈̼̞͖̻͓̯̘͆͋͒̌͗̃͋̀̑̽̀̈́̕͠K̷͇͓̦̬̊e̵͔̤̰͒̅̈̀͒̋̂̽̈́̅͝ ̵̯̻̙̌̍̽͒̄́̾̈́͌I̶̢̡̡̡̨̲̙̯͎̣̪͉̱̙̬͉̟͊́̓̽͐̇̐̽͋͐̍̽̐͘͝t̴̡̠̬͚̋̈́̋̋͋̄͌͝ ̷̭̣̭͚͆̒̉̍͆̿͒͊̾̉̃̃́̇Ö̵̧̞̯̖̜̰̘̖̘̕͜͜u̷̢̧̙̪̰̺̼̹̼͛͗̀̉̉͐̀ͅT̸̩̯̃͋̆̅̇̀͜ ̷̠̰̟̇͂̈͋̚ơ̶̟̞̘͚͛̑̊̊̑̍̌̓͂̅̑F̵̨͔͇͙͔͈͈͚̤̻͍̝̿ ̸̧̛̼̯͙̲̝̝̬̱̳̭̟̜̠̹̈́̍̂̂͗͐͛͜͜t̵̛̜̝̟͉͚̦̳͚̦͔̯̀̓̈́͂͛͐̽̈̂́͆̾́͐͊͜H̷̩͌͛̐͐̑͂̃̓͘͝ĕ̴̺̫̱̞̀͑̇̑͑͒̽̒͝͝ ̶̢̛̮̩͙̘̥̜̺̆̍̀͌̃̀͒̐̆͠͝ͅR̶̡̙̯͔͓̔̆̅͑̿͘͘̚o̷̮͓̙̭̱͔͖̠͍̜͎͙̹̤͇̐́́̄͑̋̔̍͘͘Ơ̴̢̋͆̐͆̽̈̋̅̃̍͐̅̈́͑̓͝m̸̡̰͎̱̤̫̜̝̣͎̝͑́̍̈́̀ ̸̡̡̰̹͈͔̗̹̗͉͚͔̘͕̊̅̒͗̽͂͗̇̕A̵͈̬͇͌͌͊́̆̔͑͒́́́͝͝l̷̢̧͖̺̯͉̦̙̻̓̽ͅI̸̪̗͚̟̠̖̮̺̣̭̤̖̣̱͗́̎̿̎̽̉̀̔͐͘͝ͅv̷̜̖͎͈͋̎̆̐͋̇̽Ẻ̸̻̜̓́̇̆̀̒̑̔̾͌͂͒̏.̷̬̩͙̲̆͊̈́̋͊̕\n" + ourHero.getName() + ":");
    input = inScanner.nextLine();

    if (input.equals("Accept") || input.equals("accept")){
      enterZone3();
    }
    else{
      
    }
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

    // Add the first ending picture
    System.out.println("You give up escaping and continue to cry for help...");
    System.out.println("...");
    System.out.println("...");
    System.out.println("...");

    inScanner.close();
  }
}