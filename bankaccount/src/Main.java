public class Main {
    public static void main(String[] args) {

        SavingAccount savingAccount = new SavingAccount("150AS5","Jamshid Sadiqi","Turkey","0555000000",
                "00-00-0000");

        savingAccount.openAccount();
        savingAccount.setBalance(2000);
        System.out.println(savingAccount);

    }
}