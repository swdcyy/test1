package io.reactivex.internal.operators.single.e$a;
import brd.d0;
import io.reactivex.internal.operators.single.e;
import java.lang.Object;
import java.lang.Throwable;
import erd.b;
import drd.a;
import io.reactivex.exceptions.CompositeException;
import crd.b;

public final class e$a implements d0	// class@00148c
{
    public final d0 b;
    public final e c;

    public void e$a(e p0,d0 p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void onError(Throwable p0){
       this.c.c.accept(null, p0);
       this.b.onError(p0);
       return;
    }
    public void onSubscribe(b p0){
       this.b.onSubscribe(p0);
    }
    public void onSuccess(Object p0){
       this.c.c.accept(p0, null);
       this.b.onSuccess(p0);
    }
}
