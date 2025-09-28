# 实验一	IEEE802 标准和以太网

## 步骤

我准备了两台主机，都是有线连接到路由器 LAN 口的

两台都安装了 Wireshark 和 Colasoft Packet Builder

首先分别在两台机器上的命令行中输入 `ipconfig /all`

收集一下 IP 及 MAC 地址：

第一台：IP(192.168.2.12) MAC(A4:0C:66:12:06:BE)

第二泰：IP(192.168.2.14) MAC(C8:5B:76:98:78:E1)

接下来是练习一的详细步骤：

1. 在有线那台机器上开启 Wireshark，将显示过滤器设置为 icmp
2. ping 一下
3. Wireshark 停止捕获
4. 收集 MAC 帧中包含的信息

如下：

<img width="955" height="552" alt="MAC" src="https://github.com/user-attachments/assets/861a254f-55d2-4812-a4d8-d20dad4e1a12" />


练习二的详细步骤：

1. 设置 Wireshark 的显示过滤器为 `eth.src == C8:5B:76:98:78:E1`
2. 再 ping 一下
3. 在 Wireshark 中收集

如下：

<img width="993" height="722" alt="2" src="https://github.com/user-attachments/assets/547587a0-95dc-4edf-a7f0-451e01413b58" />



练习三：

1. 打开 Colasoft Packet Builder
2. 选择以太网类型
3. 填写字段

* Destination MAC: FF:FF:FF:FF:FF:FF
* Source MAC: A4:0C:66:12:06:BE
* Type: 0x0800
* Data: 随便写点，我上网查说长度要 46-1500 字节之间，我就随便搞点
AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

4. 保存发送

由于我的笔记本电脑没有以太网口

所以我这里用有线的那台发，用笔记本电脑抓

如下：

<img width="963" height="403" alt="BROADCAST" src="https://github.com/user-attachments/assets/c358930b-11db-4cf5-b488-1c2be27eec0a" />

练习四：

设置如下：

<img width="717" height="675" alt="LLC" src="https://github.com/user-attachments/assets/63ad5de0-2ac1-48a9-b26c-b7edc5b8afd9" />

