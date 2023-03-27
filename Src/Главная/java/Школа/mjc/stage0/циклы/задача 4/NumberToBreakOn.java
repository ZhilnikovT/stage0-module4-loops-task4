package school.mjc.stage0.loops.task4;



public class NumberToBreakOn {
    
    public static void main(String[] args) {
        NumberToBreakOn m = new NumberToBreakOn();
        m.printNumbersUntilWithBreakOn(30, 20);
    }
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        
        boolean isPositiveNumberToGoUntil = numberToGoUntil < 0 ? false : true;
        boolean isPositiveToBreakWith = toBreakWith < 0 ? false : true;
        
        boolean isIteratingTillTheEnd;
        
        if (isPositiveNumberToGoUntil){
            if(isPositiveToBreakWith){
                isIteratingTillTheEnd = toBreakWith > numberToGoUntil ? true : false;
            }else{
                isIteratingTillTheEnd = true;
            }
        }else{
            if(!isPositiveToBreakWith){
                isIteratingTillTheEnd = toBreakWith < numberToGoUntil ? true : false;
            }else{
                isIteratingTillTheEnd = true;
            }
        }
        
        if(isIteratingTillTheEnd){ System.out.println("iterating till the end");}
        
        int i = 0;
        boolean isCheck = true;
        do{
            System.out.println(i);
            if(isPositiveNumberToGoUntil){ 
                i++;
                //System.out.println(isIteratingTillTheEnd);
                isCheck = (i <= (isIteratingTillTheEnd ? numberToGoUntil: toBreakWith));
            }else{
                isCheck = (i > (isIteratingTillTheEnd ? numberToGoUntil: toBreakWith));
                i--;
            }
            //System.out.println(isCheck);
        }while(isCheck); 
    }
}
