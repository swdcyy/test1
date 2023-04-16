package kf0.a;
import u07.u;
import android.view.View;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Object;
import u07.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import gf0.a;
import wkd.b;
import yf0.b;
import tkd.b;
import tkd.d;
import pt5.a;

public final class a implements u	// class@002d04
{
    public final View b;
    public final TaskCommonParams c;

    public void a(View p0,TaskCommonParams p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "<anonymous parameter 1>");
       this.b.setVisibility(8);
       a.a.c(this.c.getMActivityId(), this.c.getMTaskTypeId(), "确定");
       b.a(0x686d9295).e2(this.c);
       d.a(0x60b9226c).lR("tk任务挂件手动关闭");
       return;
    }
}
