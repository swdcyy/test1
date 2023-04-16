package d5c.v0$a;
import erd.g;
import d5c.v0;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import z5c.d3;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import xh7.b;
import d5c.u0;
import qh7.b;
import qh7.a;

public final class v0$a implements g	// class@002113
{
    public final v0 b;
    public final Ref$ObjectRef c;

    public void v0$a(v0 p0,Ref$ObjectRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v0$a.class, "1")) {
       }else {
          v0$a tb = this.b;
          if (tb.s == null) {
             v0 r = tb.r;
             if (r == null) {
                a.S("mUser");
             }
             if (!d3.d(r, p0)) {
                p0 = this.b;
                p0.s = true;
                p0 = p0.getActivity();
                if (p0 != null) {
                   a.b(b.j(p0, this.c.element), new u0(this));
                }
             }
          }
       }
       return;
    }
}
