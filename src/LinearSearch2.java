public class LinearSearch2 {

    public static void main(String[] args) {
        int[] arr={12,20,34,44,44,56,89};
        int target=44;
        int ans=LinearSearch(arr,target);
        System.out.println(ans);
    }
    static int LinearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
          int elem=arr[i];
          if(elem==target){
              return elem;
          }

        }
        return -1;
    }
}
