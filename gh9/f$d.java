package gh9.f$d;
import erd.g;
import gh9.f;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import ed9.f;
import wc9.v;
import com.yxcorp.gifshow.camera.record.base.b;
import yh9.j;
import android.widget.FrameLayout;

public final class f$d implements g	// class@002497
{
    public final f b;

    public void f$d(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$d.class, "1")) {
       }else {
          a.p(p0, "event");
          f$d tb = this.b;
          Objects.requireNonNull(tb);
          if (PatchProxy.applyVoidOneRefs(p0, tb, f.class, "3") || (tb.i2() && (tb.o != null && (p0.b == tb.c && (PanelShowEvent.a(tb.e, p0) && p0.c != PanelShowEvent$PanelType.MORE_OPTION))))) {
             tb.q.c(p0);
             if (!p0.c()) {
                int i = (p0.b() || p0.c == PanelShowEvent$PanelType.MAGIC)? 1: 0;
                boolean b = tb.q.b(p0);
                if (b || tb.d.d(v.e).b != null) {
                   if (i) {
                      tb.l2((b ^ 1));
                   }else {
                      tb.k2(false, false);
                   }
                   b = tb.p;
                   if (b != null) {
                      b.setEnabled(false);
                   }
                }else if(tb.a2() || tb.d.d(j.i).c != null){
                   if (i) {
                      tb.l2(1);
                   }else {
                      tb.k2(1, false);
                   }
                   b = tb.p;
                   if (b != null) {
                      b.setEnabled(1);
                   }
                }
             }
          }
       }
    label_00b6 :
       return;
    }
}
