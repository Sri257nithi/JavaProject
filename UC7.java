 public class UC7 {
     static class CharacterPatternMap {
        private char character;
        private String[] pattern;

       
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        
        public char getCharacter() {
            return character;
        }

        
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        
        String[] O = {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };

        String[] P = {
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        };

        String[] S = {
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        };

       
        CharacterPatternMap charO = new CharacterPatternMap('O', O);
        CharacterPatternMap charP = new CharacterPatternMap('P', P);
        CharacterPatternMap charS = new CharacterPatternMap('S', S);

        CharacterPatternMap[] patterns = {charO, charP, charS};

        String word = "OOPS";
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                for (CharacterPatternMap map : patterns) {
                    if (map.getCharacter() == c) {
                        line.append(map.getPattern()[i]).append("  ");
                    }
                }
            }

            System.out.println(line);
        }
    }
}
    
