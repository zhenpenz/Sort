public class Sort {


    public static void quicksort(int[] nums) {
        quicksort(nums, 0, nums.length);
    }


    //对[l...j)的数组进行quicksort
    private static void quicksort(int[] nums, int l, int j) {
        if (l >= j)
            return;

        int mid = partition(nums, l, j);
        quicksort(nums, l, mid);
        quicksort(nums, mid + 1, j);
    }


    //对[l...j)的数组进行partition操作
    //返回一个int m,  nums[l...m) < nums[m] &&  nums[mid+1...j)  > nums[m]
    private static int partition(int[] nums, int l, int j) {
        if (l >= j)
            throw new IllegalArgumentException();

        int z = l; //nums[l+1, z]
        int v = nums[l];
        for (int i = l + 1; i < j; i++) {
            if (nums[i] < v) {
                z++;
                swap(nums, i, z);
            }
        }
        swap(nums, l, z);
        return z;
    }

    //交换数组中的
    private static void swap(int[] nums, int l, int j) {
        int tempt = nums[l];
        nums[l] = nums[j];
        nums[j] = tempt;
    }
}
