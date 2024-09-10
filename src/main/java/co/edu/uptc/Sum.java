package co.edu.uptc;

import java.util.List;

/**
 * Sum
 */
public class Sum {

    private List<Integer> intList;

    public Sum(List<Integer> intList) {
        this.intList = intList;
    }

    public Integer sum(){
        int result = 0;
        for(Integer i: intList){
            result += i;
        }
        return result;
    }

    public void fillList(Integer[] nums){
        for(int i = 0; i < nums.length; i++){
            intList.add(nums[i]);
        }
    }

    public List<Integer> getIntList() {
        return intList;
    }
}
