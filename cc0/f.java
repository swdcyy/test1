package cc0.f;
import java.util.concurrent.Callable;
import java.lang.ref.WeakReference;
import java.lang.String;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.pendant.activity.view.ActivityNativePendantView;
import com.kuaishou.growth.pendant.activity.ActivityPendantViewManager;
import java.util.Objects;
import java.lang.Boolean;
import android.view.View;
import hc0.a;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import rkd.b;
import hka.b;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import cc0.e;
import java.lang.Runnable;
import cc0.c;
import com.kuaishou.growth.pendant.activity.view.ActivityBasePendantView;
import android.widget.FrameLayout;

public final class f implements Callable	// class@00030b
{
    public final WeakReference b;
    public final WeakReference c;
    public final String d;
    public final boolean e;

    public void f(WeakReference p0,WeakReference p1,String p2,boolean p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public Object call(){
       View view;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, this, f.class, "1");
       if (objArray1 != patchProxyRe) {
       }else {
          ActivityPendantViewManager e = ActivityPendantViewManager.e;
          f tb = this.b;
          f tc = this.c;
          f td = this.d;
          f te = this.e;
          Objects.requireNonNull(e);
          if (PatchProxy.isSupport(ActivityPendantViewManager.class)) {
             Object[] obj = PatchProxy.applyFourRefs(tb, tc, td, Boolean.valueOf(te), e, ActivityPendantViewManager.class, "15");
             if (obj != patchProxyRe) {
                objArray = obj;
             }else {
             label_003d :
                a a = a.a;
                a.b(a, "尝试创建挂件, fromTkError="+te, objArray, 2, objArray);
                obj = tb.get();
                if (!obj instanceof GifshowActivity) {
                   obj = objArray;
                }
                if (obj != null && !obj.isFinishing()) {
                   if (b.g()) {
                      obj.i3(ActivityPendantViewManager.c);
                   }
                   ViewGroup viewGroup = tc.get();
                   if (viewGroup != null) {
                      a.o(viewGroup, "rootViewWeakRef.get\(\) ?: return null");
                      view = viewGroup.findViewById(R.id.ks_activity_pendant);
                      if (view != null) {
                         b = (view.getTag(0x7f0a160c) == null)? true: false;
                         if (!TextUtils.x(td) && (a.g(td, view.getTag()) && b)) {
                            view.post(new e(view));
                            a.b(a, "当前正在展示挂件，不创建新挂件", objArray, 2, objArray);
                            objArray = view;
                         }else {
                            a.b(a, "正在展示的挂件是否要被移除:"+b, objArray, 2, objArray);
                            if (b) {
                               e.f(obj, "addEntrancePendant");
                            }
                         }
                      }
                      e.d(obj);
                      if (ActivityPendantViewManager.d) {
                         ActivityPendantViewManager.d = false;
                         e.b(td, obj);
                      }
                      ActivityBasePendantView uActivityBas = c.a.a(obj, te);
                      if (uActivityBas != null) {
                         uActivityBas.setId(R.id.ks_activity_pendant);
                         uActivityBas.setTag(td);
                         objArray = uActivityBas;
                      }
                   }
                }
             }
          }else {
             goto label_003d ;
          }
          Objects.requireNonNull(objArray, "null cannot be cast to non-null type com.kuaishou.growth.pendant.activity.view.ActivityNativePendantView");
          objArray1 = objArray;
       }
       return objArray1;
    }
}
