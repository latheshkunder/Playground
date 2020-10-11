#include <iostream>
using namespace std;

int main() 
{
    int a[50],num,i,n,m,res;
  cin>>num;
  
  for( i=0;i<num;i++)
  	cin>>a[i];
  cin>>n>>m;
  for(i=0;i<num;i++)
  {
    res=a[i]-n;
    if(res<m)
      cout<<a[i]+1<<" ";
    else 
      cout<<a[i]<<" ";
  }
    return 0;
}