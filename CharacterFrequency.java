/**
 * Character Frequency
 *
 * A class that holds the data used for Huffman encoding. As a tree node has only one item of data, this class stores
 * a character and a frequency (key-value pair).
 *
 * This class is the data type for the tree. Accessor methods are provided as needed.
 */
public class CharacterFrequency implements Comparable<CharacterFrequency>
{
    private Character character;
    private Integer frequency;

    public CharacterFrequency(Character character, Integer frequency)
    {
        this.character = character;
        this.frequency = frequency;
    }

    public Character getCharacter()
    {
        return character;
    }

    public Integer getFrequency()
    {
        return frequency;
    }

    // The compareTo() method is overwritten to allow for comparison based on frequency values.
    @Override
    public int compareTo(CharacterFrequency data)
    {
        return frequency - data.frequency;
    }

    // The toString() method is overwritten to print out the character and frequency of the key:value pair.
    @Override
    public String toString()
    {
        return "" + character + ": " + frequency;
    }
}