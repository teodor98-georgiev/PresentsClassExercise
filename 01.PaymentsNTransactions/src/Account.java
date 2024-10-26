import java.util.ArrayList;

public class Account {
    int id;
    Transaction[] transactions;
    int transActionIndex = 0;

    public Account(int id) {
        this.id = id;
        this.transactions = new Transaction[20];
    }
    public String toString(){
        return "Account " + this.id;
    }
    public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
        Transaction transaction = new Transaction(this,accountTo,moneyAmount,
                StandardAccountOperations.MONEY_TRANSFER_SEND);
        transaction.opSendMoneyTo(this,accountTo,moneyAmount);
        transactions[transActionIndex] = transaction;
        transActionIndex++;
    }

    public void receiveMoneyFrom(Account accountFrom, double moneyAmount) {
        Transaction transaction = new Transaction(accountFrom,this,moneyAmount,
                StandardAccountOperations.MONEY_TRANSFER_RECEIVE);
        transaction.opReceiveMoneyFrom(accountFrom,this,moneyAmount);
        transactions[transActionIndex] = transaction;
        transActionIndex++;
    }

    public void withdrawMoney(double moneyAmount) {
        Transaction transaction = new Transaction(this,this,moneyAmount,
                StandardAccountOperations.WITHDRAW);
        transaction.makeWithDraw(moneyAmount);
    }

    public Transaction[] getTransactions() {
        return java.util.Arrays.copyOf(transactions, transActionIndex);
    }

    public static class Transaction {
        Account accountFrom;
        Account accountTo;
        double moneyAmount;
        StandardAccountOperations operation;


        public Transaction(Account accountFrom, Account accountTo, double moneyAmount,
                           StandardAccountOperations operation) {
            this.accountFrom = accountFrom;
            this.accountTo = accountTo;
            this.moneyAmount = moneyAmount;
            this.operation = operation;
        }
        public void opSendMoneyTo(Account accountFrom, Account accountTo, double moneyAmount){
            System.out.println(StandardAccountOperations.MONEY_TRANSFER_SEND + " from " + this.accountFrom + " to " + accountTo + " transaction completed." +
                    " Amount: " + moneyAmount);
        }

        public void opReceiveMoneyFrom(Account accountFrom, Account accountTo, double moneyAmount){
            System.out.println(StandardAccountOperations.MONEY_TRANSFER_RECEIVE + " from " + accountFrom + " to " + this.accountTo + " transaction is completed." +
                    " Amount: " + moneyAmount);
        }

        public void makeWithDraw(double moneyAmount){
            System.out.println(StandardAccountOperations.WITHDRAW + " executed. " + "Amount: " + moneyAmount);
        }
        public String toString() {
            return "Transaction from " + accountFrom + " to " + accountTo + " Amount: " + moneyAmount + " Operation: " + operation;
        }
    }
}

