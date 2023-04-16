package i6a.r$h;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import i6a.r;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;

public final class r$h implements SlidingPaneLayout$d	// class@0027b3
{
    public final r a;

    public void r$h(r p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, r$h.class, "3")) {
          return;
       }
       a.p(p0, "panel");
       PatchProxy.onMethodExit(r$h.class, "3");
       return;
    }
    public void b(View p0,float p1){
       if (PatchProxy.isSupport2(r$h.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(p0, Float.valueOf(p1), this, r$h.class, "1")) {
          return;
       }
       a.p(p0, "panel");
       PatchProxy.onMethodExit(r$h.class, "1");
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, r$h.class, "2")) {
          return;
       }
       a.p(p0, "panel");
       this.a.V8();
       PatchProxy.onMethodExit(r$h.class, "2");
       return;
    }
}
