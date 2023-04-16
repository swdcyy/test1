package io.reactivex.internal.operators.observable.c$a;
import grd.b;
import java.lang.Object;
import io.reactivex.internal.util.NotificationLite;
import java.lang.Throwable;

public final class c$a extends b	// class@0013a4
{
    public Object c;

    public void c$a(Object p0){
       super();
       this.c = NotificationLite.next(p0);
    }
    public void onComplete(){
       this.c = NotificationLite.complete();
    }
    public void onError(Throwable p0){
       this.c = NotificationLite.error(p0);
    }
    public void onNext(Object p0){
       this.c = NotificationLite.next(p0);
    }
}
