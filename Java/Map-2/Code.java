/*
* Author: Nicolas Gonzalez Vallejo
*/

class Code {

   public Map<String, Integer> word0(String[] strings) {
      Map<String, Integer> map = new HashMap();
      for(int i=0; i < strings.length; ++i){
         map.put(strings[i],0);
      }
      return map;
   }


   public Map<String, Integer> wordLen(String[] strings) {
      Map<String, Integer> map = new HashMap();
      for(int i=0; i < strings.length; ++i){
        String tmp = strings[i];
        map.put(tmp, tmp.length());
      }
      return map;
   }


   public Map<String, String> pairs(String[] strings) {
      Map<String, String> map = new HashMap<String, String>();
      for(String s: strings){
         map.put(s.substring(0,1), s.substring(s.length()-1,s.length()));
      }
      return map;
   }


   public Map<String, Integer> wordCount(String[] strings) {
      int c = 1;
      Map<String, Integer> map = new HashMap();
      for(int i=0; i < strings.length; ++i){
        if(!map.containsKey(strings[i])){
          map.put(strings[i],c);
        } else {
          map.put(strings[i],map.get(strings[i])+1);
        }
      }
      return map;
    }

    
    public Map<String, String> firstChar(String[] strings) {
      Map<String, String> map = new HashMap<String, String>();
      for(String s: strings){
        if(!map.containsKey(s.substring(0,1))){
          map.put(s.substring(0,1), s);
        } else {
          map.put(s.substring(0,1), map.get(s.substring(0,1))+ s);
        }
      }
      return map;
    }


    public String wordAppend(String[] strings) {
      Map<String, Integer> map = new HashMap();
      String res = "";
      for(int i=0; i<strings.length; ++i){
        if(!map.containsKey(strings[i])){
          map.put(strings[i],1);
        } else {
          map.put(strings[i],map.get(strings[i])+1);
          if(map.get(strings[i]) != 1 && map.get(strings[i])%2 == 0){
            res = res+strings[i];
          }
        }
      }
      return res;
    }


   public Map<String, Boolean> wordMultiple(String[] strings) {
      Map<String, Boolean> map = new HashMap<String, Boolean>();
      for(String s: strings){
         if(!map.containsKey(s)){ 
            map.put(s,false);
         } else {
            map.put(s,true);
         }
      }
      return map;
   }


   public String[] allSwap(String[] strings) {
      String []solution = new String[strings.length];
      Map<String, Integer> map = new HashMap<String, Integer>();
      for(int i=0; i<strings.length; ++i){
        if(!map.containsKey(strings[i].substring(0,1))){
          solution[i] = strings[i];
          map.put(strings[i].substring(0,1), i);
        } else {
          int index = map.get(strings[i].substring(0,1));
          map.remove(strings[i].substring(0,1));
          solution[i] = solution[index];
          solution[index] = strings[i];
        }
      }
      return solution;
    }


   public String[] firstSwap(String[] strings) {
      String []solution = new String[strings.length];
      Map<String, Integer> map = new HashMap<String, Integer>();
      for(int i=0; i<strings.length; ++i){
         if(!map.containsKey(strings[i].substring(0,1))){
            solution[i] = strings[i];
            map.put(strings[i].substring(0,1), i);
         } else if(map.get(strings[i].substring(0,1)) >= 0){
            int index = map.get(strings[i].substring(0,1));
            map.put(strings[i].substring(0,1),-1);
            solution[i] = solution[index];
            solution[index] = strings[i];
         } else {
            solution[i] = strings[i];
         }
      }
      return solution;
   }
}