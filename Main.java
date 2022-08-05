package palindrome;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            Main polindrome = new Main();
            ArrayList<String> arrayList = new ArrayList<String>();
            System.out.println("enter 3 numbers: ");
            arrayList.add(input.nextLine());
            arrayList.add(input.nextLine());
            arrayList.add(input.nextLine());

            System.out.println("List1 : " + arrayList);
            ArrayList<String> arrayList2 = new ArrayList<String>();
            arrayList2 = (ArrayList<String>) arrayList.clone();
            List<String> myReversedArray = new ArrayList<String>();
            myReversedArray = polindrome.reversedArray(arrayList);
            System.out.println("List2: " + arrayList2);
            System.out.println("reversed List: " + myReversedArray);
            if (arrayList2.equals(myReversedArray)) {
                System.out.println("this arrayList is a palindrome");
            } else System.out.println("no palindrome was found");


        }

        public ArrayList<String> reversedArray(ArrayList<String> array) {
            Integer index = array.size() - 1;
            String temp;
            int halfSize = array.size() / 2;
            if (array.isEmpty())
                System.out.println("array is empty");
            else {
                for (Integer i = 0; i < halfSize; i++) {
                    temp = array.get(i);
                    array.set(i, array.get(index - i));
                    array.set(index - i, temp);
                }
            }
            return array;
        }

    }

