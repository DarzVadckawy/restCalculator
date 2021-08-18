package mz.co.restcalculator.utils;


/**
 * @author Dário Silvano Maxaieie
 * This class has all the methods that can help you in some generic process, with methods that can make
 * coding the program easier.
 */
public class Helper {

    /**
     * @param searchString
     * @return boolean that's indicate if a string contains or not a consonant
     */
    public static boolean containsConsonant(String searchString){
        String consonants = ".*[bcdfghjklmnpqrstvwxz].*";
        return searchString.matches(consonants);
    }
}
