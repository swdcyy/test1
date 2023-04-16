package m49.c$a;
import fw8.b;
import m49.c;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import m49.a;
import yx.j0;
import m49.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import m49.a$b;
import zq8.a;
import o56.a;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;

public final class c$a extends b	// class@002df3
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void onActivityResumed(Activity p0){
       Object[] objArray;
       b a;
       c b;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       int i = 0;
       if (a.g(p0, this.b.b.b())) {
          objArray = new Object[i];
          j0.a("AdStoragePermission", "page is resume", objArray);
          a = b.a;
          b = this.b.b;
          Objects.requireNonNull(a);
          a = PatchProxy.applyOneRefs(b, a, b.class, "5");
          boolean b1 = (a != PatchProxyResult.class)? a.booleanValue(): PermissionUtils.a(b.b(), "android.permission.WRITE_EXTERNAL_STORAGE");
          if (b1) {
             a$b uob = this.b.b.d();
             if (uob != null) {
                uob.a(this.b.b, new a("android.permission.WRITE_EXTERNAL_STORAGE", true));
             }
          }
       }
    label_0067 :
       objArray = new Object[i];
       j0.a("AdStoragePermission", "remove current lifecycle callback", objArray);
       a.B.unregisterActivityLifecycleCallbacks(this);
       return;
    }
}
