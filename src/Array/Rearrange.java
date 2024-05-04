package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Rearrange {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        rearrangeArray(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0)
                n.add(nums[i]);
            else
                p.add(nums[i]);
        }
        
        int i = 0;
        int j = 0;

        for (int k = 0; k < nums.length; k++) {
            if(k%2==0){
                nums[k] = p.get(i);
                i++;
            }
            else{
                nums[k]= n.get(j);
                j++;
            }
        }
        
        System.out.println(p);
        System.out.println(n);

        return null;
    }
}
