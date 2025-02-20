class Solution {
    public static void rearrange(int arr[]) {
        int n=arr.length;
        int[] temp=new int[n];
        Arrays.sort(arr);
        int l=0;
        int r=n-1;
        int i=0;
        if(n%2==0)
        {
          while(l<r)
           {
            temp[i++]=arr[r];
            temp[i++]=arr[l];
            l++;
            r--;
           }
        }
        else
        {
            while(l<r)
            {
            temp[i++]=arr[r];
            temp[i++]=arr[l];
            l++;
            r--;
            }
            temp[i]=arr[l];
        }
        for(int j=0;j<n;j++)
        {
            arr[j]=temp[j];
        }
    }
}
