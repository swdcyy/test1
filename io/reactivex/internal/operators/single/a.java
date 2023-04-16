package io.reactivex.internal.operators.single.a;
import brd.a0;
import brd.e0;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.d0;
import io.reactivex.internal.disposables.SequentialDisposable;
import crd.b;
import io.reactivex.internal.operators.single.a$a;

public final class a extends a0	// class@001485
{
    public final e0 b;
    public final long c;
    public final TimeUnit d;
    public final z e;
    public final boolean f;

    public void a(e0 p0,long p1,TimeUnit p2,z p3,boolean p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void S(d0 p0){
       SequentialDisposable sequentialDi = new SequentialDisposable();
       p0.onSubscribe(sequentialDi);
       this.b.b(new a$a(this, sequentialDi, p0));
    }
}
