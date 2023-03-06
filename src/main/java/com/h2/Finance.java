package com.h2;

import java.util.Arrays;
import java.util.Map;

public class Finance {

    public final static String BEST_LOAN_RATES = "bestLoanRates";
    public final static String SAVINGS_CALCULATOR = "bestLoanRates";
    public final static String MORTGAGE_CALCULATOR = "mortgageCalculator";
    public final static Map<String, String> commandsToUsage = Map.of(BEST_LOAN_RATES, "usage: bestLoanRates",
            SAVINGS_CALCULATOR, "usage: savingsCalculator <credits separated by ','> <debits separated by ','>",
            MORTGAGE_CALCULATOR, "usage: mortgageCalculator <loanAmount> <termInYears> <annualRate>");

    private static boolean validateInput(String[] args) {
        int numArgs = args.length;
        switch (args[0]) {
            case "bestLoanRates":
                return numArgs == 1;
            case "savingsCalculator":
                return numArgs == 3;
            case "mortgageCalculator":
                return numArgs == 4;
            default:
                return false;
        }
    }

    private static void executeCommand(String command, String[] arguments) {

        switch (command) {
            case "bestLoanRates":
                System.out.println("Finding best loan rates ...");
             BestLoanRates.main(arguments);
                return ;
            case  "savingsCalculator":
                System.out.println("Finding your net savings ...");
               SavingsCalculator.main(arguments);
                return ;


            case "mortgageCalculator":
                System.out.println("Finding your monthly payment ...");
                MortgageCalculator.main(arguments);
                return;
    }
}
public static void main(String[] args){

    String command =args[0];

    if (!commandsToUsage.containsKey(command)){
        System.out.print(command + ": command not found");
          return;
    }
    boolean isValidCommand =validateInput(args);
    if (!isValidCommand){
        commandsToUsage.get(args[0]);
        return;
    }
    executeCommand(command, Arrays.copyOfRange(args, 1, args.length));
}
}

