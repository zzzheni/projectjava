package lab1;

public class Ex2 {
    public static void main(String[] args) {
        String[] actions = {"Like", "Dislike", "Dislike", "Like", "Like"};
        String status = "Nothing";
        for (String action : actions) {
            if (action.equals(status)) {
                status = "Nothing";
            } else {
                status = action;
            }
        }
        System.out.println(status);
    }
}

