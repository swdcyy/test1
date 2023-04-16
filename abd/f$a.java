package abd.f$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import abd.f;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import nfd.t0;
import android.view.View;
import nfd.o3;
import android.widget.LinearLayout;

public class f$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0000c3
{
    public final SelectShapeTextView b;
    public final f c;

    public void f$a(f p0,SelectShapeTextView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       int i = this.b.getWidth() + t0.i;
       f$a tc = this.c;
       tc.F = tc.F + i;
       tc = this.c;
       if (tc.E < tc.F || i < f.H) {
          o3.H(this.b, 8);
          this.c.y.removeView(this.b);
       }
       return;
    }
}
