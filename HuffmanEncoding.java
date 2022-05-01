import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class HuffmanEncoding
{
    /**
     * Generate Frequency Table
     * <p>
     * The first step in creating the code for a given file is to learn what the character frequencies are.
     * First we create a Map with characters as keys and a frequencies as values.
     * Then we read the file one character at a time.
     * We add the character to the map if it is not there and increment the corresponding map value if it is there.
     * At the end we will have a map that maps each character to the number of times that it appears in the file.
     * <p>
     * (Note: in Java we have to use appropriate wrapper classes to store the character and the frequency,
     * because we cannot use primitives in a Map.)
     */
    private static Map<String, Integer> characterFrequencies(String filename) throws Exception
    {
        Map<String, Integer> characterFrequencies = new TreeMap<String, Integer>();

        String page = loadFileIntoString(filename);

        for (String s : page.split(""))
        {
            if (characterFrequencies.containsKey(s))
            {
                characterFrequencies.put(s, characterFrequencies.get(s) + 1);
            }

            else
            {
                characterFrequencies.put(s, 1);
            }
        }

        return characterFrequencies;
    }

    /**
     * Collects all the lines from a file into a single string.
     */
    private static String loadFileIntoString(String filename) throws Exception
    {
        BufferedReader input = new BufferedReader(new FileReader(filename));
        String str = "", line;

        while ((line = input.readLine()) != null)
        {
            str += line;
        }

        input.close();
        return str;
    }

    public static void main(String[] args) throws Exception
    {
        System.out.println(characterFrequencies("PS3/USConstitution.txt"));
//        System.out.println(characterFrequencies("PS3/WarAndPeace.txt"));
    }
}
