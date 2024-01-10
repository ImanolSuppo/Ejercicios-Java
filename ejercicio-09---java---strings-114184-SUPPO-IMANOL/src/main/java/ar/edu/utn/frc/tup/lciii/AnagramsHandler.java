package ar.edu.utn.frc.tup.lciii;

import java.util.Arrays;

public class AnagramsHandler {

    static Boolean isAnagram(String a, String b) {
        char[] array1 = a.toLowerCase().toCharArray();
        char[] array2 = b.toLowerCase().toCharArray();
        if(array1.length != array2.length)
            return false;
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]!=array2[i])
                return false;
        }
        return true;
    }
}
