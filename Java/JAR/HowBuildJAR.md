# 如何打 JAR 包

这个感觉应该不是特别困难

大概要制作以下几种类型的 JAR 包：

* 只有一个类的

* 有两个类的

还有的我之后再研究吧

## 流程

首先，用上次写的那个输出 hello 的类

```
public class hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

注：这个代码之后改了，因为要用两个类，我会在这个代码里面调用另外一个类

先进入终端编译这个文件

```
javac hello.java
```

然后打 JAR 包

```
 jar -cvf hello.jar hello.class 
```

-cvf 是参数 c 应该是创建的意思 v 是输出创建的过程 f 是给包命名

然后用压缩软件打开 JAR 包修改 META-INF

加一行 Main-Class: hello

之后尝试运行 java -jar hello.jar 

接下来打含有两个类的包：

在参数里面多加一个 f 

用于定义 MANIFEST 文件

也可以使用这个命令来指定有入口类的 java 文件

```
jar -cvfe hello.jar hello hello.class usehello.class
```

大概就是这样



