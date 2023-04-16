package io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver;
import brd.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable$SwitchMapCompletableObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import ird.a;
import crd.b;

public final class ObservableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver extends AtomicReference implements d	// class@0012d5
{
    public final ObservableSwitchMapCompletable$SwitchMapCompletableObserver parent;
    public static final long serialVersionUID = 0x90ee320c22def121;

    public void ObservableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver(ObservableSwitchMapCompletable$SwitchMapCompletableObserver p0){
       super();
       this.parent = p0;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public void onComplete(){
       ObservableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver tparent = this.parent;
       if (tparent.e.compareAndSet(this, null) && tparent.f != null) {
          Throwable throwable = tparent.d.terminate();
          if (throwable == null) {
             tparent.downstream.onComplete();
          }else {
             tparent.downstream.onError(throwable);
          }
       }
       return;
    }
    public void onError(Throwable p0){
       ObservableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver tparent = this.parent;
       if (tparent.e.compareAndSet(this, null) && tparent.d.addThrowable(p0)) {
          if (tparent.c != null) {
             if (tparent.f != null) {
                tparent.downstream.onError(tparent.d.terminate());
             }
          }else {
             tparent.dispose();
             p0 = tparent.d.terminate();
             if (p0 != ExceptionHelper.a) {
                tparent.downstream.onError(p0);
             }
          }
       }else {
          a.l(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
