package ExceptionPractice;
import java.util.Scanner;

public class Loan {
    private double annualInterestRate;
    private double loanAmount;
    private int numofYears;

    public Loan() {
        annualInterestRate = 2.5;
        loanAmount = 1000;
        numofYears = 1;
    }

    public Loan(double aIntRate, double lAmt, int numYears) {
        numYears = numofYears;
        lAmt = loanAmount;
        annualInterestRate = aIntRate;

    }

    public double getAnnualInterestRate() throws IllegalArgumentException {
        if(annualInterestRate<0){
         throw new IllegalArgumentException("Value cannot be less than zero");}
        return annualInterestRate;
    }

    public int getNumofYears()throws IllegalArgumentException {
        if(numofYears<0){
            throw new IllegalArgumentException("Value cannot be less than zero");}
        return numofYears;
    }

    public double getLoanAmount()throws IllegalArgumentException {
        if(loanAmount<0){
            throw new IllegalArgumentException("Value cannot be less than zero");}
        return loanAmount;
    }


    public double getTotalSalary() {
        double pay;
        double t1;
        t1 = (loanAmount * (1 + annualInterestRate / 12));
        //pay = Math.pow(t1, numofYears*12);
        return t1;
    }

    public double getMonthlySalary() {
        double pay;
        double t1;
        t1 = loanAmount * (1 + annualInterestRate / 12);
        //pay = Math.pow(t1, numofYears * 12);
        return (t1 / numofYears);
        //return (pay/ numofYears * 12);
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setNumofYears(int numofYears) {
        this.numofYears = numofYears;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Loan l = new Loan();
        try {
            System.out.println("Enter the amount you were you loaned: ");
            l.setLoanAmount(in.nextDouble());
            System.out.println("Enter the number of years were you given to pay off this loan: ");
            l.setNumofYears(in.nextInt());
            System.out.println("Enter the annual interest rate of your loan: ");
            l.setAnnualInterestRate(in.nextDouble());
            System.out.println("Your loan of: $" + l.getLoanAmount() + " has an annual interest rate of: " + l.getAnnualInterestRate() +
                    " and is due within: " + l.getNumofYears() + " years.\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------\n" +
                    "You have a monthly balance due of: $" + l.getMonthlySalary() + " and overall owe a total of: $" + l.getTotalSalary());

        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid value");
        }
    }
}


