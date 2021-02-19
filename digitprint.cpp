#include<iostream>
#include<math.h>
using namespace std;

int main(int argc, char ** argv)
{
// 1st job - to find the no. of digits in a number 
// 2nd job - to print in an order from left to right .

//1st job :-->
int n;
cout<<"\nenter no. =";
cin>>n;
int temp =n;
int dig =0;
while(temp!=0)
{
    temp=temp/10;
    dig++;
}
//2nd job -->
int div= pow(10,dig-1);

while(n!=0)
{
//main step
int q= n/div;
cout<<"\n"<<q;
//weh have to decrease div and we have to decrease n also 
//(these are imp steps)

n=n%div; 
div =div/10;
}
}
