package ar.edu.utn.frc.tup.lciii;

public class SubStringHandler {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        smallest = s.substring(0, k);
        largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String subCadena = s.substring(i, i + k);
            if (subCadena.compareTo(smallest) < 0) {
                smallest = subCadena;
            }
            if (subCadena.compareTo(largest) > 0) {
                largest = subCadena;
            }
        }

        return smallest + "\n" + largest;
    }
}
