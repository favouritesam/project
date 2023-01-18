package LatestSamsongPhone;

import LatestSamsongPhone.SamSungPhone;

import java.util.Scanner;

public class SamSungPhoneMain {
    public static void main(String[] args) {
       SamSungPhone c20 =new SamSungPhone();
       Scanner scanner = new Scanner(System.in);

        String userInput;

       do {
           System.out.println(c20.Menu());
           c20.OptionMenu();
           c20.checkingPhoneBook();
           System.out.println("Do you want to continue?");
           userInput = scanner.next();
       }
       while (userInput.equalsIgnoreCase("Yes"));


//       do {
//           System.out.println("Do you want to continue?");
//       }
//       while (response == 1);

//        Scanner input = new Scanner("System.in");
//        SamSungPhone  c20 = new SamSungPhone();
//        c20.Menu();
//        int userInput=input.nextInt();
//        while (userInput !=-1){
//            switch (userInput){
//                case 1:
//                    c20.PhoneBook();
//                    break;
//                case 2:
//                    c20.Messages();
//                    break;
//                case 3:
//                    c20.Chat();
//                    break;
//                case 4:
//                    c20.CallRegister();
//                    break;
//                case 5:
//                    c20.Tones();
//                    break;
//                case 6:
//                    c20.Settings();
//                    break;
//                case 7:
//                    c20.CallDivert();
//                    break;
//                case 8:
//                    c20.Games();
//                    break;
//                case 9:
//                    c20 .Calculator();
//                    break;
//                case 10:
                //    c20.Reminder();
        //        break;
             //   case 11:
              //      c20 .Clock();
             //       break;
             //   case 12:
             //       c20.Profiles();
             //       break;
           //     case 13:
            //        c20.SimServices();
               //     break;

            }
}
