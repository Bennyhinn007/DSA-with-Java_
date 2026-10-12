public class LinearSearchTF {

    public static void main(String[] args) {
        int[] arr={12,20,34,44,44,56,89};
        int target=54;
        boolean ans=LinearSearch(arr,target);
        System.out.println(ans);
    }
    static boolean LinearSearch(int[] arr, int target){
        if(arr.length==0){
            return false;
        }
        for(int i=0; i<arr.length; i++){
            int elem=arr[i];
            if(elem==target){
                return true;
            }

        }
        return false;
    }
}