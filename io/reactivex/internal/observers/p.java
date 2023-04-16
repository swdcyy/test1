package io.reactivex.internal.observers.p;
import brd.d;
import cxd.d;
import cxd.c;
import java.lang.Object;
import crd.b;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class p implements d, d	// class@0011ee
{
    public final c b;
    public b c;

    public void p(c p0){
       super();
       this.b = p0;
    }
    public void cancel(){
       this.c.dispose();
    }
    public void onComplete(){
       this.b.onComplete();
    }
    public void onError(Throwable p0){
       this.b.onError(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.c, p0)) {
          this.c = p0;
          this.b.onSubscribe(this);
       }
       return;
    }
    public void request(long p0){
    }
}
