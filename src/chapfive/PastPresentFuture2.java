/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapfive;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Frebby
 */
public class PastPresentFuture2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int mon = input.nextInt();
        int day = input.nextInt();
        LocalDate choice = LocalDate.of(year, Month.of(mon), day);
        LocalDate present = LocalDate.now();
        if (choice.isAfter(present)) {
            System.out.println("Date is sfter present");
        } else if (choice.isBefore(present)) {
            System.out.println("Date is before present");
        } else if (choice.isEqual(present)) {
            System.out.println("Date is equal to present");
        }

    }
}
