class BankAccount{
    protected double balance;
    BankAccount(double bal){
        balance = bal;
    }

    void Withdraw(double amt){
        if(amt>balance){
            System.out.println("Invalid");
        }
        else{
            balance -= amt;
        }
    }

    void Display(){
        System.out.println("Balance : "+balance);
    }

}

public class Bank {
    public static void main(String args[]){
      
        BankAccount A  = new BankAccount(1000);
        A.Display();
        A.Withdraw(345);
        A.Display();
        A.Withdraw(700);
    }
  
}
