public class UC7 {
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    // Create array of CharacterPatternMap objects
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[]{

            new CharacterPatternMap('O', new String[]{
                    " ***** ",
                    " **  ** ",
                    " **  ** ",
                    " **  ** ",
                    " **  ** ",
                    " **  ** ",
                    " ***** "
            }),

            new CharacterPatternMap('P', new String[]{
                    " ****** ",
                    " **  ** ",
                    " **  ** ",
                    " ****** ",
                    " **     ",
                    " **     ",
                    " **     "
            }),

            new CharacterPatternMap('S', new String[]{
                    " ****** ",
                    " **     ",
                    " **     ",
                    " ****** ",
                    "     ** ",
                    "     ** ",
                    " ****** "
            })
        };
    }

    // Retrieve pattern for given character
    public static String[] getCharacterPattern(char ch,
                                               CharacterPatternMap[] maps) {

        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return new String[7];  // fallback
    }

    // Print banner
    public static void printMessage(String message,
                                    CharacterPatternMap[] maps) {

        for (int line = 0; line < 7; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, maps);
                sb.append(pattern[line]).append(" ");
            }

            System.out.println(sb.toString());
        }
    }

    // Main method
    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, maps);
    }
}