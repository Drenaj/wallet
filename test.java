package wallet;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Wallet w1 = new Wallet();
        Wallet w2 = new Wallet();
        Scanner kb = new Scanner(System.in);
        
        while(true){
            System.out.println("0. Exit");
            System.out.println("1. Add cash to a Wallet");
            System.out.println("2. Remove cash from a Wallet");
            System.out.println("3. Compare Wallets (first option)");
            System.out.println("4. Compare Wallets (second option)");
            int option = kb.nextInt();
            
            if(option == 0){
                System.out.println("goodbye");
                break;
                }
            else if(option == 1){
                System.out.println("add money to which wallet?");
                option = kb.nextInt();
               
                if ( option == 1){
                    System.out.println("Enter amount");
                    int amount = kb.nextInt();
                    w1.addMoney(amount);
                }
                else if(option == 2){
                    System.out.println("Enter amount");
                    int amount = kb.nextInt();
                    w2.addMoney(amount);
                }
                else
                    System.out.println("Invalid input");
            }
            else if(option == 2){
                System.out.println("remove money from which wallet?");
                option = kb.nextInt();
                System.out.println("Enter amount");
                int amount = kb.nextInt();
                if ( option == 1)
                    w1.removeMoney(amount);
                else if(option == 2)
                    w2.removeMoney(amount);
                else
                    System.out.println("Invalid input");
                
            }
            else if(option == 3){
                if(w1.compare(w2) > 0)
                    System.out.println("Wallet 1 has more money!");
                else if(w1.compare(w2) == 0)
                    System.out.println("Wallets have same amount");
                else
                    System.out.println("Wallet 2 has more money");
                
            }
            else if(option == 4){
                if(Wallet.compare(w1, w2) < 0)
                    System.out.println("Wallet 1 has more money!");
                else if(Wallet.compare(w1, w2) == 0)
                    System.out.println("Wallets have same amount");
                else
                    System.out.println("Wallet 2 has more money");
                
            }
            else {
                System.out.println("Invalid input!");
            }
            
        }
    }
    
}
    