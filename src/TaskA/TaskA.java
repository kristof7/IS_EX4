package TaskA;

public class TaskA {
    public static void taskA() {
        int countMinusNumbers = 0;
        int[] input = new int[]{-3, -2, -1, 0, 1, 2, 3, 4, 5};

        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                countMinusNumbers++;
            } else if (input[i] > 0) {
                input[i] += input[i - 1];
            }
        }

        int[] output = new int[2];
        output[0] = countMinusNumbers;
        output[1] = input[input.length - 1];

        for (int i : output) {
            System.out.println(i);
        }
    }
}
