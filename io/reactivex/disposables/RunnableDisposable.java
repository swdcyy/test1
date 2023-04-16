package io.reactivex.disposables.RunnableDisposable;
import io.reactivex.disposables.ReferenceDisposable;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.concurrent.atomic.AtomicReference;

public final class RunnableDisposable extends ReferenceDisposable	// class@001819
{
    public static final long serialVersionUID = 0x8deda7d87411765f;

    public void RunnableDisposable(Runnable p0){
       super(p0);
    }
    public void onDisposed(Object p0){
       this.onDisposed(p0);
    }
    public void onDisposed(Runnable p0){
       p0.run();
    }
    public String toString(){
       return "RunnableDisposable\(disposed="+this.isDisposed()+", "+this.get()+"\)";
    }
}
