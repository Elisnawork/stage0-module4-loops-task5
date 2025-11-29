package school.mjc.stage0.loops.task5;

public class Hourglass {

    public void printHourglassOfGivenSize(int size) {
        for (int i = 0; i < size; i++) {
            int spaces = Math.min(i, size - 1 - i);
            int eights = size - spaces * 2;

            for (int s = 0; s < spaces; s++) System.out.print(" ");
            for (int e = 0; e < eights; e++) System.out.print("8");
            for (int s = 0; s < spaces; s++) System.out.print(" ");
            System.out.println();
        }
    }
}