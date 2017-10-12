


public class PopQuiz {
    public static void main(String[] args) {

        if(args.length == 0 ) {

            int[] myArray = new int[10];

            myArray[0] = 1;
            myArray[1] = 2;
            myArray[2] = 3;
            myArray[3] = 4;
            myArray[4] = 5;
            myArray[5] = 6;
            myArray[6] = 7;
            myArray[7] = 8;
            myArray[8] = 9;
            myArray[9] = 10;

            for (int i : myArray) {
                System.out.print(i);
            }
            

            int temp;

            for (int i = 0; i < myArray.length / 2; i++) { //divide .lenght by 2 otherwise it will do a 360
                temp = myArray[myArray.length - i - 1];
                myArray[myArray.length - i - 1] = myArray[i];
                myArray[i] = temp;
            }

            for (int i : myArray) {
                System.out.println(i);
            }
        }

        else {


            for (int i = 0; i < args.length / 2; i++) { //divide .lenght by 2 otherwise it will do a 360
                String temp2;
                temp2 = args[args.length - i - 1];
                args[args.length - i - 1] = args[i];
                args[i] = temp2;
            }
            for (String i : args) {
                System.out.println(i);
            }

        }
    }


}
