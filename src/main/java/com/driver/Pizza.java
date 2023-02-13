package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;

    boolean extraCheeseAdded;
    boolean extraToppingAdded;
    boolean extraTakeaway;
    boolean hasbillcreated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            this.price=300;
            this.toppings=70;
        }
        else
        {
            this.price=400;
            this.toppings=120;
        }

        this.extraCheeseAdded=false;
        this.extraToppingAdded=false;
        this.extraTakeaway=false;
        this.hasbillcreated=false;
        this.bill="Base Price Of The Pizza:"+this.price+"\n";

    }

    public int getPrice(){

       return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheeseAdded)

        {
            this.price+=80;
           // System.out.println("Extra Cheese Added: 80""\n");
            extraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extraToppingAdded)

        {
            this.price+=this.toppings;
           // System.out.println("Extra Toppings Added:"+this.toppings+"\n");
            extraToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!extraTakeaway)

        {
            this.price+=20;
            //System.out.println("Paperbag Added: 20"+"\n");
            extraTakeaway=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!hasbillcreated)

        {
            if(extraCheeseAdded)
            {
              this.bill+="Extra Cheese Added: 80"+"\n";
            }
            if(extraToppingAdded)
            {
                this.bill+="Extra Toppings Added:"+this.toppings+"\n";
            }
            if(extraTakeaway)
            {
                this.bill+="Paperbag Added: 20"+"\n";
            }
            this.hasbillcreated=true;
            return this.bill+="Total Price:"+this.price;

        }

        return "";
    }
}
