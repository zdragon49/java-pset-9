import java.util.*;

public class ProblemSet9 {
    public int[] evenOdd(int[] arr) {
        if(arr == null || arr.length == 0){
            return null;
        }
        List<Integer> even_num = new ArrayList<>();
        List<Integer> odd_num = new ArrayList<>();
        for (int i : arr) {
            if (i % 2 == 0) {
                even_num.add(i);
            }else {
                odd_num.add(i);
            }
        }
        even_num.addAll(odd_num);
        return even_num.stream().mapToInt(i -> i).toArray();
    }
    public int[] notAlone(int[] arr, int alone) {
        if(arr == null || arr.length == 0){
            return null;
        } for(int i = 1; i < arr.length-1; i ++){
            if(arr[i] == alone){
                if(arr[i-1] != alone && arr[i+1] != alone){
                    arr[i] = Math.max(arr[i - 1], arr[i + 1]);
                }
            }
        }
        return arr;
    }
    public int[] shiftLeft(int[] arr) {
        if(arr == null){
            return null;
        } else if(arr.length == 0){
            return arr;
        } int[] arr2 = new int[arr.length];
        for(int i = 1; i < arr.length; i ++){
            arr2[i-1] = arr[i];
        } arr2[arr2.length - 1] = arr[0];
        return arr2;
    }
    public int[] fillIn(int start, int end) {
        if(start > end){
            return null;
        } int[] arr = new int[end - start];
        for(int i = 0; i < arr.length; i ++){
            arr[i] = start+i;
        }
        return arr;
    }
    public boolean triple(int[] arr) {
        if(arr == null){
            return false;
        } int counter = 0;
        for(int i : arr){
            if(i == 3){
                counter++;
            }
        } return counter == 3;
    }
    public int pairs(int[] a, int[] b) {
        if(a == null || b == null || a.length != b.length){
            return -1;
        } int counter = 0;
        for(int i = 0; i < a.length; i++){
            if(Math.abs(a[i] - b[i]) < 3){
                counter++;
            }
        } return counter;
    }
    public boolean twentyFour(int[] arr) {
        if(arr== null) {
            return false;
        } boolean two_num = false;
        boolean four_num = false;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] == 2 || arr[i] == 4){
                if(arr[i + 1] == arr[i]){
                    if(arr[i] == 2){
                        two_num = true;
                    }else{
                        four_num = true;
                    }
                }
            }
        }
        return (!two_num || !four_num && (two_num || four_num));
    }
    public boolean fourteen(int[] arr) {
        if(arr == null){
            return false;
        } for(int i : arr){
            if(i != 1 && i != 4){
                return false;
            }
        } return true;
    }
    public int centeredAverage(int[] arr) {
        if(arr == null || arr.length < 3){
            return -1;
        } List<Integer> average = new ArrayList<>();
        for(int i : arr){
            average.add(i);
        } average.remove(Collections.max(average));
        average.remove(Collections.min(average));
        int sum = 0;
        for(int i : average){
            sum+=i;
        } return sum;
    }
    public int outliers(int[] arr) {
        if(arr == null || arr.length < 3){
            return -1;
        } List<Integer> average = new ArrayList<>();
        for(int i : arr){
            average.add(i);
        }
        return Collections.max(average) - Collections.min(average);
    }
}