# Warmup-2
Google Inside Look/ CodingBat challenges

public String frontTimes(String str, int n) {
if(n>0){
int size = str.length();
if(size>3)size=3;
String temp = str.substring(0,size);
String front = temp;
for(int i=0;i<n-1;i++)temp=temp+front;
return temp;
}
return "";
}
