//Feb 11, 2022 Shuha Sheikh

public class AirOntario
{
    public static void main (String[] args)
    {
        //code for red \u001B[31m
        //code for reset \u001B[0m
        //code for green \u001B[32m
        //code for yellow \u001B[33m
        //code for blue \u001B[34m
        //code for blue bold \033[1;34m

        System.out.printf ("%80s\n", "Welcome to Ontario Airport");
        System.out.printf ("%90s\n", "Thank you for choosing to fly with Air Ontario");
        System.out.printf ("%85s\n", "Flight information can be found below:");
        System.out.println();

        String [][] FlightInfo = {
                                    {"Terminal","Flight #", "City",	"Scheduled", "Departure", "Arrival", "Status", "Destination", "Carousal #"},
                                    {"","", "",	"Departure", "Time", "Time", "", "Code", ""},
                                    {"1", "007", "Chicago", "Jan 3", "2:57 PM", "5:59 PM", "On time", "CHZ", "A"},
                                    {"2", "012", "Boston", "Jan 4", "5:03 PM", "7:27 PM", "On time", "BON", "B"},
                                    {"5", "015", "New York", "Jan 6", "9:00 PM", "10:00 PM", "Delayed", "NYK", "D"},
                                    {"6", "022", "Atlanta", "Jan 7", "3:23 PM", "8:33 PM", "On time", "ATL", "E"},
                                    {"---", "036", "Miami", "Feb 1", "12:05 AM", "6:25 AM", "On time", "MIM", "---"},
                                    {"1", "101", "Dallas", "Jan 31", "8:10 PM", "1:57 AM", "Arrived", "DLS", "A"},
                                    {"6", "046", "Houston", "Jan 23", "10:50 PM", "3:57 PM", "On time", "HOS", "C"},
                                    {"4", "009", "Edmonton", "Jan 16", "6:00 PM", "9:28 PM", "Delayed", "EDM", "E"},
                                    {"3", "030", "Hamilton", "Jan 3", "4:36 PM", "5:37 PM", "Arrived", "HMT", "B"},
                                    {"---", "103", "Detroit", "Jan 8", "5:00 AM", "12:04 PM", "On time", "DTR", "---"},
                                    {"2", "002", "Vancouver", "Jan 14", "7:23 PM", "12:32 PM", "On time", "VNC", "D"},
                                    {"5", "087", "Calgary", "Jan 28", "1:47 PM", "3:27 PM", "On time", "CLG", "F"},
        };//end array

       for(int r = 0; r < 2; r++) {
        for(int c = 0; c < 9; c++){
                    System.out.printf("%-12s %-2s", FlightInfo[r][c], "|");
        }//end inner loop
        System.out.println();
       }//end for loop
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

        for(int r = 2; r < 14; r++)
        {
            for(int c = 0; c < 9; c++)
            {
                if (c == 7)
                {
                    System.out.printf("\033[1;34m%-12s \u001B[0m%-2s", FlightInfo[r][c], "|");
                }//destination code colour

                else if (c == 6 && r == 2 || c == 6 && r == 3 || c == 6 && r == 5 || c == 6 && r == 6 || c == 6 && r == 8 || c == 6 && r == 11 || c == 6 && r == 12 || c == 6 && r == 13)
                {
                    System.out.printf("\u001B[32m%-12s \u001B[0m%-2s", FlightInfo[r][c], "|");
                }//on time colour

                else if (c == 6 && r == 4 || c == 6 && r == 9)
                {
                    System.out.printf("\u001B[31m%-12s \u001B[0m%-2s", FlightInfo[r][c], "|");
                }//delayed colour

                else if (c == 6 && r == 7 || c == 6 && r == 10)
                {
                    System.out.printf("\u001B[33m%-12s \u001B[0m%-2s", FlightInfo[r][c], "|");
                }//arrived colour

                else
                {
                    System.out.printf("%-12s %-2s", FlightInfo[r][c], "|");
                }//end else

            }//end inner loop

            System.out.println();
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
       }//end for loop

    }//end main
}//end class