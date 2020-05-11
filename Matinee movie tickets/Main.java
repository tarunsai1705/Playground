#include<iostream>
#include <iomanip>   
int main()
{
    int a;
    float b;
    std::cin>>a>>b;
   
    if(a>13)
    {
        if(b==float(13.30))
        std::cout<<"$5.00";
        else
        std::cout<<"$8.00";
    }
    else{
        if(b==float(13.30))
        std::cout<<"$2.00";
        else
        std::cout<<"$4.00";
    }
}