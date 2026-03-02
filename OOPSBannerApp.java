public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
            String.join("   ",
                " ***** ",   // O
                " ***** ",   // O
                " ***** ",   // P (Top)
                " ***** "    // S (Top)
            ),
            String.join("   ",
                "*     *",
                "*     *",
                "*     *",
                "*      "
            ),
            String.join("   ",
                "*     *",
                "*     *",
                " ***** ",   // P (Middle)
                " ***** "
            ),
            String.join("   ",
                "*     *",
                "*     *",
                "*      ",
                "      *"
            ),
            String.join("   ",
                " ***** ",
                " ***** ",
                "*      ",
                " ***** "
            )
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}