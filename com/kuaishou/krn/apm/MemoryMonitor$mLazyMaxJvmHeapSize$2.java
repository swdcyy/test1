package com.kuaishou.krn.apm.MemoryMonitor$mLazyMaxJvmHeapSize$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Runtime;
import java.lang.Long;

public final class MemoryMonitor$mLazyMaxJvmHeapSize$2 extends Lambda implements a	// class@0007c3
{
    public static final MemoryMonitor$mLazyMaxJvmHeapSize$2 INSTANCE;

    static {
       MemoryMonitor$mLazyMaxJvmHeapSize$2.INSTANCE = new MemoryMonitor$mLazyMaxJvmHeapSize$2();
    }
    public void MemoryMonitor$mLazyMaxJvmHeapSize$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, MemoryMonitor$mLazyMaxJvmHeapSize$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (Runtime.getRuntime().maxMemory() / 1024);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
