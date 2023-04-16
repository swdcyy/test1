package io.reactivex.internal.operators.observable.ObservableCreate;
import brd.t;
import io.reactivex.g;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableCreate$CreateEmitter;
import crd.b;
import brd.v;
import java.lang.Throwable;
import drd.a;

public final class ObservableCreate extends t	// class@001300
{
    public final g b;

    public void ObservableCreate(g p0){
       super();
       this.b = p0;
    }
    public void subscribeActual(y p0){
       ObservableCreate$CreateEmitter uCreateEmitt = new ObservableCreate$CreateEmitter(p0);
       p0.onSubscribe(uCreateEmitt);
       this.b.subscribe(uCreateEmitt);
       return;
    }
}
