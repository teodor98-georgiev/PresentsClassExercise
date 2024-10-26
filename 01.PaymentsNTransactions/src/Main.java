// works but compiler gives error Main should be declaired in file as Main.java
import java.util.Arrays;
public class Main {
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
