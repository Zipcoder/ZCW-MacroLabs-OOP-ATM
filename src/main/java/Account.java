abstract public class Account implements Storeable {
    public Double balance;
    public Integer ownerID;
    public Integer acctNum;

    public Account(Double balance, Integer ownerID, Integer acctNum) {
        this.balance = balance;
        this.ownerID = ownerID;
        this.acctNum = acctNum;
    }

    public Double getBalance(){
        return balance;
    }

    public Integer getOwnerID() {
        return ownerID;
    }

    public Integer getAcctNum() {
        return acctNum;
    }

    public void deposit(Double amount){

    }

    public void withdraw(Double amount){

    }

    public void transferWithin(){

    }

    public void transferToAnother(){

    }

    public void getAcctHist(){

    }
}

