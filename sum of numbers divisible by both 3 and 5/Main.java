#include <iostream>
using namespace std;
int main() 
{
   int m,n,i,sum=0;
  cin>>m>>n;
   for(i=m;i<=n;i++)
  {
    if(i%3==0 && i%5==0)
      sum=sum+i;
  }
  cout<<sum;
    return 0;
}