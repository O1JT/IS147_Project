//Justin Thai
//jthai2@umbc.edu
import java.util.Scanner;
public class GPUapp {

    public static void main(String[] args) {
        startingMenu();
    }

    public static void startingMenu() {
        char repeat;
        String input;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("So it looks like you're in the market for an Nvidia GPU, welcome to the Nvidia GPU" +
                " rankings list!");
        do {
            System.out.println("Would you like to view all the newer graphics cards available? " +
                    "Press Y for yes or N for no...");
            input = keyboard.nextLine();
            repeat = input.charAt(0);
        } while (repeat == 'N' || repeat == 'n');
        graphicsCardMenu();

    }

    public static void graphicsCardMenu() {
        for (;;) {

            System.out.println("\t*NVIDIA GRAPHICS CARDS*");

            System.out.println("0. Exit");

            System.out.println("1. GeForce 10 series cards");

            System.out.println("2. GeForce 16 series cards");

            System.out.println("3. GeForce 20 series cards");

            System.out.println("4. GeForce 30 series cards");

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your choice as a number");

            int opt = input.nextInt();
            int option = opt;


            switch (option) {

                case 0:
                    System.out.println("Exiting...");
                    return;

                case 1:
                    tenSeriesMenu();
                    break;

                case 2:
                    sixteenSeriesMenu();
                    break;

                case 3:
                    twentySeriesMenu();
                    break;

                case 4:
                    thirtySeriesMenu();
                    break;

                default:
                    System.out.println("Invalid Option");
                    break;

            }

        }
    }

    public static void tenSeriesMenu() {


        char repeat = 0;
        String input;
        System.out.println("You've chosen to look at the GeForce 10 series graphics cards!");

        System.out.println("\t* Top four GeForce 10 series cards in order of performance and power*");

        System.out.println("0. Go back to graphics card list");

        System.out.println("1. NVIDIA TITAN XP");

        System.out.println("2. NVIDIA TITAN X");

        System.out.println("3. GeForce GTX 1080ti");

        System.out.println("4. GeForce GTX 1080");

        Scanner selectGPU10 = new Scanner(System.in);
        System.out.println("Enter your choice as a number");

        int selectedGPU10 = selectGPU10.nextInt();

        int selectionGPU10 = selectedGPU10;


        switch (selectionGPU10) {

            case 0:
                System.out.println("Going back...");

                return;

            case 1:
                System.out.println("You've chosen the NVIDIA TITAN XP!");
                System.out.println("Press X to return to the graphics card list");
                selectGPU10.nextLine();
                input = selectGPU10.nextLine();
                repeat = input.charAt(0);
                if (repeat == 'X' || repeat == 'x')
                    return;

            case 2:
                System.out.println("You've chosen the NVIDIA TITAN X!");
                System.out.println("Press X to return to the graphics card list");
                selectGPU10.nextLine();
                input = selectGPU10.nextLine();
                repeat = input.charAt(0);
                if (repeat == 'X' || repeat == 'x')
                    return;

            case 3:
                System.out.println("You've chosen the GeForce GTX 1080ti!");
                System.out.println("Press X to return to the graphics card list");
                selectGPU10.nextLine();
                input = selectGPU10.nextLine();
                repeat = input.charAt(0);
                if (repeat == 'X' || repeat == 'x')
                    return;

            case 4:
                System.out.println("You've chosen the GeForce GTX 1080!");
                System.out.println("Press X to return to the graphics card list");
                selectGPU10.nextLine();
                input = selectGPU10.nextLine();
                repeat = input.charAt(0);
                if (repeat == 'X' || repeat == 'x')
                    return;

            default:
                System.out.println("Invalid Option");
                break;
        }
        while (repeat == 'Y' || repeat == 'y') ;
    }


    public static void sixteenSeriesMenu() {


        char repeat = 0;
        String input;
        do {
            System.out.println("You've chosen to look at the GeForce 16 series graphics cards!");

            System.out.println("\t* Top four GeForce 16 series cards in order of performance and power*");

            System.out.println("0. Go back to graphics card list");

            System.out.println("1. GeForce GTX 1660ti");

            System.out.println("2. GeForce GTX 1660 Super");

            System.out.println("3. GeForce GTX 1660");

            System.out.println("4. GeForce GTX 1650 Super");

            Scanner selectGPU16 = new Scanner(System.in);
            System.out.println("Enter your choice as a number");

            int selectedGPU16 = selectGPU16.nextInt();

            int selectionGPU16 = selectedGPU16;


            switch (selectionGPU16) {

                case 0:
                    System.out.println("Going back...");

                    return;

                case 1:
                    System.out.println("You've chosen the GeForce GTX 1660ti!");
                    System.out.println("Press X to return to the graphics card list");
                    selectGPU16.nextLine();
                    input = selectGPU16.nextLine();
                    repeat = input.charAt(0);
                    if (repeat == 'X' || repeat == 'x')
                        return;

                case 2:
                    System.out.println("You've chosen the GeForce GTX 1660 Super!");
                    System.out.println("Press X to return to the graphics card list");
                    selectGPU16.nextLine();
                    input = selectGPU16.nextLine();
                    repeat = input.charAt(0);
                    if (repeat == 'X' || repeat == 'x')
                        return;

                case 3:
                    System.out.println("You've chosen the GeForce GTX 1660!");
                    System.out.println("Press X to return to the graphics card list");
                    selectGPU16.nextLine();
                    input = selectGPU16.nextLine();
                    repeat = input.charAt(0);
                    if (repeat == 'X' || repeat == 'x')
                        return;

                case 4:
                    System.out.println("You've chosen the GeForce GTX 1650 Super!");
                    System.out.println("Press X to return to the graphics card list");
                    selectGPU16.nextLine();
                    input = selectGPU16.nextLine();
                    repeat = input.charAt(0);
                    if (repeat == 'X' || repeat == 'x')
                        return;
            }
        }while (repeat == 'Y' || repeat == 'y');

    }

