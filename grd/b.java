package grd.b;
import brd.y;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.f;

public abstract class b implements y	// class@000f5c
{
    public b b;

    public void b(){
       super();
    }
    public final void onSubscribe(b p0){
       b tb = this.b;
       Class class = this.getClass();
       a.c(p0, "next is null");
       if (tb != null) {
          p0.dispose();
          if (tb != DisposableHelper.DISPOSED) {
             f.a(class);
          }
          tb = 0;
       }else {
          tb = 1;
       }
       if (tb) {
          this.b = p0;
       }
       return;
    }
}
