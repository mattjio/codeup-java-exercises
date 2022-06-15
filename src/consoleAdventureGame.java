import java.util.Random;
import java.util.Scanner;
public class consoleAdventureGame {

    public static void dice() {
        int diceSides;
        System.out.println("How many sides does your dice have: ");
        Scanner scanner = new Scanner(System.in);
        diceSides = scanner.nextInt();
        Random rand = new Random();
        int die1 = rand.nextInt(diceSides);
        die1 +=1;
        int die2 = rand.nextInt(diceSides);
        die2 +=1;
        System.out.println("You rolled a " +die1+ " and a " +die2);
        System.out.println("Would you like to roll again (Y/N)");
        String userChoice = scanner.next();
        if(userChoice.equalsIgnoreCase("y")) {
            dice();
        }
    }

    public static void game() {
        System.out.println("Hello weary coder.\n Would you like to code some more? (y/n)");
        Scanner start = new Scanner(System.in);
        String go = start.next();
        if (go.equalsIgnoreCase("y")) {
            System.out.println("The weary coder stumbles out of the elevator like a drunken sailor and heads to the classroom.");
            System.out.println("The professor looks with disgust upon our weary coder.\n \"Oh, it's you, hmmm, yes, I definitely know you, yes, no need to remind me of your name at all.\"");
            System.out.println("He definitely does not remember your name.\n What should you do?");
            System.out.println("1: Give him some what for\n2: Tell him you have had it with these monkey-fighting snakes in this monday through friday class\n3: Give him your name");
            System.out.println("Choose 1,2,or 3");
            Scanner option = new Scanner(System.in);
            int useropt = option.nextInt();
            if (useropt == 1) {
                System.out.println("You look coldly into the professors eyes. You know what time it is.\n \"KAAAAAAAAA-MEEEEEEE-HAAAAAA-MEEEEEEEE-HAAAAAAAAAAAAAAA\".\n Your yell echoes throughout the building, but their is no spectacular explosion of energy propelled from your body. The students stare, confused looks on their faces.\n You then remember that you are just a normal person and not a sayain.This isn't the first time this has happened. oops.\n You die from embarrassment.");
                System.out.println("Game Over Goku wannabe");
                System.out.println("Try again loser? (y/n)");
                String userChoice = option.next();
                if(userChoice.equalsIgnoreCase("y")) {
                    game();
                }
            } else if (useropt == 2) {
                System.out.println("You have had it, and you let everyone know by yelling \"I have had it with these monkey-fighting snakes, in this Monday through Friday class.\"\n Everyone is confused. They just don't understand how cool you are.\n You jet out the building faster than Usain Bolt");
                System.out.println("Game Over");
                System.out.println("Try again loser? (y/n)");
                String userChoice = option.next();
                if(userChoice.equalsIgnoreCase("y")) {
                    game();
                }
            } else if (useropt == 3) {
                System.out.println("You decide to let him know your name, yet you think to yourself,\n\"hmmm, a great coder has a great name...my name must be...\"");
                System.out.println("Enter your name self-proclaimed great coder: ");
                Scanner scanner1 = new Scanner(System.in);
                String userName = scanner1.nextLine();
                System.out.println("\"I am " +userName+ " and I came here to chew bubble gum and code.\n And I'm all out of bubble gum.\" you proclaim proudly.\n\"Great, have a seat " +userName+".\"");
                System.out.println("You walk over to your seat and open up your macbook to begin your warmup.\nThe student next to you looks over, gives a weird, exaggerated and long sniff of the air, and says\n\"MMMMMMM, I love the smell of code in the morning ya know what I sayin playa?\" ");
                System.out.println("Oh boy, you think to yourself, \"I thought I was the weirdest one in this class.\"\nIn fact, you find it offensive that he is trying to out weird you.\n You should do something by golly!");
                System.out.println("1: Tell him that smell was your fart,and not code. Apologize\n2: Tell him to shut his mouth or you'll shut it for him\n3: Say something even weirder ");
                System.out.println("Please choose an option " +userName+": ");
                Scanner option1 = new Scanner(System.in);
                int userOpt1 = option1.nextInt();
                if (userOpt1 == 1) {
                    System.out.println("\"I farted, my bad.\"\nHe is not amused. \"Professa, this foo be fartin\", he yells out. Uh oh, this isn't going well. The \"Professa\" looks up, directly at you.\n\"How dare you. Nobody farts in here, ever, it's codeup policy sir, now thoust shall leave or feel the wraith of the coding gods!\"");
                    System.out.println("1: Leave, but say something totally badass as you walk away\n2: Tell him that ain't in the codeup policy because you are the codeup policy\n3: Stay because you are atheist and have no fear of the coding gods.");
                    System.out.println("Please choose an option " +userName+": ");
                    int userOpt2 = option1.nextInt();
                    if (userOpt2 == 1) {
                        System.out.println("You play it cool, pick your things up, and walk to the door\nYou stop at the doorway, and turn around. You face the class, with gusto, you bellow out the coolest, most badass line you can think of, which is...");
                        System.out.println("What is the coolest, most badass thing you can say: ");
                        Scanner cool = new Scanner(System.in);
                        String coolestLineEver = cool.nextLine();
                        System.out.println("\""+coolestLineEver+"\"");
                        System.out.println("You mentally pat yourself on the back, nobody could have come up with a more cool, badass line than that.\nUnfortunately, your coolest, most badass line falls on deaf ears.\nEveryone has their headphones in. You walk away, defeated, again. Back to freecodecamp for you sir/ma'am/pronoun");
                        System.out.println("Game Over");
                        System.out.println("Try again loser? (y/n)");
                        String userChoice = option1.next();
                        if (userChoice.equalsIgnoreCase("y")) {
                            game();
                        }
                    } else if (userOpt2 == 2) {
                        System.out.println("\"That is rubishness, that isn't codeup policy for...\"");
                        System.out.println("***** I AM THE CODEUP POLICY *****");
                        System.out.println("You declare proudly to the class. The professor isn't convinced\n\"If you are the codeup policy, tell me what percentage of Sweden's household garbage makes it to landfills?");
                        //would like to make the above with random trivia questions
                        System.out.println("Totally unfair you think to yourself, but you can't be made a fool of. Your answer is...");
                        System.out.println("Please give a number between 1 and 100: ");
                        int trivia = option1.nextInt();
                        if (trivia == 1) {
                            System.out.println("You are either extremely lucky or you googled this. How dare you.\nCodeup has zero tolerance for cheaters, your new name is");
                            System.out.println("***** CHEATER MCCHEATERFACE *****");
                            System.out.println("userName = CHEATER MCCHEATERFACE confirmed");
                            System.out.println("The professor stands, stares you down and bellows with anger\n\"It's all there, black and white, clear as crystal!\"\n\"You stole fizzy lifting drinks! You bumped into the ceiling which now has to be washed and sterilized.\"\n\"So you get nothing! You lose! Good day CHEATER MCCHEATERFACE\"");
                            System.out.println("You walk out, trying to contemplate the madness you just witnessed");
                            System.out.println("Game Over");
                            System.out.println("Try again CHEATER MCCHEATERFACE? (y/n)");
                            String userChoice = option1.next();
                            if (userChoice.equalsIgnoreCase("y")) {
                                game();
                            }
                        } else {
                            System.out.println("You didn't get it right, which is unfortunate because it was such an easy question.\nGuess it's back to the streets doing totally legal things to earn money ;)");
                            System.out.println("Game Over");
                            System.out.println("Try again loser? (y/n)");
                            String userChoice1 = option1.next();
                            if (userChoice1.equalsIgnoreCase("y")) {
                                game();
                            }
                        }
                    } else if (userOpt2 == 3) {
                        System.out.println("You stay, for you are not afraid of the gods. You are");
                        System.out.println("***** "+userName+" *****");
                        System.out.println("after all. But the Coding gods are real, and they don't like you.\nThey make their presence known and rain their wraith upon you with such furiousness, it shakes the very fabric of time and space.");
                        System.out.println("You end up in an a void, with nothing but Nickleback songs\n playing on repeat for all eternity.\nA true Hell.");
                        System.out.println("Game Over");
                        System.out.println("Try again loser? (y/n)");
                        String userChoice = option1.next();
                        if (userChoice.equalsIgnoreCase("y")) {
                            game();
                        } else {
                            System.out.println("You can't follow instructions. Stop trying to break my game");
                        }
                    }
                } else if (userOpt1 == 2) {
                    System.out.println("You tell him to shut it or else.\nYou are immediately swarmed by codeup staff.\nThey began to tell you how they have zero tolerance for violence against students and staff.\n You get escorted out the building, never to set foot inside EVER AGAIN");
                    System.out.println("****Remember, violence is not the answer****");
                    System.out.println("Game Over");
                    System.out.println("Try again Ted Bundy? (y/n)");
                    String userChoice1 = option1.next();
                    if (userChoice1.equalsIgnoreCase("y")) {
                        game();
                    }
                } else if (userOpt1 == 3) {
                    System.out.println("No way is this guy gonna out weird you.\nYou stare him down and say...");
                    System.out.println("Quick think of something weird to say: ");
                    Scanner cool = new Scanner(System.in);
                    String weird = cool.nextLine();
                    System.out.println(weird);
                    System.out.println("Your fellow student is baffled by your words.\nHe silently goes back to coding, like a good coder.");
                    System.out.println("The professor begins to show the warmup on the tv.\nYou take a look and realize...");
                    System.out.println("1: You got this\n2: You don't got this\n3: *looks at watch* Gee, I think it's time for a break");
                    int anotherChoice = cool.nextInt();
                    if (anotherChoice == 1) {
                        System.out.println("Yeah, this is easy. Maybe too easy.\nYour fingers fly along the keyboard, similar to Wolfgang Amadeus Mozart on the Piano.\nYou're putting on a symphony that would make the angels weep tears of joy.\nYou fall into a beautiful trance as you conduct your Magnum Opus.\nIn your joyous, drunken stupor, your code tears a hole into another dimension...");
                        System.out.println("A portal appears and out pours all manner of vile demons.\nOops.");
                        System.out.println("***** 5 years later ******");
                        System.out.println("You find yourself walking along the deserted road, between the empty buildings.\nThe sky burns red, the planet consumed by the foul demons.\nEarth is but a vassal of horror in the great Universe.\nThe planet used to be inhabited by over 7 billion humans.\nThat number is estimated to be around 10 million.\n If only you could take back what you did\nbut unfortunately, what is done, can't be undone.\nYou find yourself a wonderer, a vagabond, alone trying to survive.\nEven if you can't undo what you did those long 5 years ago,\nyou surely can take as many demons out as possible");
                        System.out.println("******ACHIEVEMENT UNLOCKED******\nI am become death, destroyer of worlds");
                        System.out.println("100 points");
                        System.out.println("Play again Vishnu? (y/n)");
                        String userChoice = cool.next();
                        if (userChoice.equalsIgnoreCase("y")) {
                            game();
                        }
                    } else if (anotherChoice == 2) {
                        System.out.println("You realize that this warmup is gonna kick your ass.\nYou do not want to bring shame to your family,\nYou bring out a pocket knife and commit Seppuko\nAt least you still have your honor");
                        System.out.println("It's game over man, game over!");
                        System.out.println("Would you like to play again? (y/n)");
                        String userChoice = cool.next();
                        if (userChoice.equalsIgnoreCase("y")) {
                            game();
                        }
                    } else if (anotherChoice == 3) {
                        System.out.println("You ain't got no time for no warmup. You go look for donuts.\nNo donuts. You decide to go out and get some fresh air.\nYou step out of the building, the heat warms your cool skin, you smell the city, which doesn't smell pleasant.");
                        System.out.println("You hear a crash down the street, you look over to see...\nGASP\nIt's The Clown(totally different from The Joker)!");
                        System.out.println("But alas, from the opposite end of the road, comes no other than\nGASP\nBatdude(totally different from The Batman) and Birdkid(totally different from Robin).");
                        System.out.println("You find yourself between these dorks\nYou know what time it is.\nYou open up your macbook pro 2018 edition with 8gb ram and an intel i5 processor\n(yes, we know, \"how did he have his mac on him whe he's outside\" prey tell you ask, just go with it)\nYou gotta code your way out of this...");
                        System.out.println("This is the end of the demo, thank you for playing");
                        System.out.println("please give me 5 dolla so I can finish this game\nI promise, no loot boxes");
                    } else {
                        System.out.println("stop trying to mess up my game. Just press the correct number please.");
                    }
                }
            }
        } else {
            System.out.println("The world around turns dark, your days of coding are over. \n Your days are spent in eternal darkness. This is what happens when you don't code.");
            System.out.println("Try again loser? (y/n)");
            String userChoice = start.next();
            if(userChoice.equalsIgnoreCase("y")) {
                game();
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Codeup the game!\n\n This is not a Codeup Approved game \n\n");
        game();
    }
}
