#include <iostream>
using namespace std;

int main() 
{
  int bin,n,sum=0,c=1,x;
   cin>>bin;
  while(bin>0)
  {
    x=bin%10;
    if(x==1)
    {
      sum=sum+c;
    }
    c=c*2;
    bin=bin/10;
  }
  cout<<sum;
    return 0;
}