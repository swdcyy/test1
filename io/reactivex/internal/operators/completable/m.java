package io.reactivex.internal.operators.completable.m;
import brd.a0;
import brd.e;
import java.util.concurrent.Callable;
import java.lang.Object;
import brd.d0;
import io.reactivex.internal.operators.completable.m$a;
import brd.d;

public final class m extends a0	// class@001214
{
    public final e b;
    public final Callable c;
    public final Object d;

    public void m(e p0,Callable p1,Object p2){
       super();
       this.b = p0;
       this.d = p2;
       this.c = null;
    }
    public void S(d0 p0){
       this.b.a(new m$a(this, p0));
    }
}
