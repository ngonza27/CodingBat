/*
* Author: Nicolas Gonzalez Vallejo
*/

class Code { 

    public boolean scoresIncreasing(int[] scores) {
        for(int i=0; i < scores.length-1; ++i){
          if(scores[i] > scores[i+1]){
            return false;
          }
        }
        return true;
    }








    public String[] mergeTwo(String[] a, String[] b, int n) {
        int idxA = 0;
        int idxB = 0;
        int idxArr = 0;
        String arr[] = new String[n];
        int i=0;
        while(i<n){
            int v1 = a[idxA].charAt(0);
            int v2 = b[idxB].charAt(0);
            if(v1<v2){
                arr[idxArr] = a[idxA];
                idxA++;
                idxArr++;
            } else if(v2<v1){
                arr[idxArr] = b[idxB];
                idxB++;
                idxArr++;
            } else {
                arr[idxArr] = a[idxA];
                idxA++;
                idxB++;
                idxArr++;
            }
            i++;
        }
        return arr;
    }


    public int commonTwo(String[] a, String[] b) {
        int count=0;
        String checked="";
        for(int i=0; i<a.length;++i){
          for(int j=0; j<b.length;++j){
            if(a[i]==b[j] && a[i]!=checked){
              count++; 
              checked=a[i];
              break;
            }
          }
        }
        return count;
    }
}