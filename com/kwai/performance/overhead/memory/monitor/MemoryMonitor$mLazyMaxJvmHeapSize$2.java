package com.kwai.performance.overhead.memory.monitor.MemoryMonitor$mLazyMaxJvmHeapSize$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Runtime;
import java.lang.Object;
import java.lang.Long;

public final class MemoryMonitor$mLazyMaxJvmHeapSize$2 extends Lambda implements a	// class@00115b
{
    public static final MemoryMonitor$mLazyMaxJvmHeapSize$2 INSTANCE;

    static {
       MemoryMonitor$mLazyMaxJvmHeapSize$2.INSTANCE = new MemoryMonitor$mLazyMaxJvmHeapSize$2();
    }
    public void MemoryMonitor$mLazyMaxJvmHeapSize$2(){
       super(0);
    }
    public final long invoke(){
       return (Runtime.getRuntime().maxMemory() / 1024);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
