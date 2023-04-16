package io.reactivex.internal.operators.observable.ObservableZip$a;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableZip$ZipCoordinator;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.queue.a;
import java.lang.Throwable;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableZip$a implements y	// class@00139a
{
    public final a b;
    public boolean c;
    public Throwable d;
    public final AtomicReference e;
    public final ObservableZip$ZipCoordinator parent;

    public void ObservableZip$a(ObservableZip$ZipCoordinator p0,int p1){
       super();
       this.e = new AtomicReference();
       this.parent = p0;
       this.b = new a(p1);
    }
    public void onComplete(){
       this.c = true;
       this.parent.drain();
    }
    public void onError(Throwable p0){
       this.d = p0;
       this.c = true;
       this.parent.drain();
    }
    public void onNext(Object p0){
       this.b.offer(p0);
       this.parent.drain();
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this.e, p0);
    }
}
