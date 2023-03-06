package com.h2;

public class MortgageCalculator {


    private  long loanAmount ;
    private int termInYears ;
   private float annualRate;
    private double monthlyPayment =0;

    public MortgageCalculator(long loanAmount, int termInYears, float annualRate) {
        this.loanAmount = loanAmount;
        this.termInYears = termInYears;
        this.annualRate = annualRate;
    }

    private double getNumberOfPayments() {
        return monthlyPayment ;
    }
private float getMonthlyInterestRate() {

    float  interestRate  = (annualRate / 100)/12 ;
}
public double calculateMonthlyPayment(){

    double m =loanAmount *
            (((getMonthlyInterestRate() * Math.pow(1 + getMonthlyInterestRate(),getNumberOfPayments()))) /
            ((Math.pow((1 + getMonthlyInterestRate()), getNumberOfPayments())) - 1));
    m = this.monthlyPayment;
            return toString(m);

}
}