package kf0.q;
import java.lang.Runnable;
import kf0.o;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import wkd.b;
import yf0.b;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import tkd.b;
import tkd.d;
import pt5.a;

public final class q implements Runnable	// class@002d1c
{
    public final o b;

    public void q(o p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskPendantAnimationHelper", "do disappear", false, 4, null);
       b.a(0x686d9295).e2(this.b.p);
       d.a(0x60b9226c).lR("ÈÎÎñ½áÊø");
       return;
    }
}
