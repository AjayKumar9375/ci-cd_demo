#include<iostream>

using namespace std;

template<typename T>

    T sum(T x, T y){
     T sum;
     sum = x + y;
     return sum;
    }

int main(){

    cout<<sum<int>(7,8);
    
}