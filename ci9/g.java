package ci9.g;
import erd.g;
import ci9.l;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import gh9.d;
import com.yxcorp.gifshow.camera.record.base.b;
import android.app.Activity;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import oc9.d0;
import ed9.f;
import zb9.s;
import zb9.s$a;
import wc9.v;
import yh9.j;
import android.view.View;
import com.yxcorp.utility.n;
import android.widget.FrameLayout;

public final class g implements g	// class@0005f7
{
    public final l b;

    public void g(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       PanelShowEvent c;
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, l.class, "2")) {
       }else if(tb.d.d(d.c).a != null || (p0.b != tb.c || (!PanelShowEvent.a(tb.e, p0) || (p0.c == PanelShowEvent$PanelType.MORE_OPTION || !tb.f2())))){
          tb.r.c(p0);
          if (!p0.c() && !tb.d.d(s.d.a()).a()) {
             if (!p0.b()) {
                c = p0.c;
                if (c != PanelShowEvent$PanelType.MAGIC && c != PanelShowEvent$PanelType.MUSIC) {
                   c = 0;
                label_007e :
                   boolean b = tb.r.b(p0);
                   if (b || tb.d.d(v.e).b != null) {
                      if (c) {
                         tb.k2((b ^ 1));
                      }else {
                         n.W(tb.o, 4, 0);
                      }
                      b = tb.p;
                      if (b != null) {
                         b.setEnabled(false);
                      }
                   }else if(tb.a2() || tb.d.d(j.i).c != null){
                      if (c) {
                         tb.k2(1);
                      }else {
                         n.Y(tb.o, false, false);
                      }
                      b = tb.p;
                      if (b != null) {
                         b.setEnabled(1);
                      }
                   }
                }
             }
             c = 1;
             goto label_007e ;
          }
       }
    label_00d3 :
       return;
    }
}
