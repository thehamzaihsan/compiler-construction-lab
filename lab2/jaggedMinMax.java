package lab2;

public class jaggedMinMax {
    public static void main(String[] args) {
        //jagged array
        int twoD[][] = new int[4][];
        twoD[0] = new int[]{5};
        twoD[1] = new int[]{3, 7};
        twoD[2] = new int[]{1, 9, 4};
        twoD[3] = new int[]{2, 6, 8, 10};

        int min = min(twoD);
        int max = max(twoD);
      
        System.out.print("Min: " + min );
        System.out.println("");
        System.out.print("Max: " + max);
        System.out.println("");

    }

    public static int min(int[][] twoD){
        int min = twoD[0][0];
        
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < twoD[i].length; j++){
               if(twoD[i][j] < min){
                min = twoD[i][j];
               }
             
            }
        }

        return min;

    }

    public static int max(int[][] twoD){
       
        int max = twoD[0][0];
        
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < i+1; j++){
            
               if(twoD[i][j] > max){
                max = twoD[i][j];
               }
            }
        }

        return max;

    }
}
