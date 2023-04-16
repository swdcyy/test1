package g82.e;
import erd.g;
import g82.v;
import java.lang.Object;
import wca.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.fansgroup.b;
import com.kwai.framework.model.user.User;
import t02.a0;
import p91.m;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class e implements g	// class@002a9b
{
    public final v b;

    public void e(v p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       v v;
       e tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, v.class, "10")) {
       }else {
          v = tb.V;
          if (v != null) {
             v.b();
          }
          if (p0.c != null) {
             p0 = p0.a;
             if (p0 != null && TextUtils.n(p0.getId(), tb.p.Z2.d())) {
                tb.V8();
             }
          }
       }
    label_0036 :
       return;
    }
}
