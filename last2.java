# Warmup-2
Google Inside Look/ CodingBat challenges

public int last2(String str) {
  if(str.length()>1){
  String substr = new String();
  substr = str.substring(str.length()-2,str.length());
  int occurances = 0;
  for(int i=0;i<str.length()-2;i++)
  {
    String temple =  str.substring(i,i+2);
    if(substr.compareTo(temple)==0)
    {
      occurances++;
    }
  }
  return occurances;
  }
  return 0;
}
