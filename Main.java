import java.util.Scanner;
// rubric: https://docs.google.com/document/d/1GLZ_IUFUMKy-FltlZFV_nd05SWGzMvbmfI7hVW_b-NE/edit?tab=t.0
public class Main
{
 public static String CV;
 public static String test;
 public static int x=100;
 public static Job userjob = null;
 public static int orderCount = 0;
 public static Food[] userOrders = new Food[50];








 //CREATE INSTANCE VARIABLES HERE. Ensure they are static.
 public static final String ANSI_RESET = "\u001B[0m";
 public static final String ANSI_BLACK = "\u001B[30m";
 public static final String ANSI_RED = "\u001B[31m";
 public static final String ANSI_GREEN = "\u001B[32m";
 public static final String ANSI_YELLOW = "\u001B[33m";
 public static final String ANSI_BLUE = "\u001B[34m";
 public static final String ANSI_PURPLE = "\u001B[35m";
 public static final String ANSI_CYAN = "\u001B[36m";
 public static final String ANSI_WHITE = "\u001B[37m";
 static String[] ansi_colors = {ANSI_BLACK, ANSI_RED, ANSI_GREEN, ANSI_YELLOW, ANSI_BLUE, ANSI_PURPLE, ANSI_CYAN, ANSI_WHITE};
 static String[] colors = {"black", "red", "green", "yellow", "blue", "purple", "cyan", "white"};
  // amount of money is according to googles AI so... is most certainly wrong
 static Job[] jobs = {
      new Job("Cashier", 18.95),
      new Job("Cook", 20.00),
      new Job("Janitor", 1000000.00), // made it 1 million for Mr. Thai since he said thats what it should be
      new Job("Equipment Technician", 34.20),
      new Job("Shift Lead", 20.00)
 };




 static Food[] food = {
     new Food("Big Mac", 5.29,false),
     new Food("Spicy McCrispy",4.69,true),
     new Food("10 pieces Chicken McNuggets",3,false),
     new Food("Spicy Deluxe McCrispy",9.89,true),
     new Food("Filet-O-Fish",5.59,false),
     new Food("regular fries",5.29,false),
     new Food("Happy Meal",5.29,false),
     new Food("Coca-Cola",2.99,false),
     new Food("Double Quarter Pounder with Cheese",7.29,false),
     new Food("Oreo McFlurry",5.29,false)
 };








//May want to create an array of answers.
 static String[] goodBye = {"Goodbye!", "Thanks for talking!", "Have a good day!", "I hope I was able to help!"};
 static String[] noUnderstand = {"I'm sorry, I dont understand", "I'm sorry I'm confused on what you mean", "Sorry! I don't understand what you mean", "Sorry! I don't understand, maybe try to ask again", "I'm sorry, I am confused maybe ask about something else"};
 static String[] menuResponses = {"Here at McDonalds we sell: The Big Mac, The Spicy McCrispy, The Spicy Deluxe McCrispy, Chicken McNuggets,\nThe Filet-O-Fish, Fries, The Happy Meal, Coca-Cola, The Double Quarter Pounder with cheese, and The Oreo McFlurry.\nI personally reccomend the Double Quater Pounder with cheese and an Oreo McFlurry.\n", "Here at McDonalds we sell: The Big Mac, The Spicy McCrispy, The Spicy Deluxe McCrispy, Chicken McNuggets,\nThe Filet-O-Fish, Fries, The Happy Meal, Coca-Cola, The Double Quater Pounder with cheese, and The Oreo McFlurry.\nI personally recommend the Chicken McNuggets and a Coca-Cola.\n"}; 
 static String[] jobResponses = {"I can clearly tell that you are very capable and would be amazing at any job here at McDonalds\nso you can have any job you would like!\n", "You seem like you would be an amazing employee here so you can have whatever job you would like!\n"};
 static String[] helpResponses = {"I am able to help you look at the menu, order food, or get a job!", "Things I can help with include: ordering, viewing the menu, or an employment oppurtunity!", "If you would like I could help you get a job, order food, or just see menu!"};
 public static void main(String[] args)
    {
     //System.out.println(getRandomResponse(menuResponses));
     Scanner in = new Scanner (System.in);//Creates scanner object.
     Scanner in2 = new Scanner (System.in);//Creates a second scanner object.








     System.out.println(ANSI_YELLOW+"Hello there! I am McBot and I am a McDonalds ChatBot here to help you.\nSome of the things you could ask me about are the menu, a job oppurtunity, or if you are ready to order than feel free too!\nBut first, what color do you want from the following:");
     colorChange();
     System.out.println("Now then, what would you like to talk about!\n(You can ask about food, making a purchase, the menu or a job oppurtunity)");
     while(x>0){
       String userResp = in.nextLine(); //in.nextLine() uses the scanner object to get the user's responnse as a String
       userResp=userResp.toLowerCase();
       System.out.println("");
       System.out.println(getResponse(userResp));
       if(!userResp.equals("q"))
       System.out.println("Talk more to me more if you want to know more or type 'q' to quit or 'help' to review what I can help with");
       System.out.println("");
     }
     System.out.println(getRandomResponse(goodBye));
     //System.out.println(userResp);
















     //You will need to make sure your chatbot continues looping until it sees certain keywords from the user such as "bye","goodbye"...
     // do you need a while loop or a for loop?








     //Consider: How do I check what the user says and compare it to my keywords? What methods do I have?








    }








