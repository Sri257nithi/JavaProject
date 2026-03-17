 public class UC5 {
    public static void main(String[] args) {

        // Declare and initialize array in one statement
        String[] banner = {
            String.join(" ", "*", "*", "*", "*", "*"),
            String.join(" ", "*", " ", " ", " ", "*"),
            String.join(" ", "*", "*", "*", "*", "*"),
            String.join(" ", "*", " ", " ", " ", "*"),
            String.join(" ", "*", " ", " ", " ", "*"),
            String.join(" ", "*", " ", " ", " ", "*"),
            String.join(" ", "*", "*", "*", "*", "*")
        };

        // Enhanced for loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}git checkout feature/UC5

