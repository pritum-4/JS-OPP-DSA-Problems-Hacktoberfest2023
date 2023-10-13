import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[]= {3,4,5,1,2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int arr[]) {
        int value;
        for(int i=0;i<arr.length;i++) {
            value=arr[i];
            if(i!=value-1) {
                swap(arr,i,value-1);
            }

        }
    }
    static void swap(int arr[],int a,int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}

