[TOC]
# Log of The first actual project
_Tuesday, January 26,2021 in Java_ 

## 1. High-level design of the project

> 1. 程序启动
>   i. 提示用户键入所在地坐标，检测点数量及坐标
>   ii. 检查行数与键入数值是否相等
>   iii. 检查是否有非法数值
>   iv. 检查通过进入计算，不通过则抛出错误要求重新键入
> 2. 程序结束
>    输出最近的三个检测点==编号==

## 2. Pseudocode

```{.line-numbers}
Declare 实例变量 int xi,yi
Declare main()Method 执行程序，储存用户坐标及检测点数，整数形式传值给point()
Declare point()Method 计算距离，并以整形数组返回最近的检测点编号
Declare Compare()Method 
--------------------------------------------
Method: void main(String[] args)
    Declare int n,X,Y,j=0
    Print:请输入检测点总数及您当前的位置，以空格隔开
    Declare Point[] pts = new Point[n]
    Declare int[] distance = new int[n]
    Print:输入检测点坐标
    For ( int i=0; 1<n; i++)
        Scanner 将数据储存在引用数组变量中
    For (int[] x : pts)
        x.Point(xi,yi,X,Y)
        distance[j] = Point(xi,yi,X,Y)
    int[] reminder = Point(int xi,yi)
    Print reminder

Method: int Point(int xi,yi,X,Y )
            计算距离int D = Math.pow(X-xi,2) + Math.pow(Y-yi,2)
            返回值Return D

Method: int[] Compare(int[] distance)

```