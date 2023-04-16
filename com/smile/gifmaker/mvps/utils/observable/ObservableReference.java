package com.smile.gifmaker.mvps.utils.observable.ObservableReference;
import im8.f;
import com.smile.gifmaker.mvps.utils.DefaultObservable;
import java.lang.Object;

public final class ObservableReference extends DefaultObservable implements f	// class@000c39
{
    public final f mDelegate;

    public void ObservableReference(f p0){
       super();
       this.mDelegate = p0;
    }
    public Object get(){
       return this.mDelegate.get();
    }
    public void set(Object p0){
       this.mDelegate.set(p0);
       this.notifyChanged(p0);
    }
}
