#include<iostream>
int main()
{
    float a,b,c,d,e,f,g,h,i,min;
    int x;
    std::cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
    b=b/100;
    b=a*b;
    a-=b;
    a+=c;
    min=a;
    x=1;
    std::cout<<"In Flipkart Rs."<<a<<"\n";
    e=e/100;
    e=d*e;
    d-=e;
    d+=f;
    if(d<min){
    min=d;
    x=2;}
    std::cout<<"In Snapdeal Rs."<<d<<"\n";
    h=h/100;
    h=g*h;
    g-=h;
    g+=i;
    if(g<min){
    min=g;
    x=3;}
    std::cout<<"In Amazon Rs."<<g<<"\n";
    if(x==1)
    std::cout<<"He will prefer Flipkart";
    else if(x==2)
    std::cout<<"He will prefer Snapdeal";
    else if(x==3)
    std::cout<<"He will prefer Amazon";
}