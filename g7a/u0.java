package g7a.u0;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import gx5.d;
import com.kwai.framework.model.user.PhotoGuestConfig;

public final class u0	// class@0023fd
{
    public static final u0 a;

    static {
       u0.a = new u0();
    }
    public void u0(){
       super();
    }
    public static final boolean a(QPhoto p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(u0.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), null, u0.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "photo");
       if (!p0.shouldShowViewersPage() && (p1 || p2)) {
          b uob = d.a(-1188553266);
          a.o(uob, "PluginManager\n          ¡­eaturePlugin::class.java\)");
          PhotoGuestConfig photoGuestCo = uob.Hj();
          if (photoGuestCo != null && !photoGuestCo.a(p0.created())) {
             return true;
          }
       }
       return false;
    }
}
