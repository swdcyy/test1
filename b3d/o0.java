package b3d.o0;
import java.lang.Object;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.model.user.QCurrentUser;
import oe6.e;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import erd.o;
import com.yxcorp.login.util.r;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class o0	// class@0002ba
{

    public void o0(){
       super();
    }
    public static void a(RequestTiming p0){
       o0 oo0 = o0.class;
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, oo0, "2")) {
          return;
       }
       if (!a.t().d("enablePUid", false)) {
          if (!PatchProxy.applyVoid(obj, obj, oo0, "3")) {
             QCurrentUser.me().setPreUserId("");
             e.z0(0);
          }
          return;
       }else if(p0 == RequestTiming.LOGOUT){
          QCurrentUser.me().setPreUserId("");
       }
       b.a(0x5cfaafff).U().map(new e()).subscribe(r.b, Functions.d());
       return;
    }
}
