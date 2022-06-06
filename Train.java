package com.zoho;


import java.sql.SQLOutput;

public class Train
{
    private final static String  TRAIN_NAME="CHERAN EXPRESS";

    private final static String  FROM="CHENNAI";
    private final static String  TO="SALEM";

    private final static String  STARTING_TIME="11.00 PM";
    private final static String  REACHING_TIME="6.00 AM";


    private static int lowerBerth=1;
    private static int middleBerth=1;
    private static int upperBerth=1;

    private final static int  TOTAL_SEATS=lowerBerth+middleBerth+upperBerth;

    private static int availableSeats=lowerBerth+middleBerth+upperBerth;

    protected void showTrainDetails()
    {
        System.out.println("Train Name :"+TRAIN_NAME);
        System.out.println();

        System.out.println("---------Location Details------------------");

        System.out.println("From :"+FROM);
        System.out.println("To :"+TO);
        System.out.println();

        System.out.println("---------Time Details------------------");

        System.out.println("Starting Time :"+STARTING_TIME);
        System.out.println("Reaching Time :"+REACHING_TIME);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
    }

    protected void showAvailableTickets()
    {
        System.out.println("Total Seats :"+TOTAL_SEATS);

        System.out.println("Lower Berth :"+lowerBerth);
        System.out.println("Middle Berth :"+middleBerth);
        System.out.println("Upper Berth :"+upperBerth);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
    }

    protected void bookTicket(char prefBerth)
    {
        if(prefBerth=='l' || prefBerth=='L'){
            if(lowerBerth>0){
                lowerBerth--;
                System.out.println("Ticket Booked Successfully......................");
            }else{
                System.err.println("Please Check The Availability Of Berth*******************************");
            }
        }else if(prefBerth=='m' || prefBerth=='M'){
                if(middleBerth>0){
                    middleBerth--;
                    System.out.println("Ticket Booked Successfully......................");
                }else{
                    System.err.println("Please Check The Availability Of Berth*************************");
                }
        }else if(prefBerth=='u' || prefBerth=='U'){
            if(upperBerth>0){
                upperBerth--;
                System.out.println("Ticket Booked Successfully......................");
            }else{
                System.err.println("Please Check The Availability Of Berth*********************************");
            }
        }else{
            System.err.println("CHOOSE APPROPRIATE KEY***************************");
        }
        System.out.println();
        System.out.println();
    }
}
