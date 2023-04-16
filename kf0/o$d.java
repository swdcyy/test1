package kf0.o$d;
import ub.a;
import kf0.o;
import com.kuaishou.growth.pendant.ui.widget.PendantAnimImageView;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;

public final class o$d extends a	// class@002d19
{
    public final o b;
    public final PendantAnimImageView c;

    public void o$d(o p0,PendantAnimImageView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o$d.class, "1")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "throwable");
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskPendantAnimationHelper", "setImageUrl fail", false, 4, null);
       this.b.d(this.c);
       return;
    }
}
