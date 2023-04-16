package m02.h;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.e;
import java.lang.Object;
import android.app.Activity;
import com.kuaishou.live.core.basic.activity.e$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import n66.c;

public final class h implements Runnable	// class@0030bf
{
    public final e b;

    public void h(e p0){
       this.b = p0;
    }
    public final void run(){
       h tb = this.b;
       if (tb.b.getActivity() != null) {
          Activity activity = tb.b.getActivity();
          if (!PatchProxy.applyVoidOneRefs(activity, tb, e.class, "22")) {
             FpsMonitor.stopSection("LivePlayFragment_SLIDE_STATE", activity);
             tb.d("LivePlayFragment_SLIDE_STATE");
             c.c("LivePlayFragment_SLIDE_STATE");
          }
       }
       return;
    }
}
