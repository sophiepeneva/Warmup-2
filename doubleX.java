# Warmup-2
Google Inside Look/ CodingBat challenges

boolean doubleX(String str) {
  for(int i=0;i<str.length()-1;i++)
  {
    if(str.charAt(i)=='x'){
      if(str.charAt(i+1)!='x')return false;
      return true;
      
    }
  }
  return false;
}
