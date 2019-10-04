package piggyBank;

import java.util.*;
import java.text.DecimalFormat;


public class Main{
    static DecimalFormat fp = new DecimalFormat("$###,###.00");

    public static void main(String[] args) {
        Quarter quarter = new Quarter("Quarter", 0);
        Dime dime = new Dime("Dime", 0);
        Dollar dollar = new Dollar("Dollar", 5);
        Dollar dollar2 = new Dollar("Dollar", 0);
        Nickel nickel = new Nickel("Nickel", 3);
        Dime dime2 = new Dime("Dime", 7);
        Penny penny = new Penny("Penny", 10);

        // ARRAY LIST//
        ArrayList<AbstractCoins> bank = new ArrayList<AbstractCoins>();

        bank.add(penny);
        bank.add(nickel);
        bank.add(dime);
        bank.add(dime2);
        bank.add(quarter);
        bank.add(dollar);
        bank.add(dollar2);

        // for (int i : bank){
        // System.out.println(i.name);
        // }

        // System.out.println(bank.toString());
        System.out.println(bank);
        System.out.println("The piggy bank holds: "
                + fp.format(penny.getAddCoins() + nickel.getAddCoins() + quarter.getAddCoins()
                        + dime.getAddCoins() + dime2.getAddCoins() + dollar.getAddCoins() + dollar2.getAddCoins()));
        


    }

}