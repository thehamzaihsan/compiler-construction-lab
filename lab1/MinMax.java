
for (int i = 0; i < children.length; ++i) {
    SimpleNode n 

public class MinMax {
    public static void main(String[] args) {
        int[] myList = { 2, 3, 4, 5 , 6};
        int min = myList[0];
        int max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if(myList[i] > max){
                max = myList[i];
            }
            if(myList[i] < min){
                min = myList[i];
            }
        }


       System.out.println("min is: " + min);
       System.out.println("max is: " + max);

    }
}
