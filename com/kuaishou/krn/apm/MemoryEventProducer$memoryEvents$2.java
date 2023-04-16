package com.kuaishou.krn.apm.MemoryEventProducer$memoryEvents$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MemoryEventProducer$memoryEvents$2 extends Lambda implements a	// class@0007b2
{
    public static final MemoryEventProducer$memoryEvents$2 INSTANCE;

    static {
       MemoryEventProducer$memoryEvents$2.INSTANCE = new MemoryEventProducer$memoryEvents$2();
    }
    public void MemoryEventProducer$memoryEvents$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final CopyOnWriteArrayList invoke(){
       Object obj = PatchProxy.apply(null, this, MemoryEventProducer$memoryEvents$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CopyOnWriteArrayList();
    }
}
