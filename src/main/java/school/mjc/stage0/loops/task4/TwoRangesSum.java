package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    
    public static void main(String[] args) {
        TwoRangesSum s = new TwoRangesSum();
        s.printSumOfTwoRanges(5,10); 
    }
    
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        
        TwoRangesSum s1 = new TwoRangesSum();
         
        int sumOne = 0;
        int sumTwo = 0;
        
        if(numberToSkip > lastInRow) { System.out.println("number to skip is bigger then the last"); }
        else if(lastInRow < 0) { System.out.println("last number in row is negative"); }
        else{
            for (int i = 0; i <= lastInRow; i++) {
                if (s1.printUntilButThird(i, numberToSkip) ) {
                    sumTwo += i;
                }else{
                    sumOne += i;
                }
            }
            System.out.println("skipped sum is " + sumOne);
            System.out.println("counted sum is " + sumTwo);
        }
        
    }
    
    public boolean printUntilButThird(int number, int butNot) {
        if(number <= butNot){ return false; }
            return true;
    }
}
