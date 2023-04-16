package io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver$TakeUntilOtherMaybeObserver;
import brd.p;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver;
import java.lang.Throwable;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;

public final class MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver$TakeUntilOtherMaybeObserver extends AtomicReference implements p	// class@0012ab
{
    public final MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver parent;
    public static final long serialVersionUID = 0xee6e1e214f1c3d15;

    public void MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver$TakeUntilOtherMaybeObserver(MaybeTakeUntilMaybe$TakeUntilMainMaybeObserver p0){
       super();
       this.parent = p0;
    }
    public void onComplete(){
       this.parent.otherComplete();
    }
    public void onError(Throwable p0){
       this.parent.otherError(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
    public void onSuccess(Object p0){
       this.parent.otherComplete();
    }
}
