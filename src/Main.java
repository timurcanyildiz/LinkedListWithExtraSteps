import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        manualLL list = new manualLL();
        while (true) {
            Scanner scanner=new Scanner(System.in);

            System.out.println("\nPlease enter numbers 1 to 7." +
                    "\n" +
                    "Enter 1 to add to the first of the list." +
                    "\n" +
                    "Enter 2 to add to the last of the list." +
                    "\n" +
                    "Enter 3 to add a number in a sorted way to the list." +
                    "\n" +
                    "Enter 4 to add a number to a specific index of the list." +
                    "\n" +
                    "Enter 5 to print the list." +
                    "\n" +
                    "Enter 6 to exit the program.");

            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:
                    String chc = "/";
                    while (chc.equals("/")) {
                        System.out.println("type a number that you would like to add to the first of the list");
                        int num = scanner.nextInt();
                        scanner.nextLine();
                        list.addToFirst(num);
                        System.out.println("If you'd like to add more to the first press enter / . Press else to menu");
                        chc = scanner.next();
                        scanner.nextLine();
                    }
                    break;
                    case 2:
                        String chr = "/";
                        while (chr.equals("/")) {
                            System.out.println("type a number that you would like to add to the last of the list");
                            int num = scanner.nextInt();
                            list.addToLast(num);
                            System.out.println("If you'd like to add more to the first press enter / .");
                            chr = scanner.next();
                            scanner.nextLine();
                        }
                    break;
                    case 3:
                    String chrc = "/";
                    while (chrc.equals("/")) {
                        System.out.println("type a number that you would like to add to the first of the list");
                        int num = scanner.nextInt();
                        list.addSorted(num);
                        System.out.println("If you'd like to add more to the first press enter / .");
                        chrc = scanner.next();
                        scanner.nextLine();
                    }
                    break;
                case 4:
                    String chrr = "/";
                    while (chrr.equals("/")) {
                        System.out.println("type a number that you'd like to add to the index that you will choose");
                        int num = scanner.nextInt();
                        System.out.println("type the index for your number to put in");
                        int index = scanner.nextInt();
                        list.addToIndex(num,index);
                        System.out.println("If you'd like to add more to the first press enter / .");
                        chrr = scanner.next();
                    }
                    break;
                case 5:
                    list.printList();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("You've made a mistake sir. Please enter a number from 1-6");
            }
        }
    }
}