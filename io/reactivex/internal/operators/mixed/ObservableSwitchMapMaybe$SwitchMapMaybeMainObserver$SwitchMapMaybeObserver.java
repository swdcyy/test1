package io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver;
import brd.p;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import crd.b;
import java.lang.Object;

public final class ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver extends AtomicReference implements p	// class@0012d8
{
    public Object item;
    public final ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver parent;
    public static final long serialVersionUID = 0x6f9e30e36197ffc7;

    public void ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver(ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver p0){
       super();
       this.parent = p0;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public void onComplete(){
       this.parent.innerComplete(this);
    }
    public void onError(Throwable p0){
       this.parent.innerError(this, p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
    public void onSuccess(Object p0){
       this.item = p0;
       this.parent.drain();
    }
}