    //Create other methods that might be helpful down here.
    //For example a method called checkWord where the user traverses through an array to check if a word matches.








    //One method you might need is getRandomResponse()
    public static String getRandomResponse(String[] responses){
             int rand = (int) ((Math.random()*(responses.length)));             
             return responses[rand];
    }
   public static String colorChange(){
     for(int i = 0; i < ansi_colors.length; i++){
       System.out.print(ansi_colors[i] + colors[i] + " ");
     }
     System.out.println(ANSI_YELLOW);
     Scanner selection = new Scanner (System.in);
     Scanner temp = new Scanner (System.in);
     String choice = selection.nextLine();
     //System.out.println(choice);//testtoing
     CV=choice;
     int r = 1000;
     String allen = "";
     while(r > 0){
       if(CV == null){
       //System.out.println("cv==null");
       System.out.println("you have to choice FROM THE LIST... try again");
       CV = temp.nextLine();
       //System.out.println(CV);
       }
       else if (CV!=null){
         //System.out.println("Cv is nto null");
         for(int i = 0; i < colors.length; i++){
           //System.out.println("for loop iteration");
           if(CV.toLowerCase().contains(colors[i])){
             allen = ansi_colors[i];
             r=-1000;
             //System.out.println("allen is now ansi colors");
           }    
         }
         if(r!=-1000){
         //System.out.println("forloop issues");
         System.out.println("you have to choice FROM THE LIST... try again");
         CV = temp.nextLine();
         }
       }
     }
     System.out.println(allen+"you selected " + CV);
     return CV;
 
    }
     public static String confusedResponse(){








             return "a";
    }
    // It'll generate a random response when the chatbot doesn't understand what to say








