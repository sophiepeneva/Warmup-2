# Warmup-2
Google Inside Look/ CodingBat challenges

public String stringSplosion(String str) {
  int lettersToCover = 1;
  String explosion = new String();
  for(int i=0;i<str.length();i++)
  {
    explosion = explosion + str.charAt(i);
    if(i==lettersToCover-1)
    {
      i=-1;
      lettersToCover++;
    }
    if(lettersToCover==str.length()+1)i=str.length();
  }
  return explosion;
}
