#include <iostream>
using namespace std;

int main() 
{
   
  int a[50],b[50],c[50],n1,n2,i,j,count=0,x=0;
  cin>>n1>>n2;
  for(i=0;i<n1;i++)
    cin>>a[i];
  for(i=0;i<n2;i++)
    cin>>b[i];
  
  for(i=0;i<=n1;i++)
  {
    for(j=0;j<=n2;j++)
    {
      if(a[i]==b[j])
      {
        count++;
       
      }
     }
    if(count==0)
    {
     cout<<a[i]<<" ";
      x++;
    }
    count=0;
  }
   for(i=0;i<=n2;i++)
  {
    for(j=0;j<=n1;j++)
    {
      if(b[i]==a[j])
      {
        count++;
        
      }
     }
    if(count==0)
    {
     cout<<b[i]<<" ";
      x++;
    }
    count=0;
  }
  cout<<endl<<x;
 
    return 0;
}