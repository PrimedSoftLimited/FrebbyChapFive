/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapfive;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Frebby
 */
public class PastPresentFuture {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        LocalDate dateChoice = LocalDate.of(year, month, month);
        LocalDate present = LocalDate.now();
        boolean isItYear = dateChoice.getYear() == present.getYear();
        boolean isItMonth = dateChoice.getMonth() == present.getMonth();
        boolean earlierMonth = dateChoice.isBefore(present)
                || dateChoice.isEqual(present);
        boolean laterMonth = dateChoice.isAfter(present)
                || dateChoice.isEqual(present);

        if (!isItYear) {
            System.out.println("Not this year");
        } else {
            System.out.println("This year");
        }

        if (isItMonth) {
            System.out.println("Entered month is the same with current month");
        } else {
            System.out.println("not the same month");
        }

        if (earlierMonth) {
            System.out.println("Month of chosen date, "
                    + dateChoice.getMonth()
                    + "is before month of present date, "
                    + present.getMonth());
        } else {
            System.out.println("Not what is expected");
        }

        if (laterMonth) {
            System.out.println("Month of chosen date, " + dateChoice.getMonth()
                    + "is after month of present date, " + present.getMonth());
        } else {
            System.out.println("Not what is expected");
        }

    }
}
