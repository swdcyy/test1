package awb.f;
import bwb.c$a;
import awb.i;
import android.graphics.Bitmap;
import java.lang.Object;
import java.util.Objects;
import com.yxcorp.gifshow.panel.sizer.view.SizerSlideView;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;

public final class f implements c$a	// class@000345
{
    public final i a;
    public final Bitmap b;

    public void f(i p0,Bitmap p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(Bitmap p0){
       f ta = this.a;
       f tb = this.b;
       Objects.requireNonNull(ta);
       if (p0 != null) {
          i t = ta.t;
          Objects.requireNonNull(t);
          if (!PatchProxy.applyVoidTwoRefs(tb, p0, t, SizerSlideView.class, "20") && tb != null) {
             t.j = tb;
             t.p = p0;
             t.invalidate();
          }
       }
       return;
    }
}
