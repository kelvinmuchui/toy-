/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capital;
import java.util.Scanner;
/**
 *
 * @author kelvin
 */
public class Capital {


    public static void main(String[] args)

    {
        System.out.print(" Please enter the string you need ?");
        Scanner  scan = new Scanner(System.in);

        String str=scan.nextLine();

        Capitalized( str );
    }

    static void Capitalized( String str ) {
        char ch;
        char prevCh;
        int i;
        prevCh = '.';
        for ( i = 0;  i < str.length();  i++ ) {
            ch = str.charAt(i);
            if ( Character.isLetter(ch)  &&  ! Character.isLetter(prevCh) )
                System.out.print( Character.toUpperCase(ch) );
            else
                System.out.print( ch );
            prevCh = ch;
        }
        System.out.println();
    }

}
