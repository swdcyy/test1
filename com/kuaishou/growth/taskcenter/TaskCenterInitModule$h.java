package com.kuaishou.growth.taskcenter.TaskCenterInitModule$h;
import erd.g;
import com.kuaishou.growth.taskcenter.TaskCenterInitModule;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k2b.e0;
import java.lang.CharSequence;
import zsd.u;
import ig0.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import wkd.b;
import fg0.l;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;

public final class TaskCenterInitModule$h implements g	// class@00072e
{
    public final TaskCenterInitModule b;
    public final boolean c;

    public void TaskCenterInitModule$h(TaskCenterInitModule p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskCenterInitModule$h.class, "1")) {
       }else if(this.c != null){
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, TaskCenterInitModule.class, "12")) {
             TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TaskCenterInitModule", "tryRestoreTask", false, 4, null);
             p0 = ActivityContext.g();
             a.o(p0, "ActivityContext.getInstance\(\)");
             p0 = p0.e();
             if (p0 != null) {
                c uoc = 1;
                Activity uActivity = (p0 instanceof GifshowActivity && !p0.isFinishing())? 1: null;
                if (!uActivity) {
                   p0 = null;
                }
                if (p0 != null) {
                   uActivity = p0;
                   int page = uActivity.getPage();
                   String str = uActivity.o();
                   if (str != null && !u.S1(str)) {
                      uoc = null;
                   }
                   if (uoc) {
                      ClientEvent$UrlPackage urlPackage = c.a.a(p0);
                      if (urlPackage != null) {
                         page = urlPackage.page;
                         str = urlPackage.page2;
                      }
                   }
                   b.a(-1524711258).C(p0, page, str, null);
                }
             }
          }
       }
       return;
    }
}
