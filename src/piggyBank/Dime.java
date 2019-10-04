package piggyBank;

public class Dime extends AbstractCoins
{

    public Dime(String name, int quantity){
        super(name, quantity);
    }

    @Override
    public double getValue(){
        return .10;
    }
    
    public double addCoins(){
        return getValue() *quantity;
    };
   
}