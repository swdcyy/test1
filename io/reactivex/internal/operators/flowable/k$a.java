package io.reactivex.internal.operators.flowable.k$a;
import brd.y;
import cxd.d;
import cxd.c;
import java.lang.Object;
import crd.b;
import java.lang.Throwable;

public class k$a implements y, d	// class@00127a
{
    public final c b;
    public b c;

    public void k$a(c p0){
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
    public void onNext(Object p0){
       this.b.onNext(p0);
    }
    public void onSubscribe(b p0){
       this.c = p0;
       this.b.onSubscribe(this);
    }
    public void request(long p0){
    }
}
