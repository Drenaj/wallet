package wallet;

public class Wallet {
    private int amountOfMoney;
    
       public Wallet(){
            this.amountOfMoney = 0;
            }
        
        public void addMoney(int amount){
            this.amountOfMoney += amount;            
        }
        
        public void removeMoney(int amount){
            this.amountOfMoney -= amount;
            
        }
    
    public int getAmountOfMoney() {
        return amountOfMoney;
    }
    
    public int compare(Wallet w){
        if (w.amountOfMoney > this.amountOfMoney)
            return -1;
        else if (w.amountOfMoney == this.amountOfMoney)
            return 0;
        else
            return +1;    
    }
    
    public static int compare(Wallet w1, Wallet w2){
        if (w1.amountOfMoney > w2.amountOfMoney)
            return -1;
        else if (w1.amountOfMoney == w2.amountOfMoney)
            return 0;
        else
            return +1;
    }
        
    
}
