
package banking;


public class bankApp {
    private int accNo;
    float balance;
    int pin;
    
    public float getBalance(){
        return balance;
       
    }
     public float getPin(){
         return pin;
     }
    
     public void setBalance(float balance){
         this.balance = balance;
     }
    public void setPin(int pin){
         this.pin = pin;
    }
    public void setAccNo(int accNo){
         this.accNo = accNo;
    }
     public int setAccNo(){
         return accNo;
     }
    
     public boolean verifyAccount(int accn, int pin){
         if(accNo == accn && pin == pn){
             return true;
     }else{
         return false;
    
    }
}

public void deposit(){
}

public void withdraw(){
}


    
}
