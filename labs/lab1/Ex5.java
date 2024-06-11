package lab1;

public class Ex5 {
    public static void main(String[] args) {
        String[] logs = {
                "пополнение через банкомат ~ +1000",
                "оплата интернета ~ -500",
                "кафе ~ -300",
                "зарплата ~ +15000",
                "штраф за парковку ~ -2500",
                "подарок ~ +2000"
        };
        int accountBalance = 0;
        for (String log : logs) {
            String[] details = log.split("~");
            accountBalance += Integer.parseInt(details[1].trim());
        }
        System.out.println("Итоговая сумма на счету составляет " + accountBalance);
    }
}
