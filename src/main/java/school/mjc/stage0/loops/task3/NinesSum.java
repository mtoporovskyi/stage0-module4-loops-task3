package school.mjc.stage0.loops.task3;

 public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0, multiplier = 1, prevValue = 9;

        for (int i = 0; i < lengthOfLastNumber; i++) {
            int nineValue = 9;

            if (sum == 0) {
                sum += nineValue;
                continue;
            }

            multiplier *= 10;
            prevValue = nineValue * multiplier + prevValue;
            sum += prevValue;
        }
        System.out.println(sum);
    }
}
