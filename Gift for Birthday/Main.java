#include<iostream>
using namespace std;
int main()
{
  int x;
  std::cin>>x;
  if((x%4==0)&&(x%100!=0)||(x%400==0))
    std::cout<<x<<" is a leap year";
  else
    std::cout<<x<<" is not a leap year";
}