package be0.a;
import sf0.d;
import be0.a$a;
import nsd.u;
import com.kuaishou.growth.pendant.coin.task.widget.SectionPendantV2;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.model.TaskParamsV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import mf0.b;
import java.lang.StringBuilder;
import ld0.c;
import java.util.Objects;
import dd0.k;
import ld0.d;
import yd0.f;

public final class a implements d	// class@00034f
{
    public final SectionPendantV2 a;
    public static final a$a b;

    static {
       a.b = new a$a(null);
    }
    public void a(SectionPendantV2 p0){
       a.p(p0, "pendant");
       super();
       this.a = p0;
    }
    public void a(TaskParamsV2 p0){
       a ta;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "taskParamsV2");
       boolean b = a.g(b.g(this.a.getMParams()), b.g(p0));
       StringBuilder str = null;
       boolean b1 = (this.a.getMParams().getMWidgetStatus() != p0.getMWidgetStatus())? true: false;
       boolean b2 = b.m(p0);
       String str1 = "PendantDataUpdateDelegate";
       c.d(str1, "sameDataSource="+b+",isDiffChanged="+b1+",needActive="+b2);
       if (b && (b2 && b1)) {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, SectionPendantV2.class, "26")) {
             SectionPendantV2.A(ta, str, true, null);
             ta.w();
          }
       }
       b2 = b.l(p0);
       c.d(str1, "pendantHasClosed="+b2);
       if (b2 && b1) {
          d.c().g5();
       }
       c.d(str1, "newStatus="+p0.getMWidgetStatus());
       b2 = b.j(p0);
       if (b && (b2 && b1)) {
          this.a.C(3);
       }
    label_00cd :
       b2 = b.o(p0);
       if (b && (b2 && b1)) {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, SectionPendantV2.class, "28")) {
             c.c("switchPendantToUnDoubleStatus isTaskComplete="+ta.B());
             if (!ta.B()) {
                ta.z(true);
             }
          }
       }
       boolean b3 = b.k(p0);
       if (b && (b3 && b1)) {
          a ta1 = this.a;
          Objects.requireNonNull(ta1);
          if (!PatchProxy.applyVoid(null, ta1, SectionPendantV2.class, "29")) {
             f.i(ta1);
             f.h(ta1);
          }
       }
       return;
    }
}
