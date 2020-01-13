import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String option="s";
        while (!option.equalsIgnoreCase("q")){
            System.out.println("Please select one of the useless options(or press q to quit):");
            System.out.println("1 - fibonacci numbers, 2 - form a board");
            option = in.next();
            switch (option)
            {
                case "1":
                    fibonacci();
                    break;
                case "2":
                    formBoard();
                    break;
                default:
                    break;
            }
        }
    }

    private static void formBoard() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the height of the board...");
        int height = in.nextInt();
        System.out.println("You've entered value: " + height);

        System.out.println("Please enter the width of the board...");
        int width = in.nextInt();
        System.out.println("You've entered value: " + width);

        printBoard(height, width);
    }

    private static void printBoard(int height, int width) {
        for (int i = 0; i < height; i++) {
            if (i % 2 == 0) {
                System.out.print(' ');
            }
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static String fibonacciSequenceRanged(int minValue, int maxValue){
        String result="";
        int prev = 1;
        int current = 1;
        if(prev>=minValue){
            result=result+prev+" ";
        }
        while(current<=maxValue)
        {
            if(current>=minValue){
                result=result+current+" ";
            }
            int temp = prev;
            prev = current;
            current = current+temp;
        }
        return result.trim();
    }

    public static String fibonacciSequenceLength(int length){
        String result="";
        int prev = 1;
        int current = 1;
        if(Integer.toString(prev).length()==length){
            result=result+prev+" ";
        }
        while(Integer.toString(current).length()<=length)
        {
            if(Integer.toString(current).length()==length){
                result=result+current+" ";
            }
            int temp = prev;
            prev = current;
            current = current+temp;
        }
        return result.trim();
    }

    private  static void fibonacci(){
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the type of constraint: 1 - range, 2 - length...");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Please enter the minimum value...");
                int minValue = in.nextInt();
                System.out.println("Please enter the maximum value...");
                int maxValue = in.nextInt();
                System.out.println("Your sequence:");
                System.out.println(fibonacciSequenceRanged(minValue,maxValue));
                break;
            case 2:
                System.out.println("Please enter the length of the values...");
                int length = in.nextInt();
                System.out.println("Your sequence:");
                System.out.println(fibonacciSequenceLength(length));
                break;
            default:
                System.out.println("Supoported options are 1 and 2 :)");
        }
    }
}
