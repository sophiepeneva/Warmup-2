# Warmup-2
Google Inside Look/ CodingBat challenges

public String stringTimes(String str, int n) {
  if(n==0)return "";
  String temp = str;
  for(int i=0;i<n-1;i++)temp = temp + str;
  return temp;
}
