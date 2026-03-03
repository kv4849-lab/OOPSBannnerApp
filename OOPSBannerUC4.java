public class OOPSBannerUC4 {
    public static void main(String[] args) {

        // Store each line of the OOPS banner in a String array
        String[] bannerLines = new String[7];

        bannerLines[0] = String.join(" ",
                "  *****  ",
                "  *****  ",
                "  ****** ",
                "  *****  "
        );

        bannerLines[1] = String.join(" ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * "
        );

        bannerLines[2] = String.join(" ",
                "*       *",
                "*       *",
                " *     * ",
                " *       "
        );

        bannerLines[3] = String.join(" ",
                "*       *",
                "*       *",
                " ******  ",
                "  *****  "
        );

        bannerLines[4] = String.join(" ",
                "*       *",
                "*       *",
                " *       ",
                "       * "
        );

        bannerLines[5] = String.join(" ",
                " *     * ",
                " *     * ",
                " *       ",
                " *     * "
        );

        bannerLines[6] = String.join(" ",
                "  *****  ",
                "  *****  ",
                " *       ",
                "  *****  "
        );

        // Print the banner using a for-each loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}