package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        boolean iteratingTillTheEnd = toBreakWith > numberToGoUntil ? true : false;
        if(iteratingTillTheEnd){ System.out.println("iterating till the end");}
        for (int i = 0; i <= (iteratingTillTheEnd ? numberToGoUntil: toBreakWith); i++){
            System.out.println(i);
        }
    }
}
