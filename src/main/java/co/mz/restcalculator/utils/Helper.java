package co.mz.restcalculator.utils;


/**
 * @author Dário Silvano Maxaieie
 */
public class Helper {

    public static boolean containsConsonant(String searchString){
        String consonants = ".*[bcdfghjklmnpqrstvwxz].*";
        return searchString.matches(consonants);
    }
}
