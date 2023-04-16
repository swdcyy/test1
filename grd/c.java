package grd.c;
import brd.y;
import crd.b;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Class;
import io.reactivex.internal.util.f;

public abstract class c implements y, b	// class@000f5d
{
    public final AtomicReference s;

    public void c(){
       super();
       this.s = new AtomicReference();
    }
    public final void dispose(){
       DisposableHelper.dispose(this.s);
    }
    public final boolean isDisposed(){
       boolean b = (this.s.get() == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public void onStart(){
    }
    public final void onSubscribe(b p0){
       if (f.b(this.s, p0, this.getClass())) {
          this.onStart();
       }
       return;
    }
}
