package com.kwai.performance.stability.leak.monitor.message.NativeLeakMessage$NativeLeakItem;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.performance.stability.leak.monitor.message.NativeLeakMessage$BacktraceLine;
import kotlin.jvm.internal.a;

public final class NativeLeakMessage$NativeLeakItem	// class@00123c
{
    public String activity;
    public List backtraceLines;
    public String content;
    public String leakSize;
    public String threadName;
    public String type;

    public void NativeLeakMessage$NativeLeakItem(){
       super();
       this.backtraceLines = new ArrayList();
    }
    public static void type$annotations(){
    }
    public String toString(){
       String str = "Activity: "+this.activity+10+"LeakSize: "+this.leakSize+" Byte\n"+"LeakType: "+this.type+10+"LeakThread: "+this.threadName+10+"Backtrace:\n";
       Iterator iterator = this.backtraceLines.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          str = str+'#'+i+" pc "+iterator.next()+10;
          i = i + 1;
       }
       str = str;
       a.h(str, "StringBuilder\(\).apply {\n¡­\n      }\n    }.toString\(\)");
       return str;
    }
}
