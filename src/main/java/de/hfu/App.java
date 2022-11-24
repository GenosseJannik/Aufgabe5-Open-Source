package de.hfu;

import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/**
    	 * Beginn des Programms
    	 */
        Scanner scan = new Scanner(System.in);
        String eingabe = scan.next();
        System.out.println(eingabe.toUpperCase());
        scan.close();
    }
}
