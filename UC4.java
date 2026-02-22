public class UC4 {

    public static void main(String[] args) {

        // Define array with 7 lines
        String[] lines = new String[7];

        // Populate banner lines using String.join()
        lines[0] = String.join(" ", "   ***   ", "   ******   ");
        lines[1] = String.join(" ", "  **  **  ", "  **     ");
        lines[2] = String.join(" ", " **    ** ", "  **     ");
        lines[3] = String.join(" ", " **    ** ", "    ***** ");
        lines[4] = String.join(" ", " **    ** ", "        ** ");
        lines[5] = String.join(" ", "  **  ** ", "  **    ** ");
        lines[6] = String.join(" ", "   *** ", "   *****   ");

        // Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
