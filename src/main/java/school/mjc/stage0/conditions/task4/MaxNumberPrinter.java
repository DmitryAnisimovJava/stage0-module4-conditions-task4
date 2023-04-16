package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
    	int maxFromTwo;
    	maxFromTwo = first >= second ?
    			first:
    			second;
    	int max = maxFromTwo >= third ?
    			maxFromTwo:
    			third;
    	System.out.println(max);
    }
}
