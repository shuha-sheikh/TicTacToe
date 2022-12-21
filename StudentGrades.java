//Mar 4th, 2022 Shuha Sheikh
import java.util.Scanner;

public class StudentGrades
{
    public static void main (String[] args)
    {
        Scanner id = new Scanner(System.in);

        System.out.printf ("%95s\n", "Student Report Cards");
        System.out.printf ("%100s\n", "Applewood Heights Secondary School");
        System.out.printf ("%95s\n", "Semester 2 Reporting");
        System.out.println();

        System.out.print("Please enter first letter of students name + student's ID number: ");
        String studentid = id.next();
        System.out.println();

        String [][] gradingscale = {
                                {"A+ = 97 - 100", "A = 93 - 98", "A- = 90 - 92"},
                                {"B+ = 87 - 89", "B = 83 - 88", "B- = 80 - 82"},
                                {"C+ = 77 - 79", "C = 73 - 78", "C- = 70 - 72"},
                                {"D+ = 67 - 69", "D = 65 - 66", "F = Below 65"},
        };//end array

        int avg1 = (98 + 94 + 90 + 87)/4;
        String [][] s658444 = {
                                {"Student Name:","Student ID #:", "Courses:", "# of students", "Class Average:",	"Mark:", "Total Average:", "Learning Skills:", "Absences:", "Lates:"},
                                {" "," ", " ", "in class:", " ",	" ", " ", " ", " ", " "},
                                {"Shuha S","658444", "Functions", "30", "71", "98", " ", "Excellent", "1", "4"},
                                {" "," ", "Chemistry", "26", "84",	"94", " ", "Excellent", "1", "0"},
                                {" "," ", "Com Sci", "15", "90", "90", " ", "Good", "1", "0"},
                                {" "," ", "French",	"27", "65", "87", " ", "Good", "2", "1"},
                                {" "," ", " ",	" ", " ", " ", String.valueOf(avg1), " ", " ", " "},

        };//end array

        int avg2 = (90 + 91 + 90 + 86)/4;
        String [][] a716782 = {
                                {"Student Name:","Student ID #:", "Courses:", "# of students", "Class Average:",	"Mark:", "Total Average:", "Learning Skills:", "Absences:", "Lates:"},
                                {" "," ", " ", "in class:", " ",	" ", " ", " ", " ", " "},
                                {"Aleeza B","716782", "Functions", "30", "71", "90", " ", "Excellent", "0", "2"},
                                {" "," ", "Chemistry", "26", "84",	"91", " ", "Excellent", "1", "0"},
                                {" "," ", "Com Sci", "15", "90", "90", " ", "Good", "0", "0"},
                                {" "," ", "French",	"27", "65", "86", " ", "Good", "2", "4"},
                                {" "," ", " ",	" ", " ", " ", String.valueOf(avg2), " ", " ", " "},
        };//end array

        int avg3 = (85 + 93 + 85 + 84)/4;
        String [][] s852147 = {
                                {"Student Name:","Student ID #:", "Courses:", "# of students", "Class Average:",	"Mark:", "Total Average:", "Learning Skills:", "Absences:", "Lates:"},
                                {" "," ", " ", "in class:", " ",	" ", " ", " ", " ", " "},
                                {" "," ", "Chemistry", "26", "84",	"93", " ", "Excellent", "1", "0"},
                                {" "," ", "Com Sci", "15", "90", "85", " ", "Good", "3", "4"},
                                {" "," ", "French",	"27", "65", "84", " ", "Good", "0", "0"},
                                {" "," ", " ",	" ", " ", " ", String.valueOf(avg3), " ", " ", " "},
        };//end array

        int avg4 = (60 + 81 + 73 + 59)/4;
        String [][] k649875 = {
                                {"Student Name:","Student ID #:", "Courses:", "# of students", "Class Average:",	"Mark:", "Total Average:", "Learning Skills:", "Absences:", "Lates:"},
                                {" "," ", " ", "in class:", " ",	" ", " ", " ", " ", " "},
                                {"Katelin L","649875", "Functions", "30", "71", "60", " ", "Can improve", "4", "4"},
                                {" "," ", "Chemistry", "26", "84",	"81", " ", "Good", "2", "0"},
                                {" "," ", "Com Sci", "15", "90", "73", " ", "Better", "3", "2"},
                                {" "," ", "French",	"27", "65", "59", " ", "Can improve", "2", "5"},
                                {" "," ", " ",	" ", " ", " ", String.valueOf(avg4), " ", " ", " "},
        };//end array

        int avg5 = (71 + 84 + 65 + 67)/4;
        String [][] j264531 = {
                                {"Student Name:","Student ID #:", "Courses:", "# of students", "Class Average:",	"Mark:", "Total Average:", "Learning Skills:", "Absences:", "Lates:"},
                                {" "," ", " ", "in class:", " ",	" ", " ", " ", " ", " "},
                                {"Jihan A","264531", "Functions", "30", "71", "71", " ", "Better", "1", "3"},
                                {" "," ", "Chemistry", "26", "84",	"84", " ", "Good", "1", "0"},
                                {" "," ", "Com Sci", "15", "90", "65", " ", "Can improve", "2", "0"},
                                {" "," ", "French",	"27", "65", "67", " ", "Can improve", "0", "0"},
                                {" "," ", " ",	" ", " ", " ", String.valueOf(avg5), " ", " ", " "},
        };//end array

        int avg6 = (84 + 89 + 84 + 90)/4;
        String [][] p846259 = {
                                {"Student Name:","Student ID #:", "Courses:", "# of students", "Class Average:",	"Mark:", "Total Average:", "Learning Skills:", "Absences:", "Lates:"},
                                {" "," ", " ", "in class:", " ",	" ", " ", " ", " ", " "},
                                {"Phoebe B","846529", "Functions", "30", "71", "84", " ", "Good", "1", "4"},
                                {" "," ", "Chemistry", "26", "84",	"89", " ", "Excellent", "1", "0"},
                                {" "," ", "Com Sci", "15", "90", "84", " ", "Good", "1", "0"},
                                {" "," ", "French",	"27", "65", "90", " ", "Excellent", "2", "1"},
                                {" "," ", " ",	" ", " ", " ", String.valueOf(avg6), " ", " ", " "},
        };//end array

        int avg7 = (59 + 79 + 92 + 85)/4;
        String [][] r848563 = {
                                {"Student Name:","Student ID #:", "Courses:", "# of students", "Class Average:",	"Mark:", "Total Average:", "Learning Skills:", "Absences:", "Lates:"},
                                {" "," ", " ", "in class:", " ",	" ", " ", " ", " ", " "},
                                {"Rachel G","848563", "Functions", "30", "71", "59", " ", "Can improve", "0", "5"},
                                {" "," ", "Chemistry", "26", "84",	"79", " ", "Better", "0", "0"},
                                {" "," ", "Com Sci", "15", "90", "92", " ", "Excellent", "0", "0"},
                                {" "," ", "French",	"27", "65", "85", " ", "Good", "5", "1"},
                                {" "," ", " ",	" ", " ", " ", String.valueOf(avg7), " ", " ", " "},
        };//end array

        int avg8 = (75 + 98 + 81 + 92)/4;
        String [][] r418503 = {
                                {"Student Name:","Student ID #:", "Courses:", "# of students", "Class Average:",	"Mark:", "Total Average:", "Learning Skills:", "Absences:", "Lates:"},
                                {" "," ", " ", "in class:", " ",	" ", " ", " ", " ", " "},
                                {"Ross G","418503", "Functions", "30", "71", "75", " ", "Better", "0", "4"},
                                {" "," ", "Chemistry", "26", "84",	"98", " ", "Excellent", "0", "0"},
                                {" "," ", "Com Sci", "15", "90", "73", " ", "Better", "0", "0"},
                                {" "," ", "French",	"27", "65", "93", " ", "Excellent", "0", "1"},
                                {" "," ", " ",	" ", " ", " ", String.valueOf(avg8), " ", " ", " "},
        };//end array

        int avg9 = (65 + 94 + 81 + 92)/4;
        String [][] m924508 = {
                                {"Student Name:","Student ID #:", "Courses:", "# of students", "Class Average:",	"Mark:", "Total Average:", "Learning Skills:", "Absences:", "Lates:"},
                                {" "," ", " ", "in class:", " ",	" ", " ", " ", " ", " "},
                                {"Monica G","924508", "Functions", "30", "71", "65", " ", "Can improve", "0", "0"},
                                {" "," ", "Chemistry", "26", "84",	"94", " ", "Excellent", "0", "0"},
                                {" "," ", "Com Sci", "15", "90", "81", " ", "Good", "0", "0"},
                                {" "," ", "French",	"27", "65", "92", " ", "Excellent", "0", "0"},
                                {" "," ", " ",	" ", " ", " ", String.valueOf(avg9), " ", " ", " "},
        };//end array

        int avg10 = (87 + 53 + 86 + 81)/4;
        String [][] c879008 = {
                                {"Student Name:","Student ID #:", "Courses:", "# of students", "Class Average:",	"Mark:", "Total Average:", "Learning Skills:", "Absences:", "Lates:"},
                                {" "," ", " ", "in class:", " ",	" ", " ", " ", " ", " "},
                                {"Chandler B","879008", "Functions", "30", "71", "87", " ", "Excellent", "0", "4"},
                                {" "," ", "Chemistry", "26", "84",	"53", " ", "Can improve", "0", "5"},
                                {" "," ", "Com Sci", "15", "90", "86", " ", "Good", "0", "0"},
                                {" "," ", "French",	"27", "65", "81", " ", "Good", "0", "1"},
                                {" "," ", " ",	" ", " ", " ", String.valueOf(avg10), " ", " ", " "},
        };//end array

        int avg11 = (59 + 61 + 94 + 98)/4;
        String [][] j273756 = {
                                {"Student Name:","Student ID #:", "Courses:", "# of students", "Class Average:",	"Mark:", "Total Average:", "Learning Skills:", "Absences:", "Lates:"},
                                {" "," ", " ", "in class:", " ",	" ", " ", " ", " ", " "},
                                {"Joey T","273756", "Functions", "30", "71", "59", " ", "Can improve", "5", "4"},
                                {" "," ", "Chemistry", "26", "84",	"61", " ", "Can improve", "6", "1"},
                                {" "," ", "Com Sci", "15", "90", "94", " ", "Excellent", "1", "0"},
                                {" "," ", "French",	"27", "65", "98", " ", "Excellent", "2", "1"},
                                {" "," ", " ",	" ", " ", " ", String.valueOf(avg11), " ", " ", " "},
        };//end array

        int avg12 = (68 + 85 + 75 + 78)/4;
        String [][] j574698 = {
                                {"Student Name:","Student ID #:", "Courses:", "# of students", "Class Average:",	"Mark:", "Total Average:", "Learning Skills:", "Absences:", "Lates:"},
                                {" "," ", " ", "in class:", " ",	" ", " ", " ", " ", " "},
                                {"Jake P","574698", "Functions", "30", "71", "68", " ", "Can improve", "0", "4"},
                                {" "," ", "Chemistry", "26", "84",	"85", " ", "Excellent", "1", "0"},
                                {" "," ", "Com Sci", "15", "90", "75", " ", "Better", "1", "0"},
                                {" "," ", "French",	"27", "65", "78", " ", "Better", "2", "3"},
                                {" "," ", " ",	" ", " ", " ", String.valueOf(avg12), " ", " ", " "},
        };//end array

        int avg13 = (73 + 94 + 78 + 89)/4;
        String [][] a612654 = {
                                {"Student Name:","Student ID #:", "Courses:", "# of students", "Class Average:",	"Mark:", "Total Average:", "Learning Skills:", "Absences:", "Lates:"},
                                {" "," ", " ", "in class:", " ",	" ", " ", " ", " ", " "},
                                {"Amy S","612654", "Functions", "30", "71", "73", " ", "Better", "1", "4"},
                                {" "," ", "Chemistry", "26", "84",	"94", " ", "Excellent", "1", "0"},
                                {" "," ", "Com Sci", "15", "90", "78", " ", "Better", "1", "0"},
                                {" "," ", "French",	"27", "65", "89", " ", "Good", "2", "1"},
                                {" "," ", " ",	" ", " ", " ", String.valueOf(avg13), " ", " ", " "},
        };//end array

        int avg14 = (91 + 78 + 84 + 86)/4;
        String [][] r321654 = {
                                {"Student Name:","Student ID #:", "Courses:", "# of students", "Class Average:",	"Mark:", "Total Average:", "Learning Skills:", "Absences:", "Lates:"},
                                {" "," ", " ", "in class:", " ",	" ", " ", " ", " ", " "},
                                {"Rosa D","321654", "Functions", "30", "71", "91", " ", "Excellent", "1", "0"},
                                {" "," ", "Chemistry", "26", "84",	"78", " ", "Better", "4", "0"},
                                {" "," ", "Com Sci", "15", "90", "84", " ", "Good", "3", "0"},
                                {" "," ", "French",	"27", "65", "86", " ", "Good", "2", "0"},
                                {" "," ", " ",	" ", " ", " ", String.valueOf(avg14), " ", " ", " "},
        };//end array

        int avg15 = (85 + 65 + 81 + 56)/4;
        String [][] r498789 = {
                                {"Student Name:","Student ID #:", "Courses:", "# of students", "Class Average:",	"Mark:", "Total Average:", "Learning Skills:", "Absences:", "Lates:"},
                                {" "," ", " ", "in class:", " ",	" ", " ", " ", " ", " "},
                                {"Raymond H","498789", "Functions", "30", "71", "85", " ", "Good", "0", "0"},
                                {" "," ", "Chemistry", "26", "84",	"65", " ", "Can improve", "0", "0"},
                                {" "," ", "Com Sci", "15", "90", "81", " ", "Good", "0", "0"},
                                {" "," ", "French",	"27", "65", "56", " ", "Can improve", "0", "1"},
                                {" "," ", " ",	" ", " ", " ", String.valueOf(avg15), " ", " ", " "},
        };//end array

    System.out.println("Grading Scale:");
    System.out.println("--------------------------------------------------------");

     for(int r = 0; r < 4; r++) {
        for(int c = 0; c < 3; c++){
                    System.out.printf("%-16s %-2s", gradingscale[r][c], "|");
        }//end inner loop
        System.out.println();
        System.out.println("--------------------------------------------------------");
       }//end for loop

    System.out.println();
    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    if (studentid.equals("s658444"))
    {
        for(int r = 0; r < 2; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", s658444[r][c], "|");
        }//end inner loop
        System.out.println();
       }//end for loop
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int r = 2; r < 7; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", s658444[r][c], "|");
        }//end inner loop
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       }//end for loop
     System.out.println("COMMENTS: Shuha demonstrates great effort in class, she can keep pushing herself further.");
     System.out.printf("%60s %60s\n", "DATE: March 4th, 2022", "Teacher's Signature: Sheikh");
    }//end if - shuha

       else if (studentid.equals("a716782"))
    {
        for(int r = 0; r < 2; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", a716782[r][c], "|");
        }//end inner loop
        System.out.println();
       }//end for loop
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int r = 2; r < 7; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", a716782[r][c], "|");
        }//end inner loop
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       }//end for loop
     System.out.println("COMMENTS: Aleeza demonstrates great resilience in class, keep up the good work.");
     System.out.printf("%60s %60s\n", "DATE: March 4th, 2022", "Teacher's Signature: Sheikh");
    }//end if - aleeza

      else if (studentid.equals("s852147"))
    {
        for(int r = 0; r < 2; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", s852147[r][c], "|");
        }//end inner loop
        System.out.println();
       }//end for loop
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int r = 2; r < 7; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", s852147[r][c], "|");
        }//end inner loop
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       }//end for loop
     System.out.println("COMMENTS: Symphony is an excellent passionate student, very enthusiastic.");
     System.out.printf("%60s %60s\n", "DATE: March 4th, 2022", "Teacher's Signature: Sheikh");
    }//end if - symphony

     else if (studentid.equals("k649875"))
    {
        for(int r = 0; r < 2; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", k649875[r][c], "|");
        }//end inner loop
        System.out.println();
       }//end for loop
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int r = 2; r < 7; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", k649875[r][c], "|");
        }//end inner loop
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       }//end for loop
     System.out.println("COMMENTS: Katelin is a great student but has trouble staying focused in class.");
     System.out.printf("%60s %60s\n", "DATE: March 4th, 2022", "Teacher's Signature: Sheikh");
    }//end if - katelin

      else if (studentid.equals("j264531"))
    {
        for(int r = 0; r < 2; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", j264531[r][c], "|");
        }//end inner loop
        System.out.println();
       }//end for loop
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int r = 2; r < 7; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", j264531[r][c], "|");
        }//end inner loop
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       }//end for loop
     System.out.println("COMMENTS: Jihan has great potential but needs to keep up with the work load.");
     System.out.printf("%60s %60s\n", "DATE: March 4th, 2022", "Teacher's Signature: Sheikh");
    }//end if - jihan

      else if (studentid.equals("p846259"))
    {
        for(int r = 0; r < 2; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", p846259[r][c], "|");
        }//end inner loop
        System.out.println();
       }//end for loop
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int r = 2; r < 7; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", p846259[r][c], "|");
        }//end inner loop
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       }//end for loop
     System.out.println("COMMENTS: Phoebe demonstrates great effort in class, she can keep pushing herself further.");
     System.out.printf("%60s %60s\n", "DATE: March 4th, 2022", "Teacher's Signature: Sheikh");
    }//end if - phoebe

      else if (studentid.equals("r848563"))
    {
        for(int r = 0; r < 2; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", r848563[r][c], "|");
        }//end inner loop
        System.out.println();
       }//end for loop
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int r = 2; r < 7; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", r848563[r][c], "|");
        }//end inner loop
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       }//end for loop
     System.out.println("COMMENTS: Rachel demonstrates great resilience in class, keep up the good work.");
     System.out.printf("%60s %60s\n", "DATE: March 4th, 2022", "Teacher's Signature: Sheikh");
    }//end if - rachel

      else if (studentid.equals("r418503"))
    {
        for(int r = 0; r < 2; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", r418503[r][c], "|");
        }//end inner loop
        System.out.println();
       }//end for loop
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int r = 2; r < 7; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", r418503[r][c], "|");
        }//end inner loop
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       }//end for loop
     System.out.println("COMMENTS: Ross is an excellent passionate student, very enthusiastic.");
     System.out.printf("%60s %60s\n", "DATE: March 4th, 2022", "Teacher's Signature: Sheikh");
    }//end if - ross

      else if (studentid.equals("m924508"))
    {
        for(int r = 0; r < 2; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", m924508[r][c], "|");
        }//end inner loop
        System.out.println();
       }//end for loop
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int r = 2; r < 7; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", m924508[r][c], "|");
        }//end inner loop
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       }//end for loop
     System.out.println("COMMENTS: Monica is a great student but has trouble staying focused in class.");
     System.out.printf("%60s %60s\n", "DATE: March 4th, 2022", "Teacher's Signature: Sheikh");
    }//end if - monica

      else if (studentid.equals("c879008"))
    {
        for(int r = 0; r < 2; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", c879008[r][c], "|");
        }//end inner loop
        System.out.println();
       }//end for loop
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int r = 2; r < 7; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", c879008[r][c], "|");
        }//end inner loop
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       }//end for loop
     System.out.println("COMMENTS: Chandler has great potential but needs to keep up with the work load.");
     System.out.printf("%60s %60s\n", "DATE: March 4th, 2022", "Teacher's Signature: Sheikh");
    }//end if - chandler

      else if (studentid.equals("j273756"))
    {
        for(int r = 0; r < 2; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", j273756[r][c], "|");
        }//end inner loop
        System.out.println();
       }//end for loop
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int r = 2; r < 7; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", j273756[r][c], "|");
        }//end inner loop
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       }//end for loop
     System.out.println("COMMENTS: Joey demonstrates great effort in class, he can keep pushing himself further.");
     System.out.printf("%60s %60s\n", "DATE: March 4th, 2022", "Teacher's Signature: Sheikh");
    }//end if - joey

      else if (studentid.equals("j574698"))
    {
        for(int r = 0; r < 2; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", j574698[r][c], "|");
        }//end inner loop
        System.out.println();
       }//end for loop
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int r = 2; r < 7; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", j574698[r][c], "|");
        }//end inner loop
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       }//end for loop
     System.out.println("COMMENTS: Jake demonstrates great resilience in class, keep up the good work.");
     System.out.printf("%60s %60s\n", "DATE: March 4th, 2022", "Teacher's Signature: Sheikh");
    }//end if - jake

      else if (studentid.equals("a612654"))
    {
        for(int r = 0; r < 2; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", a612654[r][c], "|");
        }//end inner loop
        System.out.println();
       }//end for loop
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int r = 2; r < 7; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", a612654[r][c], "|");
        }//end inner loop
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       }//end for loop
     System.out.println("COMMENTS: Amy is an excellent passionate student, very enthusiastic.");
     System.out.printf("%60s %60s\n", "DATE: March 4th, 2022", "Teacher's Signature: Sheikh");
    }//end if - amy

      else if (studentid.equals("r321654"))
    {
        for(int r = 0; r < 2; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", r321654[r][c], "|");
        }//end inner loop
        System.out.println();
       }//end for loop
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int r = 2; r < 7; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", r321654[r][c], "|");
        }//end inner loop
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       }//end for loop
     System.out.println("COMMENTS: Rosa is a great student but has trouble staying focused in class.");
     System.out.printf("%60s %60s\n", "DATE: March 4th, 2022", "Teacher's Signature: Sheikh");
    }//end if - rosa

      else if (studentid.equals("r498789"))
    {
        for(int r = 0; r < 2; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", r498789[r][c], "|");
        }//end inner loop
        System.out.println();
       }//end for loop
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int r = 2; r < 7; r++) {
        for(int c = 0; c < 10; c++){
                    System.out.printf("%-16s %-2s", r498789[r][c], "|");
        }//end inner loop
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
       }//end for loop
     System.out.println("COMMENTS: Raymond has great potential but needs to keep up with the work load.");
     System.out.printf("%60s %60s\n", "DATE: March 4th, 2022", "Teacher's Signature: Sheikh");
    }//end if - raymond

    else
    {
        System.out.println("Sorry the combination you have entered is not found in the system. Please try again next time. Thank you.");
    }//end else

    }//end main
}//end class