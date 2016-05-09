// Using Java, remove duplicate characters in a given string keeping only the first occurrences. 
// For example, if the input is ‘tree traversal’ the output will be "tre avsl". Enjoy:-)

 //solution
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicate;

/**
 *
 * @author kelvin
 */
public class Duplicate {

    public static void removeDuplicates(String input){
    String result = "";
    for (int i = 0; i < input.length(); i++) {
        if(!result.contains(String.valueOf(input.charAt(i)))) {
            result += String.valueOf(input.charAt(i));
        }
    }
    System.out.println(result);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     removeDuplicates("hello everyone");

    }

}
