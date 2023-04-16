package cc0.c;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.growth.pendant.activity.view.ActivityBasePendantView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import kc0.a;
import com.kwai.feature.api.pendant.activity.model.ActivityPendantModel;
import ge0.c;
import com.kuaishou.growth.pendant.activity.view.ActivityTKPendantView;
import androidx.fragment.app.FragmentActivity;
import android.util.AttributeSet;
import nsd.u;
import com.kuaishou.growth.pendant.activity.view.ActivityNativePendantView;

public final class c	// class@000306
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final ActivityBasePendantView a(GifshowActivity p0,boolean p1){
       ActivityPendantModel obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "activity");
       obj = a.e.c();
       ActivityBasePendantView uActivityBas = null;
       if (obj != null) {
          int i = (!p1 && c.c(obj.getTkBundleId()))? 1: 0;
          boolean b = c.b(obj.getOnlyTk());
          if (i) {
             ActivityTKPendantView uActivityTKP = new ActivityTKPendantView(p0, null, 0, 6, null);
          }else if(!b){
             ActivityNativePendantView uActivityNat = new ActivityNativePendantView(p0, null, 0, 6, null);
          }
          uActivityBas = v6;
       }
       return uActivityBas;
    }
}
