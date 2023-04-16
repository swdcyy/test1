package elb.e0;
import java.lang.Runnable;
import com.yxcorp.gifshow.upload.UploadInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import xf6.g;
import xf6.l;
import tkd.b;
import tkd.d;
import f6c.c;
import dnc.v1;
import elb.d0;

public final class e0 implements Runnable	// class@002745
{
    public final UploadInfo b;

    public void e0(UploadInfo p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, e0.class, "1")) {
          return;
       }
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       Activity uActivity = uActivityCon.e();
       if (uActivity != null) {
          boolean b = false;
          if (g.o1() && l.c("key_disable_random_publish_dialog", b)) {
             b = true;
          }
          if (!b) {
             d.a(-1931765893).Ha(uActivity, this.b.mRandomCoinParams);
          label_0044 :
             return;
          }
       }
       d0.a(this.b);
       goto label_0044 ;
    }
}
