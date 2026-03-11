/**
 * OOPS Banner App - UC7
 * 
 * Demonstrates storing character patterns inside an Inner Static Class
 * and displaying the word "OOPS" in banner format.
 * 
 * Concepts Used:
 * - Inner Static Class
 * - Encapsulation
 * - Arrays of Objects
 * - StringBuilder
 * - Modularity
 * - JavaDoc Comments
 */
public class OOPSBannerApp {

    /**
     * Inner Static Class to encapsulate Character and its Banner Pattern
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * 
         * @param character The character to store
         * @param pattern   The 7-line banner pattern of the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * 
         * @return stored character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * 
         * @return 7-line pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to retrieve pattern for given character
     * 
     * @param ch         Character to search
     * @param patterns   Array of CharacterPatternMap objects
     * @return           Corresponding 7-line pattern
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return new String[7]; // return empty pattern if not found
    }

    /**
     * Utility method to print banner word
     * 
     * @param word       Word to print in banner format
     * @param patterns   Array of CharacterPatternMap objects
     */
    public static void printBanner(String word, CharacterPatternMap[] patterns) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] charPattern = getCharacterPattern(ch, patterns);
                line.append(charPattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        // Pattern for O
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        // Pattern for P
        String[] P = {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };

        // Pattern for S
        String[] S = {
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };

        // Array of CharacterPatternMap objects
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        // Print OOPS Banner
        printBanner("OOPS", patterns);
    }
}