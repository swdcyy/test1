package ff0.f;
import java.lang.Object;
import dg0.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.pendant.core.manager.f;
import ujc.e;
import kotlin.jvm.internal.a;
import wkd.b;
import yf0.b;
import hg0.b;
import hg0.a;
import tjc.c;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class f	// class@002313
{
    public static boolean a;
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final void onEventMainThread(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "5")) {
          return;
       }
       if (p0.a == 1) {
          p0 = p0.b;
          if (!p0 instanceof String) {
             p0 = null;
          }
          if (p0 != null) {
             f.a(p0, "task");
          }
       }
       return;
    }
    public final void onEventMainThread(e p0){
       b uob;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       a.p(p0, "event");
       if (p0.a == 4) {
          uob = b.a(0x686d9295).D();
          if (uob instanceof a) {
             uob.s(true);
          }
       }else if(b.a(-1608526086).S()){
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          if (!uActivityCon.e() instanceof GifshowActivity) {
             return;
          }else {
             uob = b.a(0x686d9295).D();
             if (uob instanceof a) {
                uob.s(false);
             }
          }
       }
       return;
    }
}
