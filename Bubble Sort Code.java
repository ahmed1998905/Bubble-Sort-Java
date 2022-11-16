public class Main {
    public static void main(String[] args) {

        int arr[] = {5, 1, 4, 2, 8};

        for(int i=0;i<arr.length-1;i++){
            for(int j=0 ;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0;i< arr.length;i++){
            if(i==0){
                System.out.print("{"+arr[i]);
            } else if(i==arr.length-1) {
                System.out.print(","+arr[i]+"}");
            }
            else {
                System.out.print(","+arr[i]);
            }
        }
    }
}
