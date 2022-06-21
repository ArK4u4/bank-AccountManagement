package bankaccountapp;
public class Current extends Account {
    // List of properties specific to current account
   private int debitCardNumber;
   private int debitCardPin;

    // Constructor to initialize current account properties
    public Current(String name,String sSN,double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber = "2"+accountNumber;
        setDebitCard();
    }
    @Override
    public void setRate(){
        rate = getBaseRate ()*.15;
    }

    // List any method specific to the current account
    private void setDebitCard(){
        debitCardNumber = (int)(Math.random ()*Math.pow (10,12));
        debitCardPin = (int)(Math.random ()*Math.pow (10,4));
    }
    public void showInfo(){
        super.showInfo ();
        System.out.println ("Your Current Account feature"+
                "\nDebit card number:"+debitCardNumber+
                "\nDebit card PIN:"+debitCardPin);
    }
}
