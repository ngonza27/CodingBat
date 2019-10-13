/*
* Author: Nicolas Gonzalez Vallejo
*/

class Code {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation ? true : false;
    }


    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile && bSmile || (!aSmile && !bSmile) ? true : false;
    }


    public int sumDouble(int a, int b) {
        return a==b ? (a+b)*2 : a+b;
    }


    public int diff21(int n) {
        return n>21 ? (n-21)*2 : 21-n;
    }

    
    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking&&hour<7) || (talking&&hour>20) ? true : false; 
    }
    
    
    public boolean makes10(int a, int b) {
        return a+b==10 || a==10 || b==10 ? true : false;
    }
    
    
    public boolean nearHundred(int n) {
        return (Math.abs(100-n) <= 10) || (Math.abs(200-n) <= 10);
    }
    
    
    public boolean posNeg(int a, int b, boolean negative) {
        return negative ? a<0 && b<0 : (a<0 && b>0) || (a>0 && b<0);
    }
    

    public String notString(String str) {
        return str.length() >= 3 && str.substring(0,3).equals("not") ? str : "not "+str;
    }
    

    public String front22(String str) {
        return str.length() < 2 ? str+str+str : str.substring(0,2)+str+str.substring(0,2);
    }
    
    
    public String missingChar(String str, int n) {
        return str.substring(0,n)+str.substring(n+1,str.length());
    }


    public String frontBack(String str) {
        return str.length() >=2 
               ? 
               str.substring(str.length()-1,str.length()) +
               str.substring(1, str.length()-1) +
               str.substring(0,1) 
               :
               str;
    }


    public String front3(String str) {
        return str.length() >= 3 ? str.substring(0,3)+str.substring(0,3)+str.substring(0,3) : str+str+str;
    }


    public String backAround(String str) {
        return str.charAt(str.length()-1)+str+str.charAt(str.length()-1);
    }
    

    public boolean or35(int n) {
        return n%3==0 || n%5==0; 
    }
}