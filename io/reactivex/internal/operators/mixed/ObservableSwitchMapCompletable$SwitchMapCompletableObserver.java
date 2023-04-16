package io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable$SwitchMapCompletableObserver;
import brd.y;
import crd.b;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver;
import brd.d;
import erd.o;
import java.lang.Object;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import io.reactivex.internal.util.ExceptionHelper;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.e;
import drd.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableSwitchMapCompletable$SwitchMapCompletableObserver implements y, b	// class@0012d6
{
    public final o b;
    public final boolean c;
    public final AtomicThrowable d;
    public final d downstream;
    public final AtomicReference e;
    public boolean f;
    public b g;
    public static final ObservableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver h;

    static {
       ObservableSwitchMapCompletable$SwitchMapCompletableObserver.h = new ObservableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver(null);
    }
    public void ObservableSwitchMapCompletable$SwitchMapCompletableObserver(d p0,o p1,boolean p2){
       super();
       this.downstream = p0;
       this.b = p1;
       this.c = p2;
       this.d = new AtomicThrowable();
       this.e = new AtomicReference();
    }
    public void a(){
       ObservableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver h = ObservableSwitchMapCompletable$SwitchMapCompletableObserver.h;
       ObservableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver andSet = this.e.getAndSet(h);
       if (andSet != null && andSet != h) {
          andSet.dispose();
       }
       return;
    }
    public void dispose(){
       this.g.dispose();
       this.a();
    }
    public boolean isDisposed(){
       boolean b = (this.e.get() == ObservableSwitchMapCompletable$SwitchMapCompletableObserver.h)? true: false;
       return b;
    }
    public void onComplete(){
       this.f = true;
       if (this.e.get() == null) {
          Throwable throwable = this.d.terminate();
          if (throwable == null) {
             this.downstream.onComplete();
          }else {
             this.downstream.onError(throwable);
          }
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.d.addThrowable(p0)) {
          if (this.c != null) {
             this.onComplete();
          }else {
             this.a();
             p0 = this.d.terminate();
             if (p0 != ExceptionHelper.a) {
                this.downstream.onError(p0);
             }
          }
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       p0 = this.b.apply(p0);
       a.c(p0, "The mapper returned a null CompletableSource");
       ObservableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver switchMapCom = new ObservableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver(this);
       ObservableSwitchMapCompletable$SwitchMapCompletableObserver$SwitchMapInnerObserver switchMapCom1 = this.e.get();
       while (switchMapCom1 != ObservableSwitchMapCompletable$SwitchMapCompletableObserver.h) {
          if (this.e.compareAndSet(switchMapCom1, switchMapCom)) {
             if (switchMapCom1 != null) {
                switchMapCom1.dispose();
             }
             p0.a(switchMapCom);
             break ;
          }
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.g, p0)) {
          this.g = p0;
          this.downstream.onSubscribe(this);
       }
       return;
    }
}
