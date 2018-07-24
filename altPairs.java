# Warmup-2
Google Inside Look/ CodingBat challenges

public String altPairs(String str) {
  String reduced = new String();
  int[] positions = {0,1,4,5,8,9};
  int currPos=0;
  int addToPos = 1;
  while(currPos<str.length())
  {
    reduced=reduced+str.charAt(currPos);
    currPos = currPos + addToPos;
    if(addToPos==1)addToPos=3;
    else{addToPos=1;}
  }
  return reduced;
}
