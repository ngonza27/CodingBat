/*
* Author: Nicolas Gonzalez Vallejo
*/

class Code {

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length-1] == 6;
    }

    
    public boolean sameFirstLast(int[] nums) {
        return nums.length>=1 && nums[0]==nums[nums.length-1];
    }
      

    public int[] makePi() {
        return new int[] {3,1,4};
    }
   
    
    public boolean commonEnd(int[] a, int[] b) {
        return a[0]==b[0] || a[a.length-1]==b[b.length-1];
    }
      

    public int sum3(int[] nums) {
        return nums[0]+nums[1]+nums[2];
    }


    public int[] rotateLeft3(int[] nums) {
        return new int []{nums[1],nums[2],nums[0]};
    }
    
    
    public int[] reverse3(int[] nums) {
        return new int []{nums[2],nums[1],nums[0]};
    }
    
    
    public int[] maxEnd3(int[] nums) {
        int large=nums[0];
        if(nums[2] > large){
          large=nums[2];
        }
        
        return new int[] {large,large,large};
    }
    
    
    public int sum2(int[] nums) {
        if (nums.length<1) return 0;
        return nums.length<=1 ? nums[0] : nums[0]+nums[1];
    }


    public int[] middleWay(int[] a, int[] b) {
        return new int[] {a[1], b[1]};
    }


    public int[] makeEnds(int[] nums) {
        return new int[] {nums[0], nums[nums.length-1]};
    }


    public boolean has23(int[] nums) {
        return nums[0]==2 || nums[0]==3 || nums[1]==3;
    }


    public boolean no23(int[] nums) {
        return nums[0]!=2 && nums[0]!=3 && nums[1]!=3 && nums[1]!=2;
    }


    public int[] makeLast(int[] nums) {
        int arr[] = new int [nums.length*2];
        arr[arr.length-1] = nums[nums.length-1];
        return arr;
    }


    public boolean double23(int[] nums) {
        if(nums.length <= 1) return false;
        return (nums[0]==2 && nums[nums.length-1]==2) ||
               (nums[0]==3 && nums[nums.length-1]==3);
    }


    public int[] fix23(int[] nums) {
        if(nums[0]==2 && nums[1]==3)
          nums[1]=0;
        if(nums[1]==2 && nums[2]==3)
          nums[2]=0;
        return nums;
    }


    public int start1(int[] a, int[] b) {
        int res=0;
          if(a.length>=1 && a[0]==1)
              res += 1;
          if(b.length>=1 && b[0]==1)
              res += 1;
          return res;
    }


    public int[] biggerTwo(int[] a, int[] b) {
        int a_sum = a[0]+a[1];
        int b_sum = b[0]+b[1];
        return a_sum<b_sum ? b : a; 
    }


    public int[] makeMiddle(int[] nums) {
        if(nums.length<=2)return nums;
        return new int [] {nums[nums.length/2-1], nums[nums.length/2]};
    }


    public int[] plusTwo(int[] a, int[] b) {
        int arr[] = {a[0],a[1],b[0],b[1]};
        return arr;
    }


    public int[] swapEnds(int[] nums) {
        int temp=nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1]= temp;
        return nums;
    }


    public int[] midThree(int[] nums) {
        return new int[] {nums[nums.length/2-1],nums[nums.length/2],nums[nums.length/2+1]};
    }


    public int maxTriple(int[] nums) {
        int big=nums[0];
        if(nums[nums.length/2] > big)
          big=nums[nums.length/2];
        if(nums[nums.length-1] > big)
          big=nums[nums.length-1];
        return big;
    }


    public int[] frontPiece(int[] nums) {
        if(nums.length <=2) return nums;
        return new int [] {nums[0],nums[1]};
    }


    public boolean unlucky1(int[] nums) {
        if(nums.length <2) return false;
        return (nums[0]==1 && nums[1]==3) ||
               (nums[1]==1 && nums[2]==3) ||
               (nums[nums.length-2]==1 && nums[nums.length-1]==3)   ;
    }


    public int[] make2(int[] a, int[] b) {
        int[] arr = new int[2];
          if(a.length >= 2){
              arr[0] = a[0];
              arr[1] = a[1];
          } else if(a.length == 1){
              arr[0] = a[0];
              arr[1] = b[0];
          } else{
              arr[0] = b[0];
              arr[1] = b[1];	
          }
          return arr;
    }


    public int[] front11(int[] a, int[] b) {
        int[] arr ;
        if(a.length >=1 && b.length >=1){
            arr = new int[2];
            arr[0] = a[0];
            arr[1] = b[0];
        } else if(a.length >=1 && b.length == 0){
          arr = new int[1];
          arr[0] = a[0];
        } else if(a.length ==0  && b.length >= 1){
          arr = new int[1];
          arr[0] = b[0];
        } else{
          arr = new int[0];
        }
        return  arr;
    }
}