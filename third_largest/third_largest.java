// Using the Java language, have the function ThirdGreatest(strArr)
// take the array of strings stored in strArr and return the third largest word within in.
// So for example: if strArr is ["hello", "world", "before", "all"]
// your output should be world because "before" is 6 letters long, and "hello" and "world" are both 5, but the output should be world because it appeared as the last 5 letter word in the array. If strArr was ["hello", "world", "after", "all"] the output should be after because the first three words are all 5 letters long, so return the last one. The array will have at least three strings and each string will only contain letters.

// use the main method only for calling the function where your logic lies. :-)
// solutions
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest;

/**
 *
 * @author kelvin
 */
public class Largest {

    /**
     * @param values
     */
    public static void find(){
        int[] values = {56,45,34,46,34,32,2,4,65,75};
        int large = values [0] ;
        int small = values [0];
        for(int i =0 ; i < values.length; i++)
        {
            if(values[i]>large){
                large= values[i];

            }
        }
        System.out.println(large);

        for(int i =0 ; i < values.length; i++)
        {
            if(values[i]<small){
                small =values[i];

            }
        }
        System.out.println(small);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        find();
    }

}

