package b96.b;
import z1.a;
import b96.d;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import java.lang.CharSequence;
import e17.i;
import java.lang.StringBuilder;

public final class b implements a	// class@000443
{
    public final d a;

    public void b(d p0){
       this.a = p0;
    }
    public final void accept(Object p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidOneRefs(p0, ta, d.class, "6")) {
       }else {
          a.b(b.j(ActivityContext.g().e(), p0), null);
          i.d(R.style.arg_RES_7f11066a, "KDS打开Uri成功");
       }
       return;
    }
}
