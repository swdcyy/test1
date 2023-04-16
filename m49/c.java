package m49.c;
import u07.u;
import m49.a;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import m49.b;
import android.app.Activity;
import com.yxcorp.gifshow.util.PermissionUtils;
import o56.a;
import m49.c$a;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;

public final class c implements u	// class@002df4
{
    public final a b;

    public void c(a p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "<anonymous parameter 1>");
       b.a.b(this.b, false);
       PermissionUtils.s(this.b.b());
       a.B.registerActivityLifecycleCallbacks(new c$a(this));
       return;
    }
}
