import java.util.HashMap;
import java.util.Map;

class Banner {

    Map<Character, String[]> map = new HashMap<>();

    Banner() {

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });
    }

    void printBanner(String text) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < text.length(); j++) {

                char ch = text.charAt(j);
                String[] pattern = map.get(ch);

                System.out.print(pattern[i] + "  ");
            }

            System.out.println();
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Banner b = new Banner();

        b.printBanner("OOPS");

    }
}
