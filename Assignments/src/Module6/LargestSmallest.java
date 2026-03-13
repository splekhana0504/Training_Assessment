package Module6;

public class LargestSmallest {
    public static void main(String[] args) {
        int []arr={10,5,25,20,7,45};

        int largest=arr[0];
        int smallest=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];

                if(arr[i]<smallest){
                    smallest=arr[i];
                }
            }
        }
        System.out.println("Largest number:" + largest);
        System.out.println("Smallest number:" + smallest);
    }
}