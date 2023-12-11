package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        String numberStr = Integer.toString(t);

        for (char c: numberStr.toCharArray()) {
            if (c == '-') {
                continue;
            }
            sum += Character.getNumericValue(c);
        }
        System.out.println(sum);
    }
}