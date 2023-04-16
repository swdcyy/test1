package bsa.b$f;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import bsa.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import wra.b;

public final class b$f implements SlidingPaneLayout$d	// class@000456
{
    public final b a;

    public void b$f(b p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$f.class, "3")) {
          return;
       }
       a.p(p0, "panel");
       return;
    }
    public void b(View p0,float p1){
       if (PatchProxy.isSupport(b$f.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, b$f.class, "1")) {
          return;
       }
       a.p(p0, "panel");
       b r = this.a.r;
       if (r == null) {
          a.S("mHomeBlockViewState");
       }
       if (r.d()) {
          this.a.X8();
       }
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$f.class, "2")) {
          return;
       }
       a.p(p0, "panel");
       return;
    }
}
