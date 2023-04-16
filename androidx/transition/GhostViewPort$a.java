package androidx.transition.GhostViewPort$a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import androidx.transition.GhostViewPort;
import java.lang.Object;
import android.view.View;
import a2.i0;
import android.view.ViewGroup;

public class GhostViewPort$a implements ViewTreeObserver$OnPreDrawListener	// class@0009c2
{
    public final GhostViewPort b;

    public void GhostViewPort$a(GhostViewPort p0){
       this.b = p0;
       super();
    }
    public boolean onPreDraw(){
       i0.j0(this.b);
       GhostViewPort$a tb = this.b;
       GhostViewPort b = tb.b;
       if (b != null) {
          GhostViewPort c = tb.c;
          if (c != null) {
             b.endViewTransition(c);
             i0.j0(this.b.b);
             tb = this.b;
             tb.b = null;
             tb.c = null;
          }
       }
       return true;
    }
}
