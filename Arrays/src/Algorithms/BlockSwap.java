package Algorithms;

public class BlockSwap {
    static void invert(int a[],int si,int d,int n)
    {
        if(d<0||d>=n)
            return;
        if(d==n-d)
        {
            swap(a,si,n-d+si,d);
            return;
        }
        if(d<n-d)
        {
            swap(a,si,n-d+si,d);
            invert(a,si,d,n-d);
        }
        else
        {
            swap(a,si,d+si,n-d);
            invert(a,n-d+si,2*d-n,d);
        }
        return;
    }
    static void swap(int a[],int fi,int si,int d)
    {
        for(int i=0;i<d;i++)
        {
            int temp=a[fi+i];
            a[fi+i]=a[si+i];
            a[si+i]=temp;
        }
    }
    public static void main(String[] args)
    {
        int[] a= {1,2,3,4,5,6,7};
        invert(a,0,2,7);
        for(int i=0;i<7;i++)
            System.out.print(a[i]+" ");

    }
}
