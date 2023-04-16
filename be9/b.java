package be9.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.log.a;
import android.content.Intent;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import ekd.j0;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$TaskDetailPackage;
import com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$ClickEntryPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import q2b.h$b;
import k2b.u1;

public final class b implements Runnable	// class@000477
{
    public final a b;
    public final Intent c;

    public void b(a p0,Intent p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       long l = 0;
       long l1 = j0.c(this.c, "start_activity_time", l);
       if (l1 - l > 0) {
          a o = tb.o;
          if (o - l1 > 0) {
             long l2 = o - l1;
             Object[] objArray = new Object[0];
             a.D().w("cameracost", "CameraPrepareOpenTime "+l2, objArray);
             CameraLogger uCameraLogge = CameraLogger.class;
             if (!PatchProxy.isSupport(uCameraLogge) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l2), null, uCameraLogge, "35")) {
                ClientTaskDetail$TaskDetailPackage taskDetailPa = new ClientTaskDetail$TaskDetailPackage();
                ClientTaskDetail$ClickEntryPackage uClickEntryP = new ClientTaskDetail$ClickEntryPackage();
                uClickEntryP.clickType = 1;
                taskDetailPa.clickEntryPackage = uClickEntryP;
                ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
                resultPackag.timeCost = l2;
                h$b uob = h$b.d(7, 429);
                uob.s(taskDetailPa);
                uob.q(resultPackag);
                u1.r0(uob);
             }
          }
       }
       return;
    }
}
