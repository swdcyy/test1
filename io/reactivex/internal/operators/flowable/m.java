package io.reactivex.internal.operators.flowable.m;
import io.reactivex.internal.fuseable.m;
import brd.h;
import java.lang.Object;
import cxd.c;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import cxd.d;

public final class m extends h implements m	// class@00127d
{
    public final Object c;

    public void m(Object p0){
       super();
       this.c = p0;
    }
    public void D(c p0){
       p0.onSubscribe(new ScalarSubscription(p0, this.c));
    }
    public Object call(){
       return this.c;
    }
}
