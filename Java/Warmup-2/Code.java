/*
* Author: Nicolas Gonzalez Vallejo
*/

class Code { 

    public String stringTimes(String str, int n) {
        String sol="";
        for(int c=0; c<n; c++)
          sol+=str;
        return sol;
    }


    public String frontTimes(String str, int n) {
        String sol="";
        String front="";
        if(str.length() > 3){
          front=str.substring(0,3);
        } else{
          front=str; 
        }
        for(int c=0; c<n; c++)
          sol+=front;
        return sol;
    }


    int countXX(String str) {
        int count=0;
        for(int i=0; i<str.length()-1; ++i){
          if(str.charAt(i)=='x' && str.charAt(i+1)=='x')
            count+=1;
        }
        return count;
    }
    
    
    boolean doubleX(String str) {
        int valx = str.indexOf("x");
        if(valx+1 < str.length() && str.charAt(valx+1)=='x')
          return true;
        return false;
    }


    public String stringBits(String str) {
        String sol="";
        for(int i=0; i<str.length(); i+=2){
          sol+=str.charAt(i);
        }
        return sol;
    }
      
    
    public String stringSplosion(String str) {
        String sol="";
        for(int i=1; i<str.length(); ++i){
          sol+=str.substring(0,i);
        }
        return sol+str;
    }


    public int last2(String str) {
        int count=0;
        if (str.length() < 2) 
          return 0;
        String wrd=str.substring(str.length()-2,str.length());
        for(int i=0; i<str.length()-1; ++i){
          if(str.substring(i,i+2).equals(wrd)){
            count+=1;
          }
        }
        return count-1;
    }
    
    
    public int arrayCount9(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; ++i){
          if(nums[i] == 9)
            count+=1;
        }
        return count;
    }
    
    
    public boolean arrayFront9(int[] nums) {
        int pos=4;
        if(nums.length < pos)
          pos=nums.length;
        for(int i=0; i<pos; ++i){
          if(nums[i] == 9)
            return true;
        }
        return false;
    }


    public boolean array123(int[] nums) {
        for(int i=0; i<nums.length-2;++i){
          if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3)
          return true;
        }
        return false;
    }
      
    
    public int stringMatch(String a, String b) {
        int count=0;
        int len=b.length();
        if(a.length() < b.length())
          len=a.length();
          
        for(int i=0; i <len-1; ++i){
          if(a.substring(i,i+2).equals(b.substring(i,i+2))){
            count+=1;
          }
        }
        return count;
    }

      
    public String stringX(String str) {
        if(str.length() < 3) return str;
        String sol=""+str.charAt(0);
        for(int i=1; i<str.length()-1; ++i){
            if(str.charAt(i) != 'x'){
            sol+=str.charAt(i);
            }
        }
        return sol+str.charAt(str.length()-1);
    }


    public String altPairs(String str) {
        if(str.length() <2) return str;
        String sol=""+str.charAt(0);
        boolean add = true;
        int i=0;
        while(i < str.length()){
          if(add){
            i+=1;
          } else {
            i+=3;
          }
          add=!add;
          if(i < str.length()){
            sol+=str.charAt(i);
          }
        }
        return sol;
    }


    public String stringYak(String str) {
        String sol="";
        for(int i=0; i<str.length(); ++i){
          if(i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k'){
            i=i+2;
          }else {
            sol+=str.charAt(i);
          }
        }
        return sol;
    }


    public int array667(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length-1;++i){
          if(nums[i]==6 && (nums[i+1]==6 || nums[i+1]==7))
            count+=1;
        }
        return count;
    }


    public boolean noTriples(int[] nums) {
        for(int i=0; i<nums.length-2;++i){
          if(nums[i] == nums[i+1] && nums[i] == nums[i+2])
            return false;
        }
        return true;
    }


    public boolean has271(int[] nums) {
        for(int i=0; i<nums.length-2; ++i){
          if(nums[i+1]==nums[i]+5 && Math.abs(nums[i+2]-(nums[i]-1))<=2)
            return true;
        }
        return false;
    }
}