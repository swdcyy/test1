package io.reactivex.disposables.ActionDisposable;
import io.reactivex.disposables.ReferenceDisposable;
import erd.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.RuntimeException;
import io.reactivex.internal.util.ExceptionHelper;

public final class ActionDisposable extends ReferenceDisposable	// class@001198
{
    public static final long serialVersionUID = 0x8deda7d87411765f;

    public void ActionDisposable(a p0){
       super(p0);
    }
    public void onDisposed(a p0){
       p0.run();
    }
    public void onDisposed(Object p0){
       this.onDisposed(p0);
    }
}