    //Here is an example of a method you might use.
      public static String getResponse(String statement)
      {
             statement = statement.toLowerCase();
             String response = "";
             // for The Menu
             if (statement.contains("menu")
                              || statement.contains("items")
                              || statement.contains("food")
                              || statement.contains("recommend")
                              || statement.contains("best"))
              {   
                     response = getRandomResponse(menuResponses);
              }
              else if (statement.contains("order")) {
                System.out.println(getRandomResponse(menuResponses));
                System.out.println("What do you want to order? Type 'done' to finish ordering, type 'reset' to reset your current order, or type 'my order' to see your order.\nMake sure you do the following: \n1.Make sure to click enter after each item \n2.In your response ONLY say the items name without unnecessary spaces \n3.Pay close attention to the spelling!\n");
         
                boolean ordering = true;
                while (ordering) {
                    Scanner in = new Scanner(System.in);
                    String item = in.nextLine().toLowerCase();
         
                    if (item.contains("done")) {
                        ordering = false;
         
                        if (orderCount <= 0) {
                            System.out.println("You didn't order anything.");
                        }
                        else if (orderCount > 0){
                            System.out.println("Your order has been completed! Here are the items you ordered:");
                            for (int i = 0; i < orderCount; i++) {
                                System.out.println("- " + userOrders[i].getName() + " ($" + userOrders[i].getPrice() + ")");
                            }
                        }
                        response = "Thank you for your order!";
                    }
                    else if(item.contains("my order")){
                      if(orderCount == 0){
                        System.out.println("Currently you have not ordered anything");
                      }
                      if(orderCount > 0){
                        System.out.print("You have in your order: ");
                      for(int i = 0; i < userOrders.length-1;i++){
                        if(userOrders[i]!=null && userOrders[i+1]==null){
                          System.out.println("and " + userOrders[i].getName());
                        }
                        if(userOrders[i]!=null){
                          System.out.print(userOrders[i].getName()+", ");
                        }
                      
                      }
                    }
                      System.out.println("type 'done' to finish ordering or type more food to order more.");
                    }




                    else if(item.contains("reset")){
                      for(int i = 0; i < userOrders.length; i++){
                        userOrders[i] = null;
                      }
                      orderCount = 0;
                      System.out.println("Your order is now reset");
                    }




                    else {
                        boolean found = false;
                        for (Food f : food) {
                            test = f.getName();
                            if (item.toLowerCase().contains(test)||(item.toLowerCase().contains("coke") && f.getName().toLowerCase().contains("coca-cola"))) {
                                if (orderCount < userOrders.length) {
                                    userOrders[orderCount] = f;
                                    orderCount++;
                                    System.out.println(f.getName() + " has been added to your order.\n");
                                    found = true;
                                    break;
                                }
                                else {
                                    System.out.println("Order limit reached! You cannot add more items. So sorry!");
                                    found = true;
                                    break;
                                }
                            }
                        }
                        if (!found) {
                            System.out.println("Sorry, I didn't recognize that item. Please try again or type 'done' to finish.\n");
                        }
                    }
                }
               }
              else if(statement.contains("help")){
                response = getRandomResponse(helpResponses);
              }
              // Work oppurtunity
              else if (statement.contains("job")
                              || statement.contains("oppurtunity")
                              || statement.contains("employment")
                              || statement.contains("employee"))
              {     
                      response = getRandomResponse(jobResponses);
                      System.out.println("The jobs we have avalible are the following:");
                      for(int i = 0;i<jobs.length; i++){
                              System.out.println(jobs[i].getTitle()+" paying $" + jobs[i].getDPH()+ " per hour");
                      }
              }
              else if (statement.contains("cashier")){
                      if(userjob==null){
                              System.out.println("Thank you for becoming our newest cashier, you can start on December 32nd");
                              userjob = jobs[0];
                      }
                      else if(userjob!=null){
                              System.out.println("You already have a job... GET BACK TO WORK!!!");
                      }
              }
              else if (statement.contains("jani")){
                      if(userjob==null){
                              System.out.println("Thank you for becoming our newest Janitor, you can start on December 32nd");
                              userjob = jobs[2];
                      }
                      else if(userjob!=null){
                              System.out.println("You already have a job... GET BACK TO WORK!!!");
                      }
              }
              else if (statement.contains("tech")){
                      if(userjob==null){
                              System.out.println("Thank you for becoming our newest Equipment Technician, you can start on December 32nd");
                              userjob = jobs[2];
                      }
                      else if(userjob!=null){
                              System.out.println("You already have a job... GET BACK TO WORK!!!");
                      }
              }
              else if (statement.contains("shift") || statement.contains("lead")){
                      if(userjob==null){
                              System.out.println("Thank you for becoming our newest Shift Lead, you can start on December 32nd");
                              userjob = jobs[3];
                      }
                      else if(userjob!=null){
                              System.out.println("You already have a job... GET BACK TO WORK!!!");
                      }
              }
              else if (statement.contains("cook")){
                      if(userjob==null){
                              System.out.println("Thank you for becoming our newest Cook, you can start on December 32nd");
                              userjob = jobs[1];
                      }
                      else if(userjob!=null){
                              System.out.println("You already have a job... GET BACK TO WORK!!!");
                      }
              }
              // Food
              else if(statement.contains("help")){
                      System.out.println("Now then, what would you like to talk about!\n(You can ask about food, making a purchase, the menu or a job oppurtunity)");
              }
else if(statement.contains("big mac")){
 response=food[0].getName()+" has a price of "+food[0].getPrice()+" and is not spicy.";
}
 else if(statement.contains("mccrispy")){
   response=food[1].getName()+" has a price of "+food[1].getPrice()+" and is spicy";
 }
   else if(statement.contains("nugget")){
     response=food[2].getName()+" has a price of "+food[2].getPrice()+" and is not spicy";
   }
     else if(statement.contains("spicy deluxe")){
       response=food[3].getName()+" has a price of "+food[3].getPrice()+" and is not spicy";
     }
       else if(statement.contains("fries")){
         response=food[5].getName()+" has a price of "+food[5].getPrice()+" and is not spicy";
       }
         else if(statement.contains("happy meal")){
           response=food[6].getName()+" has a price of "+food[6].getPrice()+" and is not spicy";
         }
           else if(statement.contains("coke") || statement.contains("cola") || statement.contains("pepsi")){
             response=food[7].getName()+" has a price of "+food[7].getPrice();
           }
             else if(statement.contains("double quarter")
                || statement.contains("quarter pounder")
                || statement.contains("double quarter pounder with cheese")){
                 response=food[8].getName()+" has a price of "+food[8].getPrice()+" and is not spicy";
             }
               else if(statement.contains("mcflurry")){
                 response=food[9].getName()+" has a price of "+food[9].getPrice()+" and is not spicy";
               }
                 else if(statement.contains("fish")){
                   response=food[4].getName()+" has a price of "+food[4].getPrice()+" and is not spicy";
                 }
                   else if(statement.contains("spicy")){
                     response="we have 2 type of spicy items: one is "+food[1].getName()+" and "+food[3].getName();
                   }




               //quit the conversation
               else if (statement.contains("q")){
                 x=0;
               }
              else
              {
                      response = getRandomResponse(noUnderstand);
              }
              return response;
      }
}