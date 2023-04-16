package io.reactivex.internal.operators.single.d$a;
import brd.d0;
import io.reactivex.internal.operators.single.d;
import java.lang.Object;
import java.lang.Throwable;
import erd.g;
import drd.a;
import io.reactivex.exceptions.CompositeException;
import crd.b;

public final class d$a implements d0	// class@00148a
{
    public final d0 b;
    public final d c;

    public void d$a(d p0,d0 p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void onError(Throwable p0){
       this.c.onError.accept(p0);
       this.b.onError(p0);
       return;
    }
    public void onSubscribe(b p0){
       this.b.onSubscribe(p0);
    }
    public void onSuccess(Object p0){
       this.b.onSuccess(p0);
    }
}
