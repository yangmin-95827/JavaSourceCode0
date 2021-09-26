# JavaSourceCode0
第二周作业

CMS GC 

在堆内存1g的情况下，产生了多次年轻代GC平均在20ms左右，触发了一次Old区的GC

在堆内存4g的情况下，同样产生了多次年轻代GC，GC时间同样维持在20ms左右，触发了一次不完整的Old区GC

在堆内存8g的情况下，GC表现和在4g的时候表现的一致。

CMS GC  的GC频率

