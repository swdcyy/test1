package io.reactivex.internal.operators.observable.ObservableRefCount$RefConnection;
import java.lang.Runnable;
import erd.g;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;

public final class ObservableRefCount$RefConnection extends AtomicReference implements Runnable, g	// class@001335
{
    public boolean connected;
    public final ObservableRefCount parent;
    public long subscriberCount;
    public b timer;
    public static final long serialVersionUID = 0xc0d3b02923efe9df;

    public void ObservableRefCount$RefConnection(ObservableRefCount p0){
       super();
       this.parent = p0;
    }
    public void accept(b p0){
       DisposableHelper.replace(this, p0);
    }
    public void accept(Object p0){
       this.accept(p0);
    }
    public void run(){
       this.parent.c(this);
    }
}