    public static void twentySeriesMenu() {


        char repeat = 0;
        String input;
        do {
            System.out.println("You've chosen to look at the GeForce 20 series graphics cards!");

            System.out.println("\t* Top four GeForce 20 series cards in order of performance and power*");

            System.out.println("0. Go back to graphics card list");

            System.out.println("1. NVIDIA TITAN RTX");

            System.out.println("2. GeForce RTX 2080ti");

            System.out.println("3. GeForce RTX 2080 Super");

            System.out.println("4. GeForce RTX 2080");

            Scanner selectGPU20 = new Scanner(System.in);
            System.out.println("Enter your choice as a number");

            int selectedGPU20 = selectGPU20.nextInt();

            int selectionGPU20 = selectedGPU20;


            switch (selectionGPU20) {

                case 0:
                    System.out.println("Going back...");

                    return;

                case 1:
                    System.out.println("You've chosen the NVIDIA TITAN RTX!");
                    System.out.println("Press X to return to the graphics card list");
                    selectGPU20.nextLine();
                    input = selectGPU20.nextLine();
                    repeat = input.charAt(0);
                    if (repeat == 'X' || repeat == 'x')
                        return;

                case 2:
                    System.out.println("You've chosen the GeForce RTX 2080ti!");
                    System.out.println("Press X to return to the graphics card list");
                    selectGPU20.nextLine();
                    input = selectGPU20.nextLine();
                    repeat = input.charAt(0);
                    if (repeat == 'X' || repeat == 'x')
                        return;

                case 3:
                    System.out.println("You've chosen the GeForce RTX 2080 Super!");
                    System.out.println("Press X to return to the graphics card list");
                    selectGPU20.nextLine();
                    input = selectGPU20.nextLine();
                    repeat = input.charAt(0);
                    if (repeat == 'X' || repeat == 'x')
                        return;

                case 4:
                    System.out.println("You've chosen the GeForce RTX 2080!");
                    System.out.println("Press X to return to the graphics card list");
                    selectGPU20.nextLine();
                    input = selectGPU20.nextLine();
                    repeat = input.charAt(0);
                    if (repeat == 'X' || repeat == 'x')
                        return;
            }
        }while (repeat == 'Y' || repeat == 'y');
    }

    public static void thirtySeriesMenu() {


        char repeat = 0;
        String input;
        do {
            System.out.println("You've chosen to look at the GeForce 30 series graphics cards!");

            System.out.println("\t* Top four GeForce 30 series cards in order of performance and power*");

            System.out.println("0. Go back to graphics card list");

            System.out.println("1. GeForce RTX 3090");

            System.out.println("2. GeForce RTX 3080");

            System.out.println("3. GeForce RTX 3070");

            System.out.println("4. GeForce RTX 3060ti");

            Scanner selectGPU30 = new Scanner(System.in);
            System.out.println("Enter your choice as a number");

            int selectedGPU30 = selectGPU30.nextInt();

            int selectionGPU30 = selectedGPU30;


            switch (selectionGPU30) {

                case 0:
                    System.out.println("Going back...");

                    return;

                case 1:
                    System.out.println("You've chosen the GeForce RTX 3090!");
                    System.out.println("Press X to return to the graphics card list");
                    selectGPU30.nextLine();
                    input = selectGPU30.nextLine();
                    repeat = input.charAt(0);
                    if (repeat == 'X' || repeat == 'x')
                        return;

                case 2:
                    System.out.println("You've chosen the GeForce RTX 3080!");
                    System.out.println("Press X to return to the graphics card list");
                    selectGPU30.nextLine();
                    input = selectGPU30.nextLine();
                    repeat = input.charAt(0);
                    if (repeat == 'X' || repeat == 'x')
                        return;

                case 3:
                    System.out.println("You've chosen the GeForce RTX 3070!");
                    System.out.println("Press X to return to the graphics card list");
                    selectGPU30.nextLine();
                    input = selectGPU30.nextLine();
                    repeat = input.charAt(0);
                    if (repeat == 'X' || repeat == 'x')
                        return;

                case 4:
                    System.out.println("You've chosen the GeForce RTX 3060ti!");
                    System.out.println("Press X to return to the graphics card list");
                    selectGPU30.nextLine();
                    input = selectGPU30.nextLine();
                    repeat = input.charAt(0);
                    if (repeat == 'X' || repeat == 'x')
                        return;
            }
        }while (repeat == 'Y' || repeat == 'y');
    }


}

















