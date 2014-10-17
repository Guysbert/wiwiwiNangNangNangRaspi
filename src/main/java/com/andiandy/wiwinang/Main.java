/*
 */

package com.andiandy.wiwinang;

import java.util.Scanner;

/**
 *
 * @author Andreas Houben
 */
public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Program up an running. Enter X to Exit.");
        while (!sc.next().toUpperCase().equals("X")){}
    }
    
}
