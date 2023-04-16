package gy2.f$b;
import fw8.b;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import gy2.f;
import java.util.Objects;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.WeakHashMap;

public final class f$b extends b	// class@002bc7
{

    public void f$b(){
       super();
    }
    public void onActivityDestroyed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "3")) {
          return;
       }
       String str = "activity";
       a.p(p0, str);
       f e = f.e;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidOneRefs(p0, e, f.class, "4")) {
          a.p(p0, str);
          b.Z(f.a, "removeDialogService for activity "+p0);
          f.b.remove(p0);
       }
       return;
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       f.e.b();
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$b.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       f.e.b();
       return;
    }
}
