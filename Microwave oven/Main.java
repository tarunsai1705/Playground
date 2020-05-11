#include<iostream>
#include <iomanip>   
int main()
{
    float a,b,c;
    std::cin>>a>>b;
    if(a<=2)
    {
    b=1.50*b;
    std::cout<<std::fixed<<std::setprecision(2)<<b;
    }
    else if(a==3)
    {
        b=2.0*b;
        std::cout<<b;
    }
    else if(a>3)
    std::cout<<"Number of items is more";
}