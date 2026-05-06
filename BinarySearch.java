public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 5, 9};
        int target = 5;

        int hasil = binarySearch(data, target);

        if (hasil != -1)
            System.out.println("Ditemukan di index: " + hasil);
        else
            System.out.println("Tidak ditemukan");
    }
}
