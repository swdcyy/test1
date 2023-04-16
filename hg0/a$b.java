package hg0.a$b;
import erd.g;
import hg0.a;
import java.lang.Object;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import hg0.b;
import cg0.a;

public final class a$b implements g	// class@002691
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          a.p(p0, "response");
          a$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, a.class, "8")) {
             tb.h.e(p0, tb.g());
          }
       }
       return;
    }
}
