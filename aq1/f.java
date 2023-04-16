package aq1.f;
import com.yxcorp.gifshow.widget.m;
import aq1.g;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import yp1.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import zp1.c;
import zp1.l;
import yp1.a;
import java.util.Objects;
import com.kwai.framework.model.user.UserInfo;
import zp1.i;

public final class f extends m	// class@000283
{
    public final g c;

    public void f(g p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       f tc = this.c;
       g i = tc.I;
       e0 uoe0 = tc.J.d();
       ClientContent$LiveStreamPackage liveStreamPa = this.c.J.f();
       boolean b = this.c.z3();
       String str = this.c.h3();
       tc = this.c;
       boolean b1 = (!tc.J.i(tc.I) && this.c.L.c())? true: false;
       a.c(i, uoe0, liveStreamPa, false, b, str, "2", b1);
       tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, g.class, "9")) {
          UserInfo userInfo = tc.J.c(tc.I);
          if (userInfo != null) {
             tc.K.v(userInfo);
          }
       }
       return;
    }
}
