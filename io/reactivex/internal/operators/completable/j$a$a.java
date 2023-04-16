package io.reactivex.internal.operators.completable.j$a$a;
import brd.d;
import io.reactivex.internal.operators.completable.j$a;
import java.lang.Object;
import crd.a;
import java.lang.Throwable;
import crd.b;

public final class j$a$a implements d	// class@00120c
{
    public final j$a b;

    public void j$a$a(j$a p0){
       this.b = p0;
       super();
    }
    public void onComplete(){
       this.b.c.dispose();
       this.b.d.onComplete();
    }
    public void onError(Throwable p0){
       this.b.c.dispose();
       this.b.d.onError(p0);
    }
    public void onSubscribe(b p0){
       this.b.c.c(p0);
    }
}
