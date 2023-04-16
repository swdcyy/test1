package com.yxcorp.gifshow.observers.ErrorCrashLambdaObserver;
import brd.y;
import crd.b;
import grd.e;
import java.util.concurrent.atomic.AtomicReference;
import erd.g;
import io.reactivex.internal.functions.Functions;
import erd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import io.reactivex.internal.disposables.DisposableHelper;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Throwable;
import drd.a;
import ird.a;
import com.yxcorp.utility.Log;
import java.lang.RuntimeException;

public class ErrorCrashLambdaObserver extends AtomicReference implements y, b, e	// class@0021d0
{
    public final a onComplete;
    public final g onNext;
    public final g onSubscribe;
    public static final long serialVersionUID = 0x9b5ed57b794ea334;

    public void ErrorCrashLambdaObserver(g p0){
       super(p0, Functions.c, Functions.d());
    }
    public void ErrorCrashLambdaObserver(g p0,a p1,g p2){
       super();
       this.onNext = p0;
       this.onComplete = p1;
       this.onSubscribe = p2;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, ErrorCrashLambdaObserver.class, "5")) {
          return;
       }
       DisposableHelper.dispose(this);
       return;
    }
    public boolean hasCustomOnError(){
       return true;
    }
    public boolean isDisposed(){
       Object obj = PatchProxy.apply(null, this, ErrorCrashLambdaObserver.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.get() == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, ErrorCrashLambdaObserver.class, "4")) {
          return;
       }
       if (!this.isDisposed()) {
          this.lazySet(DisposableHelper.DISPOSED);
          this.onComplete.run();
       }
       return;
    }
    public void onError(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ErrorCrashLambdaObserver.class, "3")) {
          return;
       }
       if (this.isDisposed()) {
          a.l(p0);
          return;
       }else {
          this.lazySet(DisposableHelper.DISPOSED);
          Log.e("ErrorCrashLambdaObserve", "onError:", p0);
          throw new RuntimeException("这里不是崩溃的原因，请找到崩溃栈最下方的Root cause定位原因。", p0);
       }
    }
    public void onNext(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ErrorCrashLambdaObserver.class, "2")) {
          return;
       }
       if (!this.isDisposed()) {
          this.onNext.accept(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ErrorCrashLambdaObserver.class, "1")) {
          return;
       }
       if (DisposableHelper.setOnce(this, p0)) {
          this.onSubscribe.accept(this);
       }
       return;
    }
}
