import java.util.*;
import java.util.stream.IntStream;

public class Task5 {

    private static final int SETS_NUMBER = 3;
    private static final int DIVIDE_TASKS_INTO_THREE_SETS_EQUAL_IN_SUM_IS_IMPOSSIBLE = -1;


    private static boolean isPossibleToSplitNumbersIntoThreeSets(int number) {
        int sumOfNumbersFromOneToNumber = number * (1 + number) / 2;
        return sumOfNumbersFromOneToNumber % SETS_NUMBER == 0 && sumOfNumbersFromOneToNumber > SETS_NUMBER * SETS_NUMBER;
    }

    private static int getSumOfSet(int number) {
        int sumOfEachSet;
        if (isPossibleToSplitNumbersIntoThreeSets(number)) {
            int sumOfNumbersFromOneToNumber = number * (1 + number) / 2;
            sumOfEachSet = sumOfNumbersFromOneToNumber / SETS_NUMBER;
        } else {
            sumOfEachSet = 0;
        }

        return sumOfEachSet;
    }

    private static void fillArrayList(int number, List<Integer> fromOneToNumberValuesList) {
        for (int i = 0; i < number; i++) {
            fromOneToNumberValuesList.add(i + 1);
        }
    }

    private static Set<Integer> getFirstSets(int number, List<Integer> fromOneToNumberValuesList) {
        int sumOfSet = getSumOfSet(number);
        Set<Integer> numberSet = new HashSet<>();
        int index = fromOneToNumberValuesList.size() - 1;

        while (sumOfSet != 0) {
            if (fromOneToNumberValuesList.get(index) != 0) {
                numberSet.add(fromOneToNumberValuesList.get(index));
            }
            sumOfSet -= fromOneToNumberValuesList.get(index);

            if (sumOfSet == 0) {
                break;
            }

            if (sumOfSet >= number) {
                index--;
            } else {
                numberSet.add(fromOneToNumberValuesList.get(sumOfSet - 1));
                sumOfSet = 0;
            }
        }

        replaceElements(fromOneToNumberValuesList, numberSet);

        return numberSet;
    }

    private static Set<Integer> getThirdSet(List<Integer> fromOneToNumberValuesList) {
        Set<Integer> thirdSet = new HashSet<>();

        for (int i = 0; i < fromOneToNumberValuesList.size(); i++) {
            if (fromOneToNumberValuesList.get(i) != 0) {
                thirdSet.add(fromOneToNumberValuesList.get(i));
            }
        }

        return thirdSet;
    }


    private static void replaceElements(List<Integer> fromOneToNumberValuesList, Set<Integer> numberSet) {
        for (int i = 0; i < fromOneToNumberValuesList.size(); i++) {
            if (numberSet.contains(i + 1)) {
                fromOneToNumberValuesList.set(i, 0);
            }
        }
    }

    private static void printSetDescription(Set<Integer> numberSet) {
        System.out.println(numberSet.size());

        for (int number : numberSet) {
//            System.out.print(number + " ");
        }
        List<Integer> test = new ArrayList<>(numberSet);
        System.out.println(test.stream().mapToInt(Integer::intValue).sum());

        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        List<Integer> fromOneToNumberValuesList = new ArrayList<>(number);
        fillArrayList(number, fromOneToNumberValuesList);
        int sumOfEachSet = getSumOfSet(number);

        if (sumOfEachSet == 0) {
            System.out.println(DIVIDE_TASKS_INTO_THREE_SETS_EQUAL_IN_SUM_IS_IMPOSSIBLE);
        } else {
            Set<Integer> firstSet = getFirstSets(number, fromOneToNumberValuesList);
            printSetDescription(firstSet);

            Set<Integer> secondSet = getFirstSets(number, fromOneToNumberValuesList);
            printSetDescription(secondSet);

            Set<Integer> thirdSet = getThirdSet(fromOneToNumberValuesList);
            printSetDescription(thirdSet);
        }
    }
}