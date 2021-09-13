
package newpackage;


public class class3 {
    
    public static void main(String[]args){
        int[] arr[][]=new int[3][5];
        
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
            arr[i][j]=10+i;
        }}
        for(int i=0; i<arr.length; i++){
            System.out.println("Arr["+i+"] : " + arr [i]);
                   
        }
    }
}