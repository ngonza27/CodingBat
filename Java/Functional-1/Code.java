/*
* Author: Nicolas Gonzalez Vallejo
*/

import java.util.List;

class Code {

    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }
      

    public List<String> addStar(List<String> strings) {
        strings.replaceAll(n -> n+"*");
        return strings;
    }


    public List<String> copies3(List<String> strings) {
        strings.replaceAll(n -> n+n+n);
        return strings;
    }


    public List<String> moreY(List<String> strings) {
        strings.replaceAll(x -> "y"+x+"y");
        return strings;
    }


    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(x -> (x+1) * 10);
        return nums;
    }
      
    
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(x -> x%10);
        return nums;
    }


    public List<String> lower(List<String> strings) {
        strings.replaceAll(x -> x.toLowerCase());
        return strings;
    }

    
    public List<String> noX(List<String> strings) {
        strings.replaceAll(n -> n.replaceAll("x", ""));
        return strings;
    }
      
}