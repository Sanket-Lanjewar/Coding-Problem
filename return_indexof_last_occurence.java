public class return_indexof_last_occurence {
    public static void main(String[] args) {
        int[] arr={2,3,4,4,4};
         int  lastoccurence=-1;
         int x=3;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)
            lastoccurence=i;
        }System.out.println(lastoccurence);
    }
}













