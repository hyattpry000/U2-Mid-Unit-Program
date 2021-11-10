/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

PLAN
1. GET INPUT - HOURLY RATE, HOURS WORKED, COMMISSSION PERCENT, TOTAL SALES
2. CALC PAY - RATE*HOURS
3. CALC COMMISSION- PERCENT*TOTAL SALES
4. ADD PAY AND COMMISSION
RETURN
 */

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.text.DecimalFormat;

public class SalesCommission {

    public static void main(String[] args) {

        double hourlyRate = getInput("Enter your hourly rate");
        double hoursWorked = getInput("Enter your total hours worked");
        double commPercent = getInput("Enter your commission percentage");
        double salesTotal = getInput("Enter your total sales in $$");
        double calcPay = calcPay(hourlyRate, hoursWorked);
        double calcComm = calcComm(commPercent, salesTotal);
        double totalEarnings = calcComm + calcPay;
        outputResults(totalEarnings);
        System.exit(0);

    }
    public static double getInput(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }
    public static void outputResults(double totalEarnings){
        DecimalFormat round = new DecimalFormat("##,###.##");
        JOptionPane.showMessageDialog(null, "Your total earnings are: " + totalEarnings);
    }

    public static double calcPay (double hourlyRate, double hoursWorked){
        double pay = hourlyRate*hoursWorked;
        return pay;
    }
    public static double calcComm(double commPercent, double salesTotal){
        double commission = commPercent*salesTotal;
        return commission;
    }
    public static double totalEarnings(double pay, double commission){
        double totalEarnings = pay + commission;
        return totalEarnings;
    }


}