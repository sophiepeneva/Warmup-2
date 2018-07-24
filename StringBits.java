# Warmup-2
Google Inside Look/ CodingBat challenges

public String stringBits(String str) {
  String temp = new String();
  for(int i=0;i<str.length();i+=2)temp=temp+str.charAt(i);
  return temp;
}
