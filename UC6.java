public class UC6 {

    public static void main(String[] args) {

        String[] letterO = buildO();
        String[] letterP = buildP();
        String[] letterS = buildS();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("  ",
                    letterO[i],
                    letterO[i],
                    letterP[i],
                    letterS[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Static helper method for O
    public static String[] buildO() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Static helper method for P
    public static String[] buildP() {
        return new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };
    }

    // Static helper method for S
    public static String[] buildS() {
        return new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };
    }
}
