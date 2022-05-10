#include <iostream>
using namespace std;
int main()
{
    int n, a, factorial=1;

	cout << " Input a number to find the factorial: ";
	cin>> n;
    for( a=1;a<=n;a++)
    {
        factorial=factorial*a;
    }
	cout<<" The factorial of the given number is: "<<factorial<<endl;
    return 0;
}
