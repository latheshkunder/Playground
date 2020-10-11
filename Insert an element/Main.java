#include <iostream>
using namespace std;

int main() 
{
  int n,i,a[50],pos,num;
   cin>>n;
  for(i=0;i<n;i++)
    cin>>a[i];
  cin>>pos>>num;
  
  for(i=n+1;i>=pos;i--)
  {
    a[i]=a[i-1];
  }    
  a[pos-1]=num;
  
for(i=0;i<n+1;i++)
    cout<<a[i]<<" ";
    
    return 0;
}