#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e;
  std::cin>>a>>b>>c;
  d=a*b;
  d-=a;
  if((c>=a+1)&&(c<=a+a)||(c>=d-a)&&(c<=d))
  std::cout<<"It is a mango tree";
  else
  std::cout<<"It is not a mango tree";
 
}