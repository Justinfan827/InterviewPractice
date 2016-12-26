package Main.ArraysAndStrings1;

import java.util.Hashtable;

/**
 * Exercises for Arrays and Strings from Cracking the coding interview
 */
public class ArraysAndStringsPractice {

  /**
   * Function to check if one string is a permutation of another string.
   */
  public static boolean permutation(String firstString, String secondString) {
    //if length is not equal, then they are not permutations of one another
    if (firstString.length() != secondString.length()) {
      return false;
    }

    //Initializing hash table
    Hashtable<Character, Integer> table = new Hashtable<>();
    for (int i = 0; i < firstString.length(); i++) {
      char letter = firstString.charAt(i);
      table.put(letter, 0);
    }

    for (int i = 0; i < secondString.length(); i++) {
      char letter = firstString.charAt(i);
      table.put(letter, 0);
    }

    //updating hash table.
    //if by the end, all the entries are 0, then return True.
    //Idea is that you increment when you see character in first string, decrement when you see character in second string
    //If all entries are 0, this means the frequency of characters is the same for both strings, hence permutation.

    for (int i = 0; i < firstString.length(); i++) {
      char letter = firstString.charAt(i);
      table.put(letter, table.get(letter) + 1);
    }
    for (int i = 0; i < secondString.length(); i++) {
      char letter = firstString.charAt(i);
      table.put(letter, table.get(letter) -1);
      //if the entry is negative, then that means immediately is not permutations
      if (table.get(letter) < 0) {
        return false;
      }
    }
    return true;
  }

}
