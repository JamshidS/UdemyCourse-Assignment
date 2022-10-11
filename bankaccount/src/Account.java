
public class Account {

    public Account(String accountNo, String customerName, String address,String phone, String dateOfBirth){
        this.address=address;
        this.phone=phone;
        this.dateOfBirth=dateOfBirth;
        this.accountNo=accountNo;
        this.customerName=customerName;
    }
    public Account(){

    }
    private String accountNo;

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    private String customerName;
    private String address;
    private String phone;
    private String dateOfBirth;

    public String getAccountNo() {
        return accountNo;
    }


    public String getCustomerName() {
        return customerName;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void openAccount(){
        if (customerName!=null && accountNo!=null){
            System.out.println("You have successfully opened your account ");
        }else {
            System.out.println("For opening your account you must enter your information");
        }
    }

    public void closeAccount(){
        System.out.println("The account has been closed");

    }

}
