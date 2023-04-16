package io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver;
import brd.d0;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import crd.b;
import java.lang.Object;

public final class ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver extends AtomicReference implements d0	// class@0012db
{
    public Object item;
    public final ObservableSwitchMapSingle$SwitchMapSingleMainObserver parent;
    public static final long serialVersionUID = 0x6f9e30e36197ffc7;

    public void ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver(ObservableSwitchMapSingle$SwitchMapSingleMainObserver p0){
       super();
       this.parent = p0;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
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
