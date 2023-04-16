package io.reactivex.internal.operators.observable.l$a;
import grd.c;
import io.reactivex.internal.operators.observable.l$b;
import java.lang.Throwable;
import java.lang.Object;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.util.Collection;
import crd.b;
import io.reactivex.internal.observers.k;
import drd.a;
import brd.y;

public final class l$a extends c	// class@0013d1
{
    public final l$b parent;

    public void l$a(l$b p0){
       super();
       this.parent = p0;
    }
    public void onComplete(){
       this.parent.onComplete();
    }
    public void onError(Throwable p0){
       this.parent.onError(p0);
    }
    public void onNext(Object p0){
       p0 = this.parent;
       Objects.requireNonNull(p0);
       Object obj = p0.K.call();
       a.c(obj, "The buffer supplied is null");
       _monitor_enter(p0);
       l$b o = p0.O;
       if (o == null) {
          _monitor_exit(p0);
       }else {
          p0.O = obj;
          _monitor_exit(p0);
          p0.g(o, false, p0);
       }
       return;
    }
}
