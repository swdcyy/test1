package com.kwai.sharelib.tools.rx.PublishRelay$PublishDisposable;
import crd.b;
import java.util.concurrent.atomic.AtomicBoolean;
import brd.y;
import com.kwai.sharelib.tools.rx.PublishRelay;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class PublishRelay$PublishDisposable extends AtomicBoolean implements b	// class@001703
{
    public final y actual;
    public final PublishRelay parent;
    public static final long serialVersionUID = 0x3171d4005ebf93fe;

    public void PublishRelay$PublishDisposable(y p0,PublishRelay p1){
       super();
       this.actual = p0;
       this.parent = p1;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, PublishRelay$PublishDisposable.class, "2")) {
          return;
       }
       if (this.compareAndSet(false, true)) {
          this.parent.c(this);
       }
       return;
    }
    public boolean isDisposed(){
       Object obj = PatchProxy.apply(null, this, PublishRelay$PublishDisposable.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.get();
    }
    public void onNext(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PublishRelay$PublishDisposable.class, "1")) {
          return;
       }
       if (!this.get()) {
          this.actual.onNext(p0);
       }
       return;
    }
}
