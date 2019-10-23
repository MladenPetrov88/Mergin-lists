import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingListts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstInput = scanner.nextLine().split(" ");
        String[] secondInput = scanner.nextLine().split(" ");

        List<Integer> firstArray = new ArrayList<>();
        List<Integer> secondArray = new ArrayList<>();
        List<Integer> mergedArray = new ArrayList<>();


        for (int i = 0; i < firstInput.length; i++) {
            firstArray.add(Integer.parseInt(firstInput[i]));
        }

        for (int i = 0; i < secondInput.length; i++) {
            secondArray.add(Integer.parseInt(secondInput[i]));
        }

        int maxSize = Math.max(firstArray.size(), secondArray.size());

        for (int i = 0; i <= maxSize; i++) {
            if (i < firstArray.size()) {
                mergedArray.add(firstArray.get(i));
            }
            if (i < secondArray.size()){
                mergedArray.add(secondArray.get(i));
            }
        }

        for (Integer integer : mergedArray) {
            System.out.print(integer + " ");
        }


    }
}
