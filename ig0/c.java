package ig0.c;
import java.lang.Object;
import android.app.Activity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import k2b.b;
import k2b.u1;
import com.yxcorp.gifshow.log.b;
import com.kwai.framework.activitycontext.ActivityContext;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class c	// class@0028c3
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final ClientEvent$UrlPackage a(Activity p0){
       b obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "activity");
       obj = u1.h();
       if (obj != null) {
          b uob = obj.d(p0);
          if (uob != null) {
             return uob.C();
          }
       }
       return null;
    }
    public final ClientEvent$UrlPackage b(){
       ActivityContext obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = ActivityContext.g();
       a.o(obj, "ActivityContext.getInstance\(\)");
       Activity uActivity = obj.e();
       if (uActivity instanceof GifshowActivity && !uActivity.isFinishing()) {
          return this.a(uActivity);
       }
       return null;
    }
    public final String c(){
       Object[] objArray = null;
       ClientEvent$UrlPackage obj = PatchProxy.apply(objArray, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b();
       if (obj != null) {
          objArray = obj.page2;
       }
       return objArray;
    }
}
