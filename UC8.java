import java.util.HashMap;
import java.util.Map;

public class UC8 {

    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }

    private static void renderBanner(String word) {

        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {
            String[] pattern = patternMap.get(ch);
            if (pattern == null) continue;

            for (int i = 0; i < 7; i++) {
                banner[i].append(pattern[i]).append("  ");
            }
        }

        for (StringBuilder line : banner) {
            System.out.println(line);
        }
    }
}