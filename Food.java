public class Food{
    private double price;
    private String name;
    private boolean spicyLevel;
 
    public Food(String n, double p, boolean s){
        name = n;
        price = p;
        spicyLevel = s;
    }  
 
 
    public void setPrice(double p){
        price = p;
    }
 
 
    public double getPrice(){
        return price;
    }
 
 
    public void setName(String n){
        name = n;
    }
 
 
    public String getName(){
        return name;
    }
   
    public void setSpicy(boolean s){
        spicyLevel = s;
    }
 
 
    public boolean getSpicy(){
        return spicyLevel;
    }
 }
 