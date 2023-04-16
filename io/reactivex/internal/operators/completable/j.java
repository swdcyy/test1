package io.reactivex.internal.operators.completable.j;
import brd.a;
import brd.e;
import java.util.concurrent.TimeUnit;
import brd.z;
import brd.d;
import crd.a;
import crd.b;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.internal.operators.completable.j$a;
import java.lang.Runnable;
import io.reactivex.internal.operators.completable.j$b;

public final class j extends a	// class@00120f
{
    public final e b;
    public final long c;
    public final TimeUnit d;
    public final z e;
    public final e f;

    public void j(e p0,long p1,TimeUnit p2,z p3,e p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void v(d p0){
       a uoa = new a();
       p0.onSubscribe(uoa);
       AtomicBoolean uAtomicBoole = new AtomicBoolean();
       uoa.c(this.e.e(new j$a(this, uAtomicBoole, uoa, p0), this.c, this.d));
       this.b.a(new j$b(uoa, uAtomicBoole, p0));
    }
}
