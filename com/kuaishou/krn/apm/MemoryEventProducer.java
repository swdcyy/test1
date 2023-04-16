package com.kuaishou.krn.apm.MemoryEventProducer;
import sj0.b;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.apm.MemoryEventProducer$memoryEvents$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.krn.apm.MemoryEventProducer$timestamps$2;

public final class MemoryEventProducer	// class@0007b5
{
    public final p a;
    public final p b;
    public final b c;
    public final l d;

    public void MemoryEventProducer(b p0,l p1){
       a.p(p0, "krnReactInstance");
       super();
       this.c = p0;
       this.d = p1;
       this.a = s.c(MemoryEventProducer$memoryEvents$2.INSTANCE);
       this.b = s.c(MemoryEventProducer$timestamps$2.INSTANCE);
    }
    public final l a(){
       return this.d;
    }
}
