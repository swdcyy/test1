package ff0.e;
import android.content.ComponentCallbacks;
import java.lang.Object;
import android.content.res.Configuration;
import ff0.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import rkd.b;
import tkd.b;
import tkd.d;
import yt5.j;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;

public final class e implements ComponentCallbacks	// class@002312
{

    public void e(){
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       f b;
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "newConfig");
       p0 = p0.orientation;
       if (p0 == 2) {
          b = f.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(null, b, uof, "2")) {
             f.a = true;
             if (b.g()) {
                d.a(-1573231572).Fb();
             }else {
                ActivityContext uActivityCon = ActivityContext.g();
                a.o(uActivityCon, "ActivityContext.getInstance\(\)");
                d.a(-1573231572).OK(uActivityCon.e());
             }
          }
       }else if(p0 == true){
          b = f.b;
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoid(null, b, uof, "3") && f.a) {
             d.a(-1573231572).Fb();
             f.a = false;
          }
       }
       return;
    }
    public void onLowMemory(){
    }
}
