public class DNA {
    public static void main(String[] args) {
        String[] dna =
        {
         "        ooo   ",
         "     ooo---oo ",
         "   oo--------o",
         " oo----------o",
         "o----------oo ",
         "o-------ooo   ",
         " oo--ooo      ",
         "   oo         ",
        };
        String adn;
            for (int i = 0; i < 15; i++) {
                if (i%2 == 0) {
                    for (int j = 0; j < 7; j++) {
                        adn = dna[j];
                        System.out.println(adn);
                    }
                } else if(i%2 == 1) {
                    for (int j = 7; j > 0; j--) {
                        adn = dna[j];
                        System.out.println(adn);
                    }
                }
            }
    }
}
