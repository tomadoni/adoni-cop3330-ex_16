/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tom Adoni
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner kb= new Scanner(System.in);
	    int legalAge=16;
	    int age=0;
	    System.out.println("What is your age?");
	    age= kb.nextInt();
	    if(age<legalAge){
	        System.out.println("You are not old enough to legally drive.");
	    }
	    else{
	        System.out.println("You are old enough to legally drive.");
        }
    }
}
