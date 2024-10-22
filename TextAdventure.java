import java.util.*;
import java.util.concurrent.TimeUnit;

public class TextAdventure 
{
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 600, 800);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Bob", 100, 0);
  }

  public void play() throws InterruptedException
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
    System.out.println("Long ago, two races rules over Earth: HUMANS and MONSTERS.");
    Thread.sleep(5 * 1000);
    System.out.println("One day, war broke out between the two races.");
    Thread.sleep(5 * 1000);
    System.out.println("After a long battle, the humans were victorious.");
    Thread.sleep(5 * 1000);
    System.out.println("They sealed the monsters underground with a magic spell.");
    Thread.sleep(5 * 1000);
    System.out.println("Many years later...");
    Thread.sleep(5 * 1000);
    System.out.println("Legends say that those who climb the mountain never return.");
    Thread.sleep(5 * 1000);
    System.out.println("You, a human wandered into the mountain and tripped into a hole, falling all the way down.");
    Thread.sleep(5 * 1000);
    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE
    console.setImage("beginning.png");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("You wake up in a room with light shining from a hole at the celing of the room. In front of you, there is an gate with a ominous presence looming outward. \n" + "What would you like to do? \n" + "Continue: go forward into the dark \n" + "Nap: go back to sleep and give up escaping\n" + ourHero.getName() + ": ");
    input = inScanner.nextLine();

    if(input.equals("Continue") || input.equals("continue")){
      enterZone1();
    }
    else{
      gameEnd();
    }
  }

  private void enterZone1() throws InterruptedException
  {
    String input;
    // change image
    // ADD CODE HERE

    // Place the hallway drawing here.
    console.setImage("hallway.png");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("You go through the ominous gate. As you continue walking through, you see a lit room with a patch of flowers... Except, one flower looks awfully unnatural. \n" + "What would you like to do? \n" + "Continue: go forward to the flower patch \n" + "Return: go back to the previous room and give up escaping\n" + ourHero.getName() + ": ");
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

  private void enterZone2() throws InterruptedException
  {
    String input;
    // change image
    // ADD CODE HERE

    // Place the flower patch drawing here.

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    console.setImage("flowey.png");
    System.out.println("You walk up to the flower patch, where your suspicion was true. The yellow flower in the middle has a face!");
    Thread.sleep(3 * 1000);
    System.out.println("The flower speaks: ");
    Thread.sleep(3 * 1000);
    System.out.println("Howdy! \nI'm Ferenc\nFerenc the flower!"); //Insert friend's name
    Thread.sleep(3 * 1000);
    System.out.println("Hmmm...");
    Thread.sleep(3 * 1000);
    System.out.println("You're new to the UNDERGROUND, aren' tcha?");
    Thread.sleep(3 * 1000);
    System.out.println("Golly, you must be so confused.");
    Thread.sleep(3 * 1000);
    System.out.println("In this world...");
    Thread.sleep(3 * 1000);
    console.setImage("floweyevil.png");
    System.out.println("It's KILL");
    Thread.sleep(3 * 1000);
    System.out.println("Or be KILLED");
    Thread.sleep(3 * 1000);
    System.out.println("The flower attempts to attack you, however a mysterious person deflects the attack.");
    Thread.sleep(3 * 1000);
    console.setImage("floweyandperson.png");
    Thread.sleep(3 * 1000);
    System.out.println("The person says, yo don't listen to this guy. \nHe's bad news. \n By the way, the name's Ian.");
    //System.out.println("Hey are you a human?") Keep or change this with the actual dialouge with flowey.
    //Also make different pictures to make flowey talking more fluid.

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    Thread.sleep(3 * 1000);
    System.out.println("The flower asks you a favor: Defeat the foes ahead and they will help you escape.\n But the chill dude tells you to not trust the flower\n" + "What would you like to do? \n" + "Accept: accept the flower's quest \n" + "Refuse: y̷̳̜̩̬̟̠͔̣̣̍͒Ŏ̷͇͊̿̈́u̷̢̡̢̙͎͇̫̳̗̳̠̻̰̬̒̌͒̑̂̒̈́ ̶̡̦̼͕̜̭̠̠̿̌̿͜M̶̬̩̟̭͙̿͆̋̅̚͜ĭ̷͕̺̩̾Ģ̷̢͈͓̟̭̖̳̖͐̒̾͒̑̇̊̀͛̃̑̋̈́̓̊̕͘ḧ̷̡͖̱̘̭͓͔̩̰́̀̃̈̂̎̿̎̇̃̚̚̚͝͝͠ͅT̷̢̨̡̡̳͉̱̐͊͌̀͋̾̅̆̑͌̿́͋͗̚ͅ ̷̨̡̧̧̧̮̲̫̺̟͇̦̺̙̩͌͒̔͌n̵̖̈́̊O̶̢̜̝̝̭̠͍̼̫̻̫̩̪͗͆̿̆̀̀͌̓̆̍̍̾͘̕͘͝͝t̴̤̹̬̽̿͂̃͌̅̔̕͜͠ ̸͓̤͓͍͔͍̭̞̭̞̬̎̂̒̈́̊̐̌͘͜M̵̡̛̛̦̰̪̻̖̮̩͖͚̝̞̭̮̬̟̏͆͑́́̒̀͊̈́̈͛̀̏̾̕a̷̧̨̧̨͚̰̳̥͈̼̞͖̻͓̯̘͆͋͒̌͗̃͋̀̑̽̀̈́̕͠K̷͇͓̦̬̊e̵͔̤̰͒̅̈̀͒̋̂̽̈́̅͝ ̵̯̻̙̌̍̽͒̄́̾̈́͌I̶̢̡̡̡̨̲̙̯͎̣̪͉̱̙̬͉̟͊́̓̽͐̇̐̽͋͐̍̽̐͘͝t̴̡̠̬͚̋̈́̋̋͋̄͌͝ ̷̭̣̭͚͆̒̉̍͆̿͒͊̾̉̃̃́̇Ö̵̧̞̯̖̜̰̘̖̘̕͜͜u̷̢̧̙̪̰̺̼̹̼͛͗̀̉̉͐̀ͅT̸̩̯̃͋̆̅̇̀͜ ̷̠̰̟̇͂̈͋̚ơ̶̟̞̘͚͛̑̊̊̑̍̌̓͂̅̑F̵̨͔͇͙͔͈͈͚̤̻͍̝̿ ̸̧̛̼̯͙̲̝̝̬̱̳̭̟̜̠̹̈́̍̂̂͗͐͛͜͜t̵̛̜̝̟͉͚̦̳͚̦͔̯̀̓̈́͂͛͐̽̈̂́͆̾́͐͊͜H̷̩͌͛̐͐̑͂̃̓͘͝ĕ̴̺̫̱̞̀͑̇̑͑͒̽̒͝͝ ̶̢̛̮̩͙̘̥̜̺̆̍̀͌̃̀͒̐̆͠͝ͅR̶̡̙̯͔͓̔̆̅͑̿͘͘̚o̷̮͓̙̭̱͔͖̠͍̜͎͙̹̤͇̐́́̄͑̋̔̍͘͘Ơ̴̢̋͆̐͆̽̈̋̅̃̍͐̅̈́͑̓͝m̸̡̰͎̱̤̫̜̝̣͎̝͑́̍̈́̀ ̸̡̡̰̹͈͔̗̹̗͉͚͔̘͕̊̅̒͗̽͂͗̇̕A̵͈̬͇͌͌͊́̆̔͑͒́́́͝͝l̷̢̧͖̺̯͉̦̙̻̓̽ͅI̸̪̗͚̟̠̖̮̺̣̭̤̖̣̱͗́̎̿̎̽̉̀̔͐͘͝ͅv̷̜̖͎͈͋̎̆̐͋̇̽Ẻ̸̻̜̓́̇̆̀̒̑̔̾͌͂͒̏.̷̬̩͙̲̆͊̈́̋͊̕\n" + ourHero.getName() + ": ");
    input = inScanner.nextLine();

    if (input.equals("Accept") || input.equals("accept")){
      enterZone3();
    }
    else{
      console.setImage("floweyevil.png");
      System.out.println("Ferenc the flower is enraged by your decision and he initiates a fight with you.");
      int floweyHealth = 100;
      while (floweyHealth != 0){
        System.out.println("What do you want to do? \nAttack: Strike the enemy. \nDefend: Block this turn's attack from the enemy \nRun Away: Leave the battle in the worst way possible..\n" + ourHero.getName() + ": ");
        input = inScanner.nextLine();
        if (input.equals("Attack") || input.equals("attack")){
          floweyHealth -= 10;
        }
        else if(input.equals("Defend") || input.equals("defend")){
          System.out.println("You defend against incoming attacks for this turn.");
        }
        else{
          //Game over sign
        }
        int damage = (int)((Math.random()*10) + 1);
        ourHero.setHealth(ourHero.getHealth() - damage);
        System.out.println("Ferenc the flower's health is at " + floweyHealth);
        System.out.println("Ferenc the flower dealt " + damage + ". Your Current Health is now " + ourHero.getHealth() + ".");
      }
      console.setImage("normalflower.png");
      System.out.println("After dealing the last blow, Ferenc the flower reverted back into a normal yellow flower.");
      System.out.println("You successfully defeated Ferenc the flower!");
      // Game ending 2 where you stay with the chill dude.
    }
  }

  private void enterZone3() throws InterruptedException
  {
    String input;
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE\
    console.setImage("hallway2.png");
    System.out.println("You accept the flower's request and go on to fight.");
    Thread.sleep(3 * 1000);
    console.setImage("strong.png");
    System.out.println("You stumble across a tall, extremely strong man");
    Thread.sleep(3 * 1000);
    System.out.println("Hey... \n you don't look like you're from here.");
    Thread.sleep(3 * 1000);
    System.out.println("WAIT");
    Thread.sleep(3 * 1000);
    System.out.println("Are you a HUMAN????");
    Thread.sleep(3 * 1000);
    System.out.println("I am the GREAT Luca");
    Thread.sleep(3 * 1000);
    System.out.println("And I will capture you HUMAN");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    int lucaHealth = 100;
    while (lucaHealth != 0){
      System.out.println("What do you want to do? \nAttack: Strike the enemy. \nDefend: Block this turn's attack from the enemy \nRun Away: Leave the battle in the worst way possible..\n" + ourHero.getName() + ": ");
        input = inScanner.nextLine();
        if (input.equals("Attack") || input.equals("attack")){
          lucaHealth -= 10;
        }
        else if(input.equals("Defend") || input.equals("defend")){
          System.out.println("You defend against incoming attacks for this turn.");
        }
        else{
          //Game over sign
        }
        int damage = (int)((Math.random()*10) + 1);
        ourHero.setHealth(ourHero.getHealth() - damage);
        System.out.println("The GREAT Luca's health is at " + lucaHealth);
        System.out.println("The GREAT Luca dealt " + damage + ". Your Current Health is now " + ourHero.getHealth() + ".");
    }
    System.out.println("Blast!!! I cannot believe that me, THE GREAT LUCA, lost to a human. \n Welp, well played young human!!!!");
    System.out.println("You defeated the GREAT and MIGHTY Luca!!!");
    enterZone4();
  }

  private void enterZone4()
  {
    // change image
    // ADD CODE HERE
    console.setImage("hallway2.png");
    

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
  private void gameEnd2()
  {
    // ADD CODE HERE

    // Add the first ending picture
    System.out.println("You give up escaping and continue to cry for help..."); // change to ending 2's description.
    System.out.println("...");
    System.out.println("...");
    System.out.println("...");

    inScanner.close();
  }
  private void gameEnd3()
  {
    // ADD CODE HERE

    // Add the first ending picture
    System.out.println("You give up escaping and continue to cry for help..."); // change to ending 3's description.
    System.out.println("...");
    System.out.println("...");
    System.out.println("...");

    inScanner.close();
  }
}