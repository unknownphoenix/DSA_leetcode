class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : nums1) {
            hashMap.put(i,0);
        }
        int size = 0;
        for (int i : nums2) {
            Integer num = hashMap.get(i);
            if (num != null && num != 1){
                size++;
                hashMap.put(i,++num);
            }
        }
        int count = 0;
        int[] res = new int[size];
        for (Integer i : hashMap.keySet()) {
            Integer num = hashMap.get(i);
            if (count == size) return res;
            if (num ==1)
                res[count++] = i;
        }
        return res;
    }
}