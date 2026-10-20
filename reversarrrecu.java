class revarrrecu {

static void reverse(int arr[], int start, int end) {
  for(int i = start; i < end/2; i++) {             
    int temp = arr[i];
    arr[i] = arr[end - 1 - i];
    arr[end - 1 - i] = temp;
  }
}

public static void main(String[] args) {
  int arr[] = {1, 2, 3, 4, 5};
  
  reverse(arr, 0, arr.length);
for(int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
  }
}}