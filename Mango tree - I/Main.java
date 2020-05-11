#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  if((c>=1 && c<=b)||(c%b==1)||(c%b==0))
  std::cout<<"Yes";
  else
    std::cout<<"No";
}