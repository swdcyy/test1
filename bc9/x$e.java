package bc9.x$e;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import bc9.x;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bc9.g;
import android.view.ViewTreeObserver;

public final class x$e implements ViewTreeObserver$OnGlobalLayoutListener	// class@00040d
{
    public final x b;
    public final View c;

    public void x$e(x p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, x$e.class, "1")) {
          return;
       }
       x$e tb = this.b;
       this.b.D = this.c.getTop() - tb.p;
       x v = tb.v;
       if (v != null) {
          v.J(tb.C, tb.D);
       }
       ViewTreeObserver viewTreeObse = this.c.getViewTreeObserver();
       if (viewTreeObse != null) {
          viewTreeObse.removeOnGlobalLayoutListener(this);
       }
       return;
    }
}
