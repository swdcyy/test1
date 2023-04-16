package io.netty.util.internal.MpscLinkedQueueHeadRef;
import java.io.Serializable;
import zqd.m;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import io.netty.util.internal.PlatformDependent;
import zqd.l;
import java.lang.Object;

public abstract class MpscLinkedQueueHeadRef extends m implements Serializable	// class@001117
{
    public l b;
    public static final AtomicReferenceFieldUpdater c;
    public static final long serialVersionUID;

    static {
       AtomicReferenceFieldUpdater uAtomicRefer = PlatformDependent.w(MpscLinkedQueueHeadRef.class, "headRef");
       if (uAtomicRefer == null) {
          uAtomicRefer = AtomicReferenceFieldUpdater.newUpdater(MpscLinkedQueueHeadRef.class, l.class, "b");
       }
       MpscLinkedQueueHeadRef.c = uAtomicRefer;
    }
    public void MpscLinkedQueueHeadRef(){
       super();
    }
    public final l headRef(){
       return this.b;
    }
    public final void lazySetHeadRef(l p0){
       MpscLinkedQueueHeadRef.c.lazySet(this, p0);
    }
    public final void setHeadRef(l p0){
       this.b = p0;
    }
}
