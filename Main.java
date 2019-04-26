import java.util.Random;


//对quicksort进行测试
public class Main {

    public static void main(String[] args) {

        //随机生成一个10000长度的数组
        Random random = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++){
            arr[i] = random.nextInt(Integer.MAX_VALUE);
        }

        //对数组进行quicksort
        Sort.quicksort(arr);

        //检测数组正确性
        for(int i = 1; i < 10000; i++){
            if(arr[i-1] > arr[i])
                System.out.println("false");
        }

        System.out.println("true");
        //如果数组是排好序的打印true


        //简单测试quicksort速度
        int[] arr2 = new int[10000000];
        for (int i = 0; i < 10000000; i++){
            arr2[i] = random.nextInt(Integer.MAX_VALUE);
        }

        Long start = System.nanoTime();
        Sort.quicksort(arr2);
        Long end = System.nanoTime();

        System.out.println("对10^7长度的随机数组进行quicksort耗时: " + (end-start)/1000000000.0 +"秒");
        //对10^7长度的随机数组进行quicksort耗时: 1.375751317秒
    }
}
