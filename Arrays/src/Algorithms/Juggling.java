package Algorithms;

import java.util.Arrays;

public class Juggling {
    public static void main(String[] args)
    {
        Juggling juggle = new Juggling();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        juggle.leftRotate(arr, 2, 7);
        Arrays.stream(arr).forEach(System.out::print);
    }
    void leftRotate(int arr[],int d,int n){
        int i,j,k,temp;
        int gcd = gcd(n,d);
        for (i=0;i<gcd;i++){
            temp = arr[i];
            j=i;
            while(true){
                k = j+d;
                if(k>=n){
                    k=k-n;
                }
                if(k==i){
                    break;
                }
                arr[j] = arr[k];
                j=k;
            }
            arr[j]=temp;
        }
    }

    private int gcd(int n, int d) {
        if(d == 0) return n;
        else return gcd(d,n%d);
    }
}
