package com.google.common.util.concurrent.AbstractFuture$e;
import com.google.common.util.concurrent.AbstractFuture$b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import com.google.common.util.concurrent.AbstractFuture$a;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.AbstractFuture$d;
import java.lang.Object;
import com.google.common.util.concurrent.AbstractFuture$j;
import java.lang.Thread;

public final class AbstractFuture$e extends AbstractFuture$b	// class@001927
{
    public final AtomicReferenceFieldUpdater a;
    public final AtomicReferenceFieldUpdater b;
    public final AtomicReferenceFieldUpdater c;
    public final AtomicReferenceFieldUpdater d;
    public final AtomicReferenceFieldUpdater e;

    public void AbstractFuture$e(AtomicReferenceFieldUpdater p0,AtomicReferenceFieldUpdater p1,AtomicReferenceFieldUpdater p2,AtomicReferenceFieldUpdater p3,AtomicReferenceFieldUpdater p4){
       super(null);
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public boolean a(AbstractFuture p0,AbstractFuture$d p1,AbstractFuture$d p2){
       return this.d.compareAndSet(p0, p1, p2);
    }
    public boolean b(AbstractFuture p0,Object p1,Object p2){
       return this.e.compareAndSet(p0, p1, p2);
    }
    public boolean c(AbstractFuture p0,AbstractFuture$j p1,AbstractFuture$j p2){
       return this.c.compareAndSet(p0, p1, p2);
    }
    public void d(AbstractFuture$j p0,AbstractFuture$j p1){
       this.b.lazySet(p0, p1);
    }
    public void e(AbstractFuture$j p0,Thread p1){
       this.a.lazySet(p0, p1);
    }
}
