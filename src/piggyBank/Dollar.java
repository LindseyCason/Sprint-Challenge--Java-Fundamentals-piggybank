package piggyBank;

public class Dollar extends AbstractCoins
{

    public Dollar(String name, int quantity){
        super(name, quantity);
    }

    @Override
    public double getValue(){
        return 1.00;
    }
    
    public double addCoins(){
        return getValue() *quantity;
    };
   
}