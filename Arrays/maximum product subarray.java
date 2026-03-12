class Solution {
    public int maxProduct(int[] nums) {
        int maxProd=nums[0];
        int minProd=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
           int currunt=nums[i];
           int tempMax=maxProd;
            maxProd=Math.max(currunt,Math.max(currunt*maxProd,currunt*minProd));
            minProd=Math.min(currunt,Math.min(currunt*tempMax,currunt*minProd));
            result=Math.max(result,maxProd);
        }
        return result;
    }
}
