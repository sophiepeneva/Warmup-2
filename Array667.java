# Warmup-2
Google Inside Look/ CodingBat challenges

public int array667(int[] nums) {
  int occurrences=0;
  for(int i=0;i<nums.length-1;i++)
  {
    if(nums[i]==6&&(nums[i+1]==6||nums[i+1]==7))occurrences++;
  }
  return occurrences;
}
