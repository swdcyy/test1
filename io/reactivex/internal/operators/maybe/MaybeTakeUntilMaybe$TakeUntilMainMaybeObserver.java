package io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver;
import brd.p;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver$TakeUntilOtherMaybeObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;

public final class MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver extends AtomicReference implements p, b	// class@0012ac
{
    public final p actual;
    public final MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver$TakeUntilOtherMaybeObserver other;
    public static final long serialVersionUID = 0xe1a4b77ffcdb68ef;

    public void MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver(p p0){
       super();
       this.actual = p0;
       this.other = new MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver$TakeUntilOtherMaybeObserver(this);
    }
    public void dispose(){
       DisposableHelper.dispose(this);
       DisposableHelper.dispose(this.other);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       DisposableHelper.dispose(this.other);
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.getAndSet(dISPOSED) != dISPOSED) {
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       DisposableHelper.dispose(this.other);
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.getAndSet(dISPOSED) != dISPOSED) {
          this.actual.onError(p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
    public void onSuccess(Object p0){
       DisposableHelper.dispose(this.other);
       DisposableHelper dISPOSED = DisposableHelper.DISPOSED;
       if (this.getAndSet(dISPOSED) != dISPOSED) {
          this.actual.onSuccess(p0);
       }
       return;
    }
    public void otherComplete(){
       if (DisposableHelper.dispose(this)) {
          this.actual.onComplete();
       }
       return;
    }
    public void otherError(Throwable p0){
       if (DisposableHelper.dispose(this)) {
          this.actual.onError(p0);
       }else {
          a.l(p0);
       }
       return;
    }
}
