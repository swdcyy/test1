package io.reactivex.internal.operators.completable.l$a;
import brd.d;
import io.reactivex.internal.observers.b;
import brd.y;
import crd.b;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;

public final class l$a extends b implements d	// class@001211
{
    public final y b;
    public b c;

    public void l$a(y p0){
       super();
       this.b = p0;
    }
    public void clear(){
    }
    public void dispose(){
       this.c.dispose();
    }
    public boolean isDisposed(){
       return this.c.isDisposed();
    }
    public boolean isEmpty(){
       return true;
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
    public Object poll(){
       return null;
    }
    public int requestFusion(int p0){
       return (p0 & 0x02);
    }
}
