package lab1;

public class Ex4 {
    public static void main(String[] args) {
        int usedMinutes = 60;
        int sentMessages = 55;
        double baseCharge = 15.00;
        double extraMinutesCharge = Math.max(0, usedMinutes - 50) * 0.25;
        double extraMessagesCharge = Math.max(0, sentMessages - 50) * 0.15;
        double supportFee = 0.44;
        double subtotal = baseCharge + extraMinutesCharge + extraMessagesCharge + supportFee;
        double taxAmount = subtotal * 0.05;
        double totalCharge = subtotal + taxAmount;

        System.out.printf("Base charge: $%.2f%n", baseCharge);
        if (extraMinutesCharge > 0) {
            System.out.printf("Extra minutes charge: $%.2f%n", extraMinutesCharge);
        }
        if (extraMessagesCharge > 0) {
            System.out.printf("Extra messages charge: $%.2f%n", extraMessagesCharge);
        }
        System.out.printf("911 support fee: $%.2f%n", supportFee);
        System.out.printf("Tax: $%.2f%n", taxAmount);
        System.out.printf("Total charge: $%.2f%n", totalCharge);
    }
}
