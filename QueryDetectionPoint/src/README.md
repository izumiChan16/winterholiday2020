
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
Declare main()Method 执行程序，储存用户坐标及检测点数，传值
Declare In()Class
Declare Calculate()Class 计算距离，并以整形数组返回最近的检测点编号
Declare Compare()Class
Declare Out()Class
```
```java{.line-numbers}
Method: void main(String[] args)
    Declare int n,X,Y,j=0
    Print:请输入检测点总数及您当前的位置，以空格隔开
    Declare Point[] pts = new Point[n]
    Declare int[] distance = new int[n]
    Print:输入检测点坐标
    For ( int i=0; 1<n; i++)
        Scanner 将数据储存在引用数组变量中
    For (int[] x : pts)
        x.Point(X,Y)
        distance[j] = Point(X,Y)
    int[] reminder = Point(int xi,yi)
    Print reminder
```

```java{.line-numbers}
Method: int Calculate(int X,Y )
            计算距离int D = Math.pow(X-xi,2) + Math.pow(Y-yi,2)
            返回值Return D
```

```java{.line-numbers}
Method: int[] Compare(int[] distance)
            定义一个最小值int[0] = min
            定义一个变量临时储存下标 int index
            定义一个数组储存下标 int[] subscript = new int[3]
            while(subscript[2] == null)
            if(a[i] < a[index])
            替换 index = i
            声明临时变量int j=0
            将index存入subscript[]数组
            j++

            返回数组Return subscript

```

## 3. Debug(only serious)
1. `NoSuchElementException` 异常
   删除 `scan.close();` 解决
2. `java.lang.ArrayIndexOutOfBoundsException`异常
   修改声明下标为合理范围解决
3. `java.lang.NullPointerException` 异常
   需要给对象数组挨个初始化解决

4. 在该循环中无法正常为min赋值
   ```java{.line-numbers}
 
    while(j < 3) {
            for (int i = 0; i < dist.length; i++) {
                if (dist[i] < dist[minIndex] && dist[i] != -1) {
                    minIndex = i;
                }
            }
            min[j] = minIndex;
            dist[min[j]] = -1;
            j++;
        }
    ```
    先找到数组中最大的数，每一次循环结束把最小值替换为最大值解决
    ```java{.line-numbers}
    int reminder = 0;
        for (int i = 0; i < dist.length; i++){
            if (dist[i] > dist[reminder]) {
                reminder = i;
            }
        }
        int max = reminder;
        while(j < 3) {
            for (int i = 0; i < dist.length; i++) {
                if (dist[i] < dist[minIndex] && dist[i] != dist[reminder]) {
                    minIndex = i;
                }
            }
            min[j] = minIndex;
            dist[min[j]] = dist[reminder];
            j++;

        }
    ```
## 4. Experience
似乎对面向对象有点感觉了……

---
END
