package kf0.b;
import u07.u;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import gf0.a;

public final class b implements u	// class@002d05
{
    public final TaskCommonParams b;

    public void b(TaskCommonParams p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "<anonymous parameter 1>");
       a.a.c(this.b.getMActivityId(), this.b.getMTaskTypeId(), "È¡Ïû");
       return;
    }
}
