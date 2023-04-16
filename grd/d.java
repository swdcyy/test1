package grd.d;
import brd.d0;
import crd.b;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Class;
import io.reactivex.internal.util.f;

public abstract class d implements d0, b	// class@000f5e
{
    public final AtomicReference b;

    public void d(){
       super();
       this.b = new AtomicReference();
    }
    public void a(){
    }
    public final void dispose(){
       DisposableHelper.dispose(this.b);
    }
    public final boolean isDisposed(){
       boolean b = (this.b.get() == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public final void onSubscribe(b p0){
       if (f.b(this.b, p0, this.getClass())) {
          this.a();
       }
       return;
    }
}
