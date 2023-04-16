package io.reactivex.internal.operators.single.SingleZipArray$ZipSingleObserver;
import brd.d0;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.single.SingleZipArray$ZipCoordinator;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import crd.b;
import java.lang.Object;

public final class SingleZipArray$ZipSingleObserver extends AtomicReference implements d0	// class@00147f
{
    public final int index;
    public final SingleZipArray$ZipCoordinator parent;
    public static final long serialVersionUID = 0x2e204f2d0e121106;

    public void SingleZipArray$ZipSingleObserver(SingleZipArray$ZipCoordinator p0,int p1){
       super();
       this.parent = p0;
       this.index = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public void onError(Throwable p0){
       this.parent.innerError(p0, this.index);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
    public void onSuccess(Object p0){
       this.parent.innerSuccess(p0, this.index);
    }
}
