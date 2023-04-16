package c12.b;
import java.lang.Object;
import java.util.List;
import xs5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import za2.y;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import com.kuaishou.live.core.basic.utils.e;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import c12.a;

public class b	// class@00049a
{

    public void b(){
       super();
    }
    public static void a(List p0,a p1){
       boolean b;
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, b.class, "1")) {
          return;
       }
       Object obj1 = PatchProxy.applyOneRefs(p1, obj, y.class, "3");
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else if(p1.g != null && (e.r(p1.a) && p1.n.mHasShownLiveSlideGuide == null)){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          p0.add(a.a);
       }
       return;
    }
}
