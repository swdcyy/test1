package kf0.o$c;
import com.kuaishou.growth.pendant.ui.widget.PendantAnimImageView$a;
import kf0.o;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.pendant.ui.widget.PendantAnimImageView;
import java.util.Objects;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import kf0.r;
import kf0.p;
import java.lang.Runnable;
import ekd.k1;

public final class o$c implements PendantAnimImageView$a	// class@002d18
{
    public final o a;
    public final List b;

    public void o$c(o p0,List p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationEnd(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o$c.class, "1")) {
          return;
       }
       this.a.o.setCallback(objArray);
       o$c ta = this.a;
       o$c tb = this.b;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(tb, ta, o.class, "7")) {
          TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskPendantAnimationHelper", "postPlayNextAnimation", false, 4, null);
          if (!r.a.b()) {
             ta.c();
             p op = new p(ta, tb);
             ta.i = op;
             k1.r(op, ta.n);
          }
       }
       return;
    }
}
