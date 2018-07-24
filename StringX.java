# Warmup-2
Google Inside Look/ CodingBat challenges

public String stringX(String str) {
  if(str.length()>1){
  String reduced = str.substring(0,1);
  for(int i=1;i<str.length()-1;i++)
  {
    if(str.charAt(i)!='x')reduced = reduced + str.charAt(i);
  }
  reduced = reduced + str.charAt(str.length()-1);
    return reduced;
  }
  return str;
}
