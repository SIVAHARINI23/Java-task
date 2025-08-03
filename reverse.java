public class Reverse {
    public static void main(String[] args) {
        String[] arr = {"tneduts", "ANSP", "ma I"};

        System.out.print("Original Array: ");
        for (String str : arr) {
            System.out.print(str + " ");
        }

        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }

      
        int start = 0, end = arr.length - 1;
        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.print("\nReversed Elements and Array: ");
        for (String str : arr) {
            System.out.print(str + " ");
        }
    }