package com.tachikoma.core.utility.SingleReleaseOnDispose$DoOnDisposeObserver;
import brd.d0;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import erd.g;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;
import ird.a;

public final class SingleReleaseOnDispose$DoOnDisposeObserver extends AtomicReference implements d0, b	// class@000dd0
{
    public final d0 downstream;
    public AtomicBoolean isDisposed;
    public b upstream;
    public static final long serialVersionUID = 0x88e0578d829b6e18;

    public void SingleReleaseOnDispose$DoOnDisposeObserver(d0 p0,g p1){
       super();
       this.isDisposed = new AtomicBoolean(false);
       this.downstream = p0;
       this.lazySet(p1);
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, SingleReleaseOnDispose$DoOnDisposeObserver.class, "1")) {
          return;
       }
       this.isDisposed.set(true);
       return;
    }
    public boolean isDisposed(){
       Object obj = PatchProxy.apply(null, this, SingleReleaseOnDispose$DoOnDisposeObserver.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.isDisposed.get();
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SingleReleaseOnDispose$DoOnDisposeObserver.class, "5")) {
          return;
       }
       if (!this.isDisposed()) {
          this.downstream.onError(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SingleReleaseOnDispose$DoOnDisposeObserver.class, "3")) {
          return;
       }
       if (DisposableHelper.validate(this.upstream, p0)) {
          this.upstream = p0;
          this.downstream.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SingleReleaseOnDispose$DoOnDisposeObserver.class, "4")) {
          return;
       }
       if (this.isDisposed()) {
          g andSet = this.getAndSet(null);
          if (andSet != null) {
             try{
                andSet.accept(p0);
             }catch(java.lang.Exception e3){
                a.l(e3);
             }
          }
       }else {
          this.downstream.onSuccess(p0);
       }
    }
}
