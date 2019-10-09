/*
* Author: Nicolas Gonzalez Vallejo
*/

class Code {

    public String helloName(String name) {
        return("Hello "+name+"!");
    }

    
    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }
      

    public String makeTags(String tag, String word) {
        return "<"+tag+">"+word+"</"+tag+">";
    }

      
    public String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2,4);
    }

    
    public String extraEnd(String str) {
        String a = str.substring(str.length()-2, str.length());
        return a+a+a;
    }
      
    public String firstTwo(String str) {
        if (str.length() > 2) 
          return str.substring(0,2);
        return str;
    }


    public String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }


    public String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }


    public String comboString(String a, String b) {
        if (a.length() < b.length()) 
          return a+b+a;
        return b+a+b;
    }


    public String nonStart(String a, String b) {
        return a.substring(1)+b.substring(1);
    }


    public String left2(String str) {
        return str.substring(2)+str.substring(0,2);
    }
      
    
    public String right2(String str) {
        return str.substring(str.length()-2,str.length()) +
               str.substring(0,str.length()-2);
    }
      
    
    public String theEnd(String str, boolean front) {
        if(front)
          return str.substring(0,1);
        return str.substring(str.length()-1,str.length());
    }


    public String withouEnd2(String str) {
        return (str.length() < 2) ?  "" : str.substring(1,str.length()-1);
    }
    
    
    public String middleTwo(String str) {
        return str.substring(str.length()/2-1,str.length()/2+1);
    }
    

    public boolean endsLy(String str) {
        return (str.length() < 2) ? false : str.substring(str.length()-2, str.length()).equals("ly");
    }
    
    
    public String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length()-n, str.length());
    }
      

    public String twoChar(String str, int index) {
        if (index < 1 || index+2 > str.length()){
          return str.substring(0,2);
        }
        return str.substring(index,index+2);   
    }


    public boolean hasBad(String str) {
        if(str.equals("bad"))
          return true;
        return str.length() < 4 ? false : 
               str.substring(0,3).equals("bad") || 
               str.substring(1,4).equals("bad");
    }


    public String atFirst(String str) {
        if(str.length() == 0) 
          return "@@";
        return str.length() < 2 ? str+"@" : str.substring(0,2);
    }


    public String lastChars(String a, String b) {
        if(a.length() == 0)
          a = "@";
        if (b.length() == 0)
          b = "@";
        return a.substring(0,1)+b.substring(b.length()-1,b.length());
    }    
    
    
    public String conCat(String a, String b) {
        if(a.length() == 0)
          return b;
        if(b.length() == 0)
          return a;
        return a.substring(a.length()-1,a.length()).equals(b.substring(0,1)) ?  
               a+b.substring(1,b.length()) : 
               a+b;
    }


    public String lastTwo(String str) {
        if(str.length() < 2)
          return str;
        return str.substring(0,str.length()-2) + 
               str.charAt(str.length()-1) +
               str.charAt(str.length()-2);
    }
}
