/*
 */

package com.andiandy.wiwinang;

import com.andiandy.wiwinang.speech.Recognizer;

import java.util.Scanner;

/**
 *
 * @author Andreas Houben
 */
public class Main {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		Recognizer recognizer = new Recognizer();
		Thread thread = new Thread( recognizer );
		thread.run();
        System.out.print("Program up an running. Enter X to Exit.");
        while (!sc.next().toUpperCase().equals("X")){}
    }
    
}
