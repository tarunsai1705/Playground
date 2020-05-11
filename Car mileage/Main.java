#include<iostream>
using namespace std;
int main()
{
 float a,b,c;
 std::cin>>a>>b>>c;
 a=a*b;
 if(a>=c)
   std::cout<<"Can reach";
 else
   std::cout<<"Cannot reach";

}