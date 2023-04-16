package io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$a;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualCoordinator;
import java.lang.Object;
import io.reactivex.internal.queue.a;
import java.lang.Throwable;
import crd.b;

public final class ObservableSequenceEqualSingle$a implements y	// class@001367
{
    public final a b;
    public final int c;
    public boolean d;
    public Throwable e;
    public final ObservableSequenceEqualSingle$EqualCoordinator parent;

    public void ObservableSequenceEqualSingle$a(ObservableSequenceEqualSingle$EqualCoordinator p0,int p1,int p2){
       super();
       this.parent = p0;
       this.c = p1;
       this.b = new a(p2);
    }
    public void onComplete(){
       this.d = true;
       this.parent.drain();
    }
    public void onError(Throwable p0){
       this.e = p0;
       this.d = true;
       this.parent.drain();
    }
    public void onNext(Object p0){
       this.b.offer(p0);
       this.parent.drain();
    }
    public void onSubscribe(b p0){
       this.parent.setDisposable(p0, this.c);
    }
}
