package io.reactivex.internal.operators.completable.m$a;
import brd.d;
import io.reactivex.internal.operators.completable.m;
import brd.d0;
import java.lang.Object;
import java.util.concurrent.Callable;
import java.lang.Throwable;
import drd.a;
import java.lang.NullPointerException;
import java.lang.String;
import crd.b;

public final class m$a implements d	// class@001213
{
    public final d0 b;
    public final m c;

    public void m$a(m p0,d0 p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void onComplete(){
       m$a tc = this.c;
       m c = tc.c;
       m om = (c != null)? c.call(): tc.d;
       if (om == null) {
          this.b.onError(new NullPointerException("The value supplied is null"));
       }else {
          this.b.onSuccess(om);
       }
       return;
    }
    public void onError(Throwable p0){
       this.b.onError(p0);
    }
    public void onSubscribe(b p0){
       this.b.onSubscribe(p0);
    }
}
