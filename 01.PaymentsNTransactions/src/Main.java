// works but compiler gives error Main should be declaired in file as Main.java
import java.util.Arrays;
public class Main {
    //Implement console program which will meet the following requirements:
//
//Implement class Account. Class Account has next fields:
//
//int id
//
//Transaction[] transactions
//
//
//Implement enum StandardAccountOperations that contains next enums:
//
//MONEY_TRANSFER_SEND
//
//MONEY_TRANSFER_RECEIVE
//
//WITHDRAW
//
//
//Implement nested class Transaction that has next fields:
//
//Account accountFrom
//
//Account accountTo
//
//double moneyAmount
//
//StandardAccountOperations operation
//
//
//In Account class implement next methods:
//
//public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
//<write your code here>
//}
//
//public void withdrawMoney(double moneyAmount) {
//<write your code here>
//}
//
//public Transaction[] getTransactions() {
//<write your code here>
//}
//
//Pay attention that when money are sent from one account to another - one transaction MONEY_TRANSFER_SEND created
// in one account, and the second transaction MONEY_TRANSFER_RECEIVE is created in other account.
    public static void main(String[] args) {
        Account acc1 = new Account(123);
        Account acc2 = new Account(456);
        Account acc3 = new Account(789);
        acc1.sendMoneyToAccount(acc2, 2000);
        acc1.receiveMoneyFrom(acc2,1000);
        acc2.withdrawMoney(100);
        acc3.receiveMoneyFrom(acc2,1000);
        System.out.println(Arrays.toString(acc1.getTransactions()));
        System.out.println(Arrays.toString(acc3.getTransactions()));
    }
}
