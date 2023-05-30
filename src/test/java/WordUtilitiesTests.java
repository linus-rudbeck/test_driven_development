import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import se.distansakademin.WordUtilities;

public class WordUtilitiesTests {

    @Test
    void testIsPalindrome(){
        assert WordUtilities.isPalindrome("anna");
        assert WordUtilities.isPalindrome("kajak");
        assert WordUtilities.isPalindrome("radar");

        assert !WordUtilities.isPalindrome("linus");
        assert !WordUtilities.isPalindrome("kaffekopp");
        assert !WordUtilities.isPalindrome("telefon");
    }

    @Test
    void testIsAnagram(){
        assert WordUtilities.isAnagram("anna", "nana");
        assert WordUtilities.isAnagram("anagram", "magarna");
        assert WordUtilities.isAnagram("teacher", "cheater");

        assert !WordUtilities.isAnagram("anna", "linus");
        assert !WordUtilities.isAnagram("maria", "magar");
        assert !WordUtilities.isAnagram("kalle", "peter");
    }

    @ParameterizedTest
    @CsvSource(value = {"TEST:test", "tEst:test", "Java:java"}, delimiter = ':')
    void testLowercase(String input, String expected){
        assert WordUtilities.lower(input).equals(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"test:TEST", "tEst:TEST", "Java:JAVA"}, delimiter = ':')
    void testUppercase(String input, String expected){
        assert WordUtilities.upper(input).equals(expected);
    }

    @Test
    void testWordRepeat(){
        assert WordUtilities.repeat("test", 3).equals("testtesttest");
        assert WordUtilities.repeat("Linus", 2).equals("LinusLinus");
        assert WordUtilities.repeat("JaVa", 1).equals("JaVa");
    }

    @Test
    void testWordRepeatDelimiter(){
        assert WordUtilities.repeatDelimiter("test", 3, ",").equals("test,test,test");
        assert WordUtilities.repeatDelimiter("Linus", 2, ":").equals("Linus:Linus");
        assert WordUtilities.repeatDelimiter("JaVa", 1, " ").equals("JaVa");
    }

}
