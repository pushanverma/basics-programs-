#include<iostream>

using namespace std;

int main(int argc, char ** argv)
{
int n;
cout<<"\nenter no. =";
cin>>n;

int digit=0;
while (n!=0)
{
n= n/10; //storing the value of n after execution of n .
         //dividing by 10 gives n-1 eg. if n=954 , then next n will be 95 , and next one is 9 .
digit++;
}
cout<<"\nThe digits of no. entered is ="<<digit;
}