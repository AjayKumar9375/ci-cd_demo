#include <iostream>

using namespace std;

class TwoD_Shape{

protected:
    int ar;
    int prmtr;
public:
    TwoD_Shape(): ar(0), prmtr(0){cout<<"Two_D constructor"<<endl; }
    virtual void area()=0;
    virtual void perimeter()=0;

};

class Circle: public TwoD_Shape {
private:
    long r, d;

public:
    Circle(){
        ar=prmtr=r=d=0;
    }
};

class Polygon: public TwoD_Shape {
private:

public:
    Polygon(){
        ar=prmtr=0;
    }
};

class Triangle : public TwoD_Shape{
private:
    int base, height, hyp;
public:
    Triangle(){
        ar=prmtr=base=height=hyp=0;
    } 

    void input(){
        cout<<endl<<"Enter three sides of right triangle: Base, Height and Hypotenous corresponding: ";
        cin>>base>>height>>hyp;
    }

    void area(){
        ar = (base*height)/2;
        cout<<"Area of right triangle "<<ar<<endl;
    }
    void perimeter(){
        prmtr = base+height+hyp;
        cout<< "Parameter of right triangle: "<<prmtr<<endl;
    }
};


class Rectangle: public Polygon {

private:
    int l, b;
public:
    Rectangle(){
        ar=prmtr=l=b=0;
    }
    void input(){
        cout<<"Enter length and breadth"<<endl;
        cin>>l>>b;
    }
    void area(){
        ar= l*b;
        cout<<ar<<endl;
    }
    void perimeter(){
        prmtr = 2*(l + b);
        cout<<prmtr <<endl;
    }

};
int main(){

    // Triangle two;
    Triangle t;
    t.input();
    t.area();

    return 0;
}