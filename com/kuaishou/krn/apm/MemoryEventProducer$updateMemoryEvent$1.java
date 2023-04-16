package com.kuaishou.krn.apm.MemoryEventProducer$updateMemoryEvent$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.krn.apm.MemoryEventProducer;
import java.lang.Object;
import com.kuaishou.krn.apm.MemoryEvent;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import qrd.p;
import java.lang.System;
import java.lang.Long;

public final class MemoryEventProducer$updateMemoryEvent$1 extends Lambda implements l	// class@0007b4
{
    public final MemoryEventProducer this$0;

    public void MemoryEventProducer$updateMemoryEvent$1(MemoryEventProducer p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(MemoryEvent p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MemoryEventProducer memoryEventP = MemoryEventProducer.class;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryEventProducer$updateMemoryEvent$1.class, str)) {
          return;
       }
       a.p(p0, "it");
       if (this.this$0.a() != null) {
          this.this$0.a().invoke(p0);
       }else {
          MemoryEventProducer$updateMemoryEvent$1 tthis$0 = this.this$0;
          Objects.requireNonNull(tthis$0);
          Object obj = PatchProxy.apply(null, tthis$0, memoryEventP, str);
          if (obj != patchProxyRe) {
          }else {
             obj = tthis$0.a.getValue();
          }
          obj.add(p0);
          MemoryEventProducer$updateMemoryEvent$1 tthis$01 = this.this$0;
          Objects.requireNonNull(tthis$01);
          Object obj1 = PatchProxy.apply(null, tthis$01, memoryEventP, "2");
          if (obj1 != patchProxyRe) {
          }else {
             obj1 = tthis$01.b.getValue();
          }
          obj1.add(Long.valueOf(System.currentTimeMillis()));
       }
       return;
    }
}
