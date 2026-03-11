public class UC7 {

   
    private static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        // Constructor to initialize the object
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getLine(int index) {
            return pattern[index];
        }
        
        public char getCharacter() {
            return character;
        }
    }

    public static void main(String[] args) {
      
        CharacterPattern o = new CharacterPattern('O', new String[]{
            "  *** ", " * * ", " * * ", " * * ", " * * ", " * * ", "  *** "
        });
        
        CharacterPattern p = new CharacterPattern('P', new String[]{
            " ***** ", " * * ", " * * ", " ***** ", " * ", " * ", " * "
        });
        
        CharacterPattern s = new CharacterPattern('S', new String[]{
            "  **** ", " * ", " * ", "  *** ", "      *", "      *", " **** "
        });

      
        String[] bannerLines = new String[7];
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join("", 
                o.getLine(i), 
                o.getLine(i), 
                p.getLine(i), 
                s.getLine(i)
            );
        }

      
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
