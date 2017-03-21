/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.practice;

/**
 *
 * @author Fiaz
 */

import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        int r;
        double pi=3.14,area;
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter radius of circle:");
        r = scan.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle:"+area);
    }            
       
    }
    

