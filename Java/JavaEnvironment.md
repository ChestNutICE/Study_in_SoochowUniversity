# 配置 Java 开发环境

## 步骤

1. 下载安装 JDK
   
先在官网找到下载链接，[网址是](https://www.oracle.com/java/technologies/downloads/?er=221886#jdk25-windows)

接下来进行安装，安装完之后进行环境变量的配置

2. 配置环境变量

我用的是 windows 系统，在设置里面就有配置环境变量这个选项

首先配置 JAVA_HOME, 这个指定了 JDK 的安装目录，所以把刚刚安装的路径直接粘贴进去就可以

然后配置 PATH, 可以直接选 JDK 底下那个 bin

不过避免以后改变 JDK 的目录导致的问题，也可以写 %JAVA_HOME%bin; 这样每次就只需要改 JAVA_HOME 这一个环境变量了，记得最后加分号

再配置 CLASSPATH

虽然新版本的 JDK 不配置这个也可以进行开发，但是在这里我还是研究一下吧，万一哪天用得到呢

新建一个变量名为 CLASSPATH 的变量，地址引用就写 .;%JAVA_HOME%\lib\dt.jar;%JAVA_HOME%\lib\tools.jar

前面有个点

3. 保存后进入 cmd 命令行验证环境变量

```
C:\Users\YuboH>java -version
java version "25" 2025-09-16 LTS
Java(TM) SE Runtime Environment (build 25+37-LTS-3491)
Java HotSpot(TM) 64-Bit Server VM (build 25+37-LTS-3491, mixed mode, sharing)

C:\Users\YuboH>
```

4. 我是在 vscode 中进行开发的，所以我还要装几个相关的插件

到 vscode 拓展商店里装一个 Extension Pack 就好啦

##

到这里，安装配置就差不多完成了


