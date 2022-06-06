package com.zoho;

import java.util.Scanner;

public class TrainTicketBooking{
    static {
        System.out.println("1.TO GET TRAIN DETAILS");
        System.out.println("2.TO GET AVAILABILITY OF BERTH");
        System.out.println("3.TO BOOK TICKET");
        System.out.println("4.EXIT");
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args)
    {
        User newUser=new User();

        boolean loopBreaker=true;

        while(loopBreaker)
        {
            Scanner input=new Scanner(System.in);
            System.out.println("Choose Process............");
            int key=input.nextInt();
            System.out.println();
            System.out.println();
            switch (key)
            {
                case 1:
                    newUser.showTrainDetails();
                    break;

                case 2:
                    newUser.showAvailableTickets();
                    break;

                case 3:

                    System.out.println("Please Choose The Berth.........");
                    System.out.println("For lower berth = l");
                    System.out.println("For middle berth = m");
                    System.out.println("For upper berth = u");

                    char berth=input.next().charAt(0);

                    newUser.bookTicket(berth);
                    break;
                case 4:
                    loopBreaker=false;
                    System.out.println("Thank you.........**");
                    break;
            }

        }
    }
}
