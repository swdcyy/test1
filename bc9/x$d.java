package bc9.x$d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import bc9.x;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bc9.g;
import android.view.ViewTreeObserver;

public final class x$d implements ViewTreeObserver$OnGlobalLayoutListener	// class@00040c
{
    public final x b;
    public final View c;
    public final View d;

    public void x$d(x p0,View p1,View p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, x$d.class, "1")) {
          return;
       }
       x$d tc = this.c;
       if (tc != null) {
          this.b.C = tc.getBottom() - (this.c.getHeight() - this.d.getBottom());
          tc = this.b;
          x v = tc.v;
          if (v != null) {
             v.J(tc.C, tc.D);
          }
       }
       ViewTreeObserver viewTreeObse = this.d.getViewTreeObserver();
       if (viewTreeObse != null) {
          viewTreeObse.removeOnGlobalLayoutListener(this);
       }
       return;
    }
}
