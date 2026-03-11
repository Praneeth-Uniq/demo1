import java.util.HashMap;
import java.util.Map;

public class UC8 {

    
    private static class CharacterPattern {
        private final String[] pattern;

        public CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }

        public String getLine(int index) {
            return (index >= 0 && index < pattern.length) ? pattern[index] : "         ";
        }
    }

    public static void main(String[] args) {
      
        Map<Character, CharacterPattern> patternMap = new HashMap<>();
        
        patternMap.put('O', new CharacterPattern(new String[]{
            "  *** ", " * * ", " * * ", " * * ", " * * ", " * * ", "  *** "
        }));
        
        patternMap.put('P', new CharacterPattern(new String[]{
            " ***** ", " * * ", " * * ", " ***** ", " * ", " * ", " * "
        }));
        
        patternMap.put('S', new CharacterPattern(new String[]{
            "  **** ", " * ", " * ", "  *** ", "      *", "      *", " **** "
        }));

        renderBanner("OOPS", patternMap);
    }

    
    public static void renderBanner(String word, Map<Character, CharacterPattern> map) {
       
        for (int i = 0; i < 7; i++) {
            StringBuilder lineBuilder = new StringBuilder();
            
          
            for (char c : word.toUpperCase().toCharArray()) {
                CharacterPattern cp = map.get(c);
                if (cp != null) {
                    lineBuilder.append(cp.getLine(i));
                } else {
                    
                    lineBuilder.append("         "); 
                }
            }
            
            System.out.println(lineBuilder.toString());
        }
    }
}
