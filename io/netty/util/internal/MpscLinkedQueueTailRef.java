package io.netty.util.internal.MpscLinkedQueueTailRef;
import io.netty.util.internal.MpscLinkedQueuePad1;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import io.netty.util.internal.PlatformDependent;
import zqd.l;
import java.lang.Object;

public abstract class MpscLinkedQueueTailRef extends MpscLinkedQueuePad1	// class@001119
{
    public l d;
    public static final AtomicReferenceFieldUpdater e;
    public static final long serialVersionUID;

    static {
       AtomicReferenceFieldUpdater uAtomicRefer = PlatformDependent.w(MpscLinkedQueueTailRef.class, "tailRef");
       if (uAtomicRefer == null) {
          uAtomicRefer = AtomicReferenceFieldUpdater.newUpdater(MpscLinkedQueueTailRef.class, l.class, "d");
       }
       MpscLinkedQueueTailRef.e = uAtomicRefer;
    }
    public void MpscLinkedQueueTailRef(){
       super();
    }
    public final l getAndSetTailRef(l p0){
       return MpscLinkedQueueTailRef.e.getAndSet(this, p0);
    }
    public final void setTailRef(l p0){
       this.d = p0;
    }
    public final l tailRef(){
       return this.d;
    }
}
