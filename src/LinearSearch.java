public class LinearSearch{

    public static void main(String[] args) {
        int[] arr={10,20,20,20,30,45,20};
        int target=20;
        int ans=LinearSearch(arr,target);
        System.out.println(ans);
    }
    static int LinearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            int elem=arr[i];
            if(elem == target){
                return i;
            }
        }
        return -1;
    }
}
