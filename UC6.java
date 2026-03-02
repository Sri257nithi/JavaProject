public class UC6 {
    public class OPSBannerUC6 {

    // Static method to build O
    public static String[] buildO() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Static method to build P
    public static String[] buildP() {
        return new String[] {
            "*****  ",
            "*    * ",
            "*****  ",
            "*      ",
            "*      "
        };
    }

    // Static method to build S
    public static String[] buildS() {
        return new String[] {
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Loop to render banner line by line
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}
    
}
