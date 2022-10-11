public class SavingAccount extends Account{

    public SavingAccount(String accountNo, String customerName, String address,String phone, String dateOfBirth){
        this.setAddress(address);
        this.setPhone(phone);
        this.setCustomerName(customerName);
        this.setAccountNo(accountNo);
        this.setDateOfBirth(dateOfBirth);
    }

        private double balance = 0.0;
        public double getBalance(){
            return balance;
        }
        public void setBalance(double balance){
            this.balance=balance;
        }
        public String deposit(double amount){
            return "Your Balance: "+ (balance+amount);
        }
        public String withdraw(double amount){
            return "Your current balance:"+(balance-amount);
        }
        public void fixedDeposit(){

        }

        public String toString(){
            return "\nName: "+getCustomerName()+"\nAccount No:"+ getAccountNo()+"\nCurrent Balance: "+getBalance();
        }


}
