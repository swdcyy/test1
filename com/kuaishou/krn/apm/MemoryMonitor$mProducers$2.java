package com.kuaishou.krn.apm.MemoryMonitor$mProducers$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MemoryMonitor$mProducers$2 extends Lambda implements a	// class@0007c5
{
    public static final MemoryMonitor$mProducers$2 INSTANCE;

    static {
       MemoryMonitor$mProducers$2.INSTANCE = new MemoryMonitor$mProducers$2();
    }
    public void MemoryMonitor$mProducers$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ConcurrentHashMap invoke(){
       Object obj = PatchProxy.apply(null, this, MemoryMonitor$mProducers$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ConcurrentHashMap();
    }
}
