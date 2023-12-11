package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == 0) {
            System.out.println(second);
        } else if (second == 0) {
            System.out.println(first);
        } else {
            while (second != 0 && first != 0) {
                if (first > second)
                    first = first - second;
                else {
                    second = second - first;
                }
            }
            System.out.println(first);
        }
    }
}
