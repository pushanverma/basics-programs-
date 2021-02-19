#include<iostream>

using namespace std;

int main(int argc , char ** argv)
{
    int n;
    cout<<"\nenter no. =";
    cin>>n;
int a=0 ,b=1;
cout<<"\nthe series is -";
for(int i=1;i<=n;i++)
    {
        cout<<"\n"<<a;
        int temp;
        temp =a+b;
        a=b;
        b=temp;
    }

}