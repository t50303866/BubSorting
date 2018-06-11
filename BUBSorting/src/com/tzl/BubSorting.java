package com.tzl;

/**
 * Created by tzl on 2018/6/11.
 */
public class BubSorting {
    public static void main(String[] args){
        int[] arr = new int[100000];
        System.out.print("排序前的数组：");
        for (int i = 0; i<100000;i++){
            arr[i] = (int) (Math.random()*10000000);
            System.out.print(arr[i]+"\t");
        }
        System.out.println("");
        int[] result = bubSort(arr);
        int[] result1 = bubSort2(arr);
        bubSort3(arr);

 }

    /**
     * 冒泡排序
     * @param arg
     * @return
     */
    public static int[] bubSort(int[] arg){
        int[] mid = arg.clone();
        long curTime = System.currentTimeMillis();
        for (int i=0; i<mid.length;i++){//排序n次
            for (int j=1; j<mid.length-i;j++){//循环 n-i次，因为每次排序后，最大值被沉到最后，所以最后的大值不需要排序
                if (mid[j]<mid[j-1]){//如果，a[j] < a[j-] 则交换位置，每轮循环后，最大值沉入谷底
                    int temp;
                    temp = mid[j-1];
                    mid[j-1] = mid[j];
                    mid[j] = temp;

                }
            }
        }
        double time = (System.currentTimeMillis() - curTime)/1000;
        System.out.println("算法时间 "+ time + " s");
        return mid;
    }

    /**
     * 如果有序，不再排列
     * @param arg
     * @return
     */
    public static int[] bubSort2(int[] arg){
        int[] mid = arg.clone();
        int k = mid.length;
        boolean flag = true;
        long curTime = System.currentTimeMillis();
        while (flag){
            flag = false;
            for (int j=1; j<k;j++){//循环 n-i次，因为每次排序后，最大值被沉到最后，所以最后的大值不需要排序
                if (mid[j]<mid[j-1]){//如果，a[j] < a[j-] 则交换位置，每轮循环后，最大值沉入谷底
                    int temp;
                    temp = mid[j-1];
                    mid[j-1] = mid[j];
                    mid[j] = temp;
                    flag = true;
                }
            }
            k--;
        }
        double time = (System.currentTimeMillis() - curTime)/1000;
        System.out.println("算法时间 "+ time + " s");
        return mid;
    }

    /**
     * 设置有序边界
     * @param arg
     * @return
     */
    public static int[] bubSort3(int[] arg){
        int[] mid = arg.clone();
        int flag = mid.length;
        int k;
        long curTime = System.currentTimeMillis();
        while (flag >0){
            k = flag;
            flag = 0;
            for (int j=1; j<k;j++){//循环 n-i次，因为每次排序后，最大值被沉到最后，所以最后的大值不需要排序
                if (mid[j]<mid[j-1]){//如果，a[j] < a[j-] 则交换位置，每轮循环后，最大值沉入谷底
                    int temp;
                    temp = mid[j-1];
                    mid[j-1] = mid[j];
                    mid[j] = temp;
                    flag = j;
                }
            }
        }
        double time = (System.currentTimeMillis() - curTime)/1000;
        System.out.println("算法时间 "+ time + " s");
        return mid;
    }
}
