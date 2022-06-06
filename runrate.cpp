#include<iostream>
#include<stdio.h>
using namespace std;
int main ()
{
    int T,i,r1,r2,B,ball_played;
    double current_rr,asking_rr;
    cin >> T ;
    while (T--)
    {
         cin >> r1 ;
         cin >> r2 ;
         cin >> B ;
        ball_played = 300-B;
        current_rr =(r2/ball_played)*6;
        asking_rr =((r1 - r2 + 1)/B)*6;
        cout << "Current run rate -" << current_rr <<endl;
        cout << "Required run rate -" <<asking_rr << endl;

    }
    return 0;
}
