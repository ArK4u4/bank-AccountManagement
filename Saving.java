package bankaccountapp;

public class Saving extends Account{
    // List of properties specific to saving account
    private int safetyDepositeBoxID;
    private int safetyDepositeBoxKey;

    // Constructor to initialize saving account properties
        public Saving(String name, String sSN, double initDeposit){
            super(name,sSN,initDeposit);
            accountNumber = "1"+accountNumber;
            setsafetyDepositBox();
        }

    @Override
    public void setRate () {
        rate = getBaseRate ()*- .25;
    }

    private void setsafetyDepositBox(){
            safetyDepositeBoxID=(int)(Math.random ()*Math.pow (10,3));
            safetyDepositeBoxKey=(int)(Math.random ()*Math.pow (10,4));
        }
    // List any method specific to the saving account
    public void showInfo(){
        super.showInfo ();
        System.out.println (
                "Your Saving Account feature "+
                "\n Safety Deposit Box ID :"+safetyDepositeBoxID+
                "\n Safety Deposit Box Key:"+safetyDepositeBoxKey);
    }
}
