package co.edu.uptc;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> doubleList = new DoubleList();
        List<Integer> arrayList = new ArrayList<>();
        Integer[] nums = new Integer[10];
        for(int i = 0; i < 10; i++){
            nums[i] = (int)(Math.random() * 100);
        }
        Sum summerArray = new Sum(arrayList);
        summerArray.fillList(nums);
        Sum summerDouble = new Sum(doubleList);
        summerDouble.fillList(nums);

        String numsToPrint = "";
        for(int i: summerArray.getIntList()){
            numsToPrint += (i + " ");
        }
        System.out.println(numsToPrint);
        long startArray = System.nanoTime();
            System.out.println(summerArray.sum());
        long finishArray = System.nanoTime();
        long timeArrayNano = (finishArray-startArray);
        long timeArrayMilli = (finishArray-startArray)/1_000_000;
        long timeArraySec = (finishArray-startArray)/1_000_000_000;
        System.out.println("Array nano: " + timeArrayNano +  "\n Array millis: " + timeArrayMilli + "\n Array secs: " + timeArraySec + "\n\n");
        
        
    
        System.out.println(((DoubleList)summerDouble.getIntList()).showList());
        long startDouble = System.nanoTime();
            System.out.println(summerDouble.sum());
        long finishDouble = System.nanoTime();
        long timeDoubleNano = (finishDouble-startDouble);
        long timeDoubleMilli = (finishDouble-startDouble)/1_000_000;
        long timeDoubleSec = (finishDouble-startDouble)/1_000_000_000;
        System.out.println("Doublelist nano: " + timeDoubleNano +  "\n Double millis: " + timeDoubleMilli + "\n Double secs: " + timeDoubleSec);
    }
}