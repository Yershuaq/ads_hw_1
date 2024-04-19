public class numer_1 {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int tap = 10;
        boolean found = finded(arr, tap, 0);
        System.out.println(found);
    }
    public static boolean finded(int[] arr, int tap, int index){
        if (index >= arr.length){
            return false;
        } else if (arr[index] == tap) {
            return true;
        } else {
            return finded(arr, tap, index + 1);
        }
    }
}