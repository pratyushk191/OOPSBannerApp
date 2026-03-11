/**
 * OOPS Banner App
 * UC8: Use Map for Character Patterns and Render via Function
 * Goal: Use HashMap for efficient pattern storage and retrieval
 * 
 * @author Technical Team
 * @version 1.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    /**
     * Utility method to build and return character pattern map
     * 
     * @return Map<Character, String[]>
     */
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return patternMap;
    }

    /**
     * Utility method to render banner for a given word
     * 
     * @param word       The word to display
     * @param patternMap Map containing character patterns
     */
    public static void renderBanner(String word,
                                    Map<Character, String[]> patternMap) {

        // Outer loop → rows
        for (int row = 0; row < 7; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            // Inner loop → characters in word
            for (int i = 0; i < word.length(); i++) {

                char currentChar = word.charAt(i);

                String[] pattern = patternMap.get(currentChar);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append(" ");
                }
            }

            System.out.println(lineBuilder);
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        Map<Character, String[]> characterMap = buildCharacterMap();

        String message = "OOPS";

        renderBanner(message, characterMap);
    }
}