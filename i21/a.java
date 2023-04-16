package i21.a;
import hka.b;
import i21.c;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import android.app.Activity;
import d61.y;
import f61.b;
import fe3.a;

public final class a implements b	// class@002809
{
    public final c a;

    public void a(c p0){
       this.a = p0;
       super();
    }
    public final void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (!a.t().u("SOURCE_LIVE").d("enableChangeOrientationWhenPkStart", true)) {
          return;
       }
       if (y.d(this.a.k)) {
          return;
       }
       c e = this.a.e;
       if (e != null) {
          if (b.b()) {
             this.a.e(e);
          }else {
             this.a.b(e);
          }
       }
       return;
    }
}
