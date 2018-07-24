# Warmup-2
Google Inside Look/ CodingBat challenges

int countXX(String str) {
  int occurrence=0;
  if(str.length()>1)
  {
    for(int i=0;i<str.length()-1;i++)
    {
      if(str.charAt(i)=='x'&&str.charAt(i+1)=='x')occurrence++;
    }
    return occurrence;
  }
  return 0;
}
