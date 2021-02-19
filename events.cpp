#include<iostream>

using namespace std;

int main(int argc, char ** argv)
{

    int e1s,e1e,e2s,e2e;
    cout<<"\nEnter starting and ending point for Event 1=";
    cin>>e1s>>e1e;
    cout<<"\nEnter starting and ending point for Event 2=";
    cin>>e2s>>e2e;
    if(e2s>e1e || e1s>e2e )
    {
        cout<<"\nNo Overlap";
    }
    else if(e2s>e1s && e1e>e2e || e1s>e2s && e2e>e1e)
    {
        cout<<"\nFull Overlap";
    }
    else
    {
        cout<<"\nPartial Overlap";
    }
    
}