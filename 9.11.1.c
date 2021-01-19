// 设计一个函数min(x, y)，返回两个double类型值的较小值。在一个简单的驱动程序中测试该函数。

#include<stdio.h>
double min(double ,double );
int main(){
    double x,y;
    scanf("%lf %lf",&x,&y);
    double a = min(x,y);
    printf("%.2lf",a);
    system("pause");
    return 0;
}

double min(double x,double y){
    double ret;
    if( x<y ){
        ret = x;
    }
    else{
        ret = y;
    }
    return ret;
}