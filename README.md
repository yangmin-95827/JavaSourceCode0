# JavaSourceCode0
第二周作业



6.（必做）写一段代码，使用 HttpClient 或 OkHttp 访问  http://localhost:8801 ，代码提交到 GitHub
    Server端程序在com.yangmin.week02.CustomHttpServer
    Client 端在 com.yangmin.week02.HttpClient


4.（必做）根据上述自己对于 1 和 2 的演示，写一段对于不同 GC 和堆内存的总结，提交到 GitHub。

JVM最大堆内存，在默认情况下是物理机器的四分之一，物理内存小于1g时是物理机器的二分之一
在配置堆大小时我们一般将堆的初始大小(-Xms)和最大（-Xmx）配置为一样

在对内存比较小的时候堆内存容易被占满，所以GC的执行频率会变高。
在堆内存过小不足分配给新建对象使用时不但会频繁Full GC 而且还会导致内存泄露从而是应用程序崩溃


Serial GC

串行由于是单线程执行，效率比较低，在堆内存比较少的时候GC暂停时间较为一般，在堆内存增大时，GC暂停时间比较高

Parallel GC

并行GC是多线程的效率比较高，但是也会因为堆内存的增大而导致GC暂停的时间增加。

CMS GC 

在堆内存比较少的时候，Young去GC频繁，在堆内存调大之后Young区GC明显下降，但是GC使用时间明显提升

G1 GC 

在使用G1 GC的时候要防止Full GC 产生让G1 GC 退化而导致的串行化


