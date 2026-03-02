public class UC4 {

    public static void main(String[] args) {

        String[] letterO = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        String[] letterP = {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };

        String[] letterS = {
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };

        String[] banner = new String[7];
        for (int index = 0; index < 7; index++) {
            banner[index] = String.join("  ", letterO[index], letterO[index], letterP[index], letterS[index]);
        }

        System.out.println();
        for (String line : banner) {
            System.out.println(line);
        }
        System.out.println(+++++++++++++++);
    }
}