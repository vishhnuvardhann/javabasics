public class UC5 {

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
        
        String[] banner = {
            String.join("  ", letterO[0], letterO[0], letterP[0], letterS[0]),
            String.join("  ", letterO[1], letterO[1], letterP[1], letterS[1]),
            String.join("  ", letterO[2], letterO[2], letterP[2], letterS[2]),
            String.join("  ", letterO[3], letterO[3], letterP[3], letterS[3]),
            String.join("  ", letterO[4], letterO[4], letterP[4], letterS[4]),
            String.join("  ", letterO[5], letterO[5], letterP[5], letterS[5]),
            String.join("  ", letterO[6], letterO[6], letterP[6], letterS[6])
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}