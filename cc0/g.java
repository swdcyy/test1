package cc0.g;
import erd.g;
import java.lang.ref.WeakReference;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.growth.pendant.activity.view.ActivityNativePendantView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hc0.a;
import java.lang.Throwable;
import android.app.Activity;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.growth.pendant.core.common.PendantView;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import wkd.b;
import ic0.a;
import com.kuaishou.growth.pendant.activity.ActivityPendantViewManager;
import java.util.Map;
import kc0.a;
import com.kuaishou.growth.pendant.activity.model.PendantCommonModel;
import hc0.b;
import rt5.a$d;
import rt5.a;

public final class g implements g	// class@00030c
{
    public final WeakReference b;
    public final WeakReference c;
    public final String d;

    public void g(WeakReference p0,WeakReference p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       b a;
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          int i = 2;
          Throwable throwable = null;
          if (p0 == null) {
             a.b(a.a, "创建挂件失败", throwable, i, throwable);
          }else {
             Activity uActivity = this.b.get();
             if (uActivity != null) {
                a.o(uActivity, "activityWeakRef.get\(\) ?: return@subscribe");
                if (!uActivity.isFinishing()) {
                   ViewGroup viewGroup = this.c.get();
                   if (viewGroup != null) {
                      a.o(viewGroup, "rootViewWeakRef.get\(\) ?: return@subscribe");
                      p0.h(uActivity);
                      viewGroup.addView(p0, new FrameLayout$LayoutParams(-2, -2));
                      b.a(-2027525687).a(uActivity, p0);
                      a.b(a.a, "创建挂件完成", throwable, i, throwable);
                      ActivityPendantViewManager.a(ActivityPendantViewManager.e).put(uActivity, p0);
                      p0 = a.e.b(this.d);
                      a = b.a;
                      g td = this.d;
                      b = true;
                      boolean b1 = (p0.getStatus() == b)? true: false;
                      a$d b2 = a$d.b;
                      if (p0.getLastX() > 0) {
                         b = false;
                      }
                      a.e(td, b1, b2, b, (float)p0.getLastY());
                   }
                }
             }
          }
       }
       return;
    }
}
