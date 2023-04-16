package be0.c;
import sf0.a;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import com.kuaishou.growth.pendant.model.TaskParamsV2;
import java.util.Objects;
import zd0.a;
import rd0.a;
import brd.t;
import rd0.c;
import com.kuaishou.growth.pendant.ui.widget.PendantAnimImageView;
import java.lang.Runnable;
import rd0.d;
import erd.g;
import crd.b;

public final class c implements a	// class@000351
{
    public final SectionPendantV2 a;

    public void c(SectionPendantV2 p0){
       a.p(p0, "sectionPendantV2");
       super();
       this.a = p0;
    }
    public void a(boolean p0){
       a a;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (p0) {
          int i = 1;
          this.a.getMParams().setMWidgetStatus(i);
          c ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, SectionPendantV2.class, "25")) {
             SectionPendantV2 x = ta.x;
             if (x != null) {
                a uoa = new a(ta);
                if (!PatchProxy.applyVoidOneRefs(uoa, x, a.class, "5")) {
                   a.p(uoa, "runnable");
                   a h = x.h;
                   if (h != null) {
                      a = x.a;
                      if (a != null && a.length()) {
                         i = 0;
                      }
                      if (i) {
                         uoa.run();
                      }else {
                         x.d(x.a, "inactive").subscribe(new c(h, x, uoa), new d(x, uoa));
                      }
                   }
                }
             }
             ta.G();
          }
       }
       return;
    }
}
