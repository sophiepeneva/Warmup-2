# Warmup-2
Google Inside Look/ CodingBat challenges

public int stringMatch(String a, String b) {
  int matches=0;
  int size = a.length();
  if(size>b.length())size=b.length();
  for(int i=0;i<size-1;i++)
  {
    String substrA = a.substring(i,i+2);
    String substrB = b.substring(i,i+2);
    if(substrA.compareTo(substrB)==0)matches++;
  }
  return matches;
}
