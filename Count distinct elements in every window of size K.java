class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        int n=arr.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        list.add(map.size());
        for(int i=k;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            int ele=arr[i-k];
            map.put(ele,map.get(ele)-1);
            if(map.get(ele)==0)
            {
                map.remove(ele);
            }
            list.add(map.size());
        }
        
        return list;
    }
}
