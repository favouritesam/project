package LatestSamsongPhone;

import java.util.Scanner;

public class SamSungPhone {
    private int userInput;
    Scanner input = new Scanner(System.in);

    public String Menu() {
        return """
                1:Phone book
                2:Messages
                3:Chat
                4:Call register
                5:Tones
                6:Settings
                7:Call divert
                8:Games
                9:Calculator
                10:Reminder
                11:Clock
                12:Profiles
                13:Sim services
                """;

    }

    public void OptionMenu() {
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                PhoneBook();
                break;
            case 2:
                Messages();
                break;
            case 3:
                Chat();
                break;
            case 4:
                CallRegister();
                break;
            case 5:
                Tones();
                break;
            case 6:
                Settings();
                break;
            case 7:
                CallDivert();
                break;
            case 8:
                Games();
                break;
            case 9:
                Calculator();
                break;
            case 10:
                Reminder();
                break;
            case 11:
                Clock();
                break;
            case 12:
                Profiles();
                break;
            case 13:
                SimServices();
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    public void PhoneBook() {
        System.out.println("""
                1:Search
                2:Service Nos
                3:Add name
                4:Erase
                5:Edit
                6:Assign tone
                7:Send b'card
                8:Options
                9:Speed dials
                10:Voice tags
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Search");
                checkingPhoneBook();
                break;
            case 2:
                System.out.println("Service Nos");
                checkingPhoneBook();
                break;
            case 3:
                System.out.println("Add name");
                checkingPhoneBook();
                break;
            case 4:
                System.out.println("Erase");
                checkingPhoneBook();
                break;
            case 5:
                System.out.println("Edit");
                checkingPhoneBook();
                break;
            case 6:
                System.out.println("Assign tone");
                checkingPhoneBook();
                break;
            case 7:
                System.out.println("Send b' card");
                checkingPhoneBook();
                break;
            case 8:
                System.out.println("""
                        1:Type of view
                        2:Memory status
                        """);
                checkingPhoneBook();
                break;
            case 9:
                System.out.println("Speed dials");
                checkingPhoneBook();
                break;
            case 10:
                System.out.println("Voice tags");
                checkingPhoneBook();
                break;
        }
    }

    public void Messages() {
        System.out.println("""
                1:Write messages
                2:Inbox
                3:Outbox
                4:Picture messages
                5:Template
                6:Smiley
                7:Messages settings
                8:Info service
                9:Voice mailbox
                10:Service command editor
                """);
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Write messages");
                checkingMessages();
                break;
            case 2:
                System.out.println("Inbox");
                checkingMessages();
                break;
            case 3:
                System.out.println("Outbox");
                checkingMessages();
                break;
            case 4:
                System.out.println("Pictures messages");
                checkingMessages();
                break;
            case 5:
                System.out.println("Template");
                checkingMessages();
                break;
            case 6:
                System.out.println("Smiley");
                checkingMessages();
                break;
            case 7:
                System.out.println("""
                        1:Set 1
                        2:Common
                        """);
                checkingMessages();

                userInput = input.nextInt();
                switch (userInput) {
                    case 1:
                        System.out.println(""" 
                                1:Message center number
                                2:Messages set as 
                                3:Message validity
                                """);
                        checkingMessages();
                        break;
                }
                userInput = input.nextInt();
                switch (userInput) {
                    case 2:
                        System.out.println("""
                                1:Delivery report
                                2:Reply via same center
                                3:Character support
                                """);
                        checkingMessages();
                        break;
                    case 8:
                        System.out.println("info service");
                        checkingMessages();
                        break;
                    case 9:
                        System.out.println("Voice mailbox number");
                        checkingMessages();
                        break;
                    case 10:
                        System.out.println("Service command editor");
                        checkingMessages();
                }
        }

    }

    public void Chat() {
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Chat");
                checkingChat();
                break;
        }
    }

    public void CallRegister() {
        System.out.println("""
                1:Messed calls
                2:Received calls
                3:Dialled numbers
                """);
        CheckingCallRegister();
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("missed calls");
                CheckingCallRegister();
                break;
            case 2:
                System.out.println("Received calls");
                CheckingCallRegister();
                break;
            case 3:
                System.out.println("Dialled");
                CheckingCallRegister();
                break;
        }

    }

    public void Tones() {
        System.out.println("""
                1:Ringing tone
                2:Ringing Volume
                3:Incoming call alert
                """);
        CheckingTones();
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Ringing tone");
                CheckingTones();
                break;
            case 2:
                System.out.println("Ringing Volume");
                CheckingTones();
                break;
            case 3:
                System.out.println("Incoming call alert");
                CheckingTones();
                break;


        }
    }

    public void Settings() {
        System.out.println("""
                1:Call settings
                2:Phone setting
                """);
        CheckingSettings();
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("""
                        1:Automatic redial
                        2:Speed dialling
                        3:Call waiting option
                        """);
                CheckingSettings();
                break;
            case 2:
                System.out.println("checking phone setting");
                CheckingSettings();
                break;
        }
    }

    public void CallDivert() {
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("call diverting");
                CheckingCallDivert();
                break;
        }
    }

    public void Games() {
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("play Game");
                CheckingGames();
                break;

        }
    }

    public void Calculator() {
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Calculate");
                CheckingCalculator();
                break;

        }
    }

    public void Reminder() {
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Reminder");
                CheckingReminder();
                break;
        }
    }

    public void Clock() {
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Clock");
                CheckingClock();
                break;
        }
    }

    public void Profiles() {
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("profiles");
                CheckingProfiles();
                break;

        }
    }

    public void SimServices() {
        userInput = input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Sim services");
                CheckingSimServices();
                break;
        }
    }

    public void checkingPhoneBook() {
        System.out.println("Enter 0 to go back to menu,1 for main menu and 2 to exit");
        userInput = input.nextInt();
        if (userInput == 0) {
            PhoneBook();
        } else if (userInput == 1) {
            System.out.println(Menu());
            OptionMenu();

        } else if (userInput == 2) {
            System.out.println("press '2' to exit");


        }
    }

    public void checkingMessages() {
        System.out.println("Enter 0 to go back to menu,1 for main menu and 2 to exist");
        userInput = input.nextInt();
        if (userInput == 0) {
            Messages();
        } else if (userInput == 1) {
            System.out.println(Menu());
            OptionMenu();

        } else if (userInput == 2) {
            System.out.println("press 'no' to exit");


        }
    }

    public void checkingChat() {
        System.out.println("Enter 0 to go back to menu,1 for main menu and 2 to exist");
        userInput = input.nextInt();
        if (userInput == 0) {
            Chat();
        } else if (userInput == 1) {
            System.out.println(Menu());
            OptionMenu();

        } else if (userInput == 2) {
            System.out.println("press 'no' to exit");


        }
    }

    public void CheckingCallRegister() {
        System.out.println("Enter 0 to go back to menu,1 for main menu and 2 to exist");
        userInput = input.nextInt();
        if (userInput == 0) {
            CallRegister();
        } else if (userInput == 1) {
            System.out.println(Menu());
            OptionMenu();

        } else if (userInput == 2) {
            System.out.println("press 'no' to exit");
        }
    }

    public void CheckingTones() {
        System.out.println("Enter 0 to go back to menu,1 for main menu and 2 to exist");
        userInput = input.nextInt();
        if (userInput == 0) {
            CallRegister();
        } else if (userInput == 1) {
            System.out.println(Menu());
            Tones();

        } else if (userInput == 2) {
            System.out.println("press 'no' to exit");

        }
    }

    public void CheckingSettings() {
        System.out.println("Enter 0 to go back to menu,1 for main menu and 2 to exist");
        userInput = input.nextInt();
        if (userInput == 0) {
            CallRegister();
        } else if (userInput == 1) {
            System.out.println(Menu());
            Settings();

        } else if (userInput == 2) {
            System.out.println("press 'no' to exit");
        }
    }

    public void CheckingCallDivert() {
        System.out.println("Enter 0 to go back to menu,1 for main menu and 2 to exist");
        userInput = input.nextInt();
        if (userInput == 0) {
            CallDivert();
        } else if (userInput == 1) {
            System.out.println(Menu());
            Settings();

        } else if (userInput == 2) {
            System.out.println("press 'no' to exit");
        }
    }

    public void CheckingGames() {

        System.out.println("Enter 0 to go back to menu,1 for main menu and 2 to exist");
        userInput = input.nextInt();
        if (userInput == 0) {
            CallDivert();
        } else if (userInput == 1) {
            System.out.println(Menu());
            Games();

        } else if (userInput == 2) {
            System.out.println("press 'no' to exit");
        }
    }

    public void CheckingCalculator() {
        System.out.println("Enter 0 to go back to menu,1 for main menu and 2 to exist");
        userInput = input.nextInt();
        if (userInput == 0) {
            CallDivert();
        } else if (userInput == 1) {
            System.out.println(Menu());
            Calculator();

        } else if (userInput == 2) {
            System.out.println("press 'no' to exit");
        }
    }
    public void CheckingReminder(){
        System.out.println("Enter 0 to go back to menu,1 for main menu and 2 to exist");
        userInput = input.nextInt();
        if (userInput == 0) {
            CallDivert();
        } else if (userInput == 1) {
            System.out.println(Menu());
            Reminder();

        } else if (userInput == 2) {
            System.out.println("press 'no' to exit");
        }

    }
    public void  CheckingClock(){
        System.out.println("Enter 0 to go back to menu,1 for main menu and 2 to exist");
        userInput = input.nextInt();
        if (userInput == 0) {
            CallDivert();
        } else if (userInput == 1) {
            System.out.println(Menu());
            Clock();

        } else if (userInput == 2) {
            System.out.println("press 'no' to exit");
        }
    }
    public void CheckingProfiles(){
        System.out.println("Enter 0 to go back to menu,1 for main menu and 2 to exist");
        userInput = input.nextInt();
        if (userInput == 0) {
            CallDivert();
        } else if (userInput == 1) {
            System.out.println(Menu());
            Profiles();

        } else if (userInput == 2) {
            System.out.println("press 'no' to exit");
        }
    }
    public void CheckingSimServices(){
            System.out.println("Enter 0 to go back to menu,1 for main menu and 2 to exist");
            userInput = input.nextInt();
            if (userInput == 0) {
                CallDivert();
            } else if (userInput == 1) {
                System.out.println(Menu());
                SimServices();

            } else if (userInput == 2) {
                System.out.println("press 'no' to exit");
            }
        }
}