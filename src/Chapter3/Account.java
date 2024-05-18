package Chapter3;

public class Account {
    // Fig. 3.1 | Account class that contains a name instance variable and methods to set and get its value

        private String name; // instance variable
        private double balance; // instance variable

        //Account constructor that receives two parameters
        public Account (String name, double balance)
        {
            this.name = name; // assign name to instance variable name
                if (balance > 0.0)
                        this.balance = balance;
        }
        public void withdraw (double withdrawalAmount){
                if (withdrawalAmount > 0.0)
                        balance = balance - withdrawalAmount;
        }
        // method returns the account balance
        public double getBalance()
        {
            return balance;
        }
        public void setName (String name)  // method that sets the name
        {
                this.name = name;
        }
        public String getName() //method that returns the name
        {
                return name;
        }
}