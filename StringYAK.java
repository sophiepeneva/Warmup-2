# Warmup-2
Google Inside Look/ CodingBat challenges

public String stringYak(String str) {
  String temp=new String();
  boolean wasAYak=false;
  for(int i=0;i<str.length();i++)
  {
    if(i+2<str.length()){
    if(str.charAt(i)=='y'&&str.charAt(i+1)=='a'&&str.charAt(i+2)=='k')
    {
      i+=2;
      wasAYak=true;
    }
    }
    if(wasAYak==false)
    temp=temp+str.charAt(i);
    wasAYak=false;
  }
  return temp;
}
