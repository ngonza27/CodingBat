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


    public boolean startHi(String str) {
        return str.length() >= 2 && str.substring(0,2).equals("hi");
    }
    

    public boolean icyHot(int temp1, int temp2) {
        return (temp1>100 && temp2<0) || (temp1<0 && temp2>100);
    }


    public boolean in1020(int a, int b) {
        return (a>=10 && a<=20) || (b>=10 && b<=20);
    } 


    public boolean hasTeen(int a, int b, int c) {
        return (a>=13 && a<=19) || 
               (b>=13 && b<=19) ||
               (c>=13 && c<=19);
    }


    public boolean loneTeen(int a, int b) {
        return (a>=13 && a<=19) && !(b>=13 && b<=19) ||
               !(a>=13 && a<=19) && (b>=13 && b<=19);
    }


    public String delDel(String str) {
        return str.length() >=4 && str.substring(1,4).equals("del") ? 
               str.charAt(0)+str.substring(4) :
               str;
    }


    public boolean mixStart(String str) {
        return str.length() >=3 && str.substring(1,3).equals("ix");
    }   


    public String startOz(String str) {
        String res = "";
        if (str.length() <=2)
          return str;
        if(str.charAt(0) == 'o')
          res+="o";
        if(str.charAt(1) == 'z')
          res+="z";
        return res;
    }


    public int intMax(int a, int b, int c) {
        int max=a;
        if(b>c)
          max=b;
        if(c>b)
          max=c;
        if(a>max)
          max=a;
        return max;
    }


    public int close10(int a, int b) {
        if (Math.abs(10-a) == Math.abs(10-b))
          return 0;
        if (Math.abs(10-a) < Math.abs(10-b))
          return a;
        return b;
    }
      
    
    public boolean in3050(int a, int b) {
        return ((a>=30 && a<=40) && (b>=30 && b<=40)) ||
               ((a>=40 && a<=50) && (b>=40 && b<=50));
    }      


    public int max1020(int a, int b) {
        if((a<10 || a>20) && (b>20 || b<10))
          return 0;
        if ((a>=10 && a<=20) && (a>b) || (b>20 || b<10))
          return a;
        return b;
    }      


    public boolean stringE(String str) {
        int count = 0;
        for(int c=0 ; c<str.length(); c++){
          if(str.charAt(c) == 'e')
            count+=1;
        }
        return (count >=1 && count <= 3);
    }
      

    public boolean lastDigit(int a, int b) {
        return a == b%10 || b == a%10;
    }
    

    public String endUp(String str) {
        return str.length() < 3 ? str.toUpperCase() :
               str.substring(0,str.length()-3) + 
               str.substring(str.length()-3).toUpperCase(); 
    }
    
    
    public String everyNth(String str, int n) {
        String solution = ""+str.charAt(0);
        for(int i=1; i < str.length(); ++i){
          if(i%n == 0)
            solution=solution+str.charAt(i);
        }
        return solution;
    }
      
}   