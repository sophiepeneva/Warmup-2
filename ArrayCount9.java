# Warmup-2
Google Inside Look/ CodingBat challenges

public int arrayCount9(int[] nums) {
  int nines = 0;
  for(int i=0;i<nums.length;i++)
  {
    if(nums[i]==9)nines++;
  }
  return nines;
}
