package piggyBank;

public abstract class AbstractCoins
{

    public int quantity=1;
    public String name;
    
    

    public AbstractCoins(String name, int quantity)
    {
        this.quantity=quantity;
        this.name=name;

    }
    //getters for static fields

    public double getAddCoins(){
        //getter
        return getValue() * getQuantity();
    }




    public int getQuantity(){
        if( quantity == 0){
            return 1;
        }else{
        return quantity;
        }
    }
    public String getName(){
        if(quantity>1){
            return name + "s";
        }else{
            return name;
        }
    }




    public abstract double getValue();






    @Override
    public String toString()
    {
        // return "Coins{" + " name: " + name + " value: " + getValue() + " addCoin: " + getAddCoins();
        return "Depositing: " + getQuantity() + " " + getName();
    }
}































// package piggyBank;

// public abstract class AbstractCoins
// {
//     //fields here
//     //constructor of fields above
//     //make abstract methods for dynamic things
//     //getters for fields that are static
//     public String name;
//     public double value;
//     public int quantity;
//     public double addCoins;
    

//     public AbstractCoins(String name, double value, double addCoins, int quantity)
//     {
//         //constructor for static fields
//         this.name = name;
//         // this.value = value;
//         this.addCoins = addCoins;
//         this.quantity = quantity;

//     }
//     //getters for static fields

//     public double getAddCoins(double value, int quantity){
//         //getter
//         return value * quantity;
//     }
//     public void setAddCoins(double addCoins){
//         //setter
//         this.addCoins=addCoins;
//     }
//     public int getQuantity(){
//         return quantity;
//     }

//     public String getName(){
//         return name;
//     }



//     public abstract double getValue();



//     @Override
//     public String toString()
//     {
//         return "Coins{" + " name: " + getName() + " value: " + getValue() + "}";
//     }
// }