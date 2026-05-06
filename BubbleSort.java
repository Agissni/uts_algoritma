public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // tukar
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // optimasi: berhenti jika sudah tidak ada pertukaran
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] data = {5, 2, 9, 1, 3};

        bubbleSort(data);

        System.out.print("Hasil sorting: ");
        for (int i : data) {
            System.out.print(i + " ");
        }
    }
}
