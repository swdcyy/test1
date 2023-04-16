package ou1.g$e;
import z0.a;
import ou1.g;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ut1.f;
import java.util.Objects;
import java.lang.Number;
import java.lang.Boolean;
import java.util.Map;
import ut1.k;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;

public final class g$e implements a	// class@003597
{
    public final g a;

    public void g$e(g p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       boolean i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g$e obj = PatchProxy.applyOneRefs(p0, this, g$e.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       g og = g.class;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, og, "1");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          Object obj2 = PatchProxy.applyOneRefs(p0, obj, og, "2");
          if (obj2 != patchProxyRe) {
             i = obj2.booleanValue();
          }else {
             k ok = p0.l().get(obj.g);
             if (ok != null && !ok.g()) {
                i = false;
             }else {
                p0 = p0.l().get(obj.g);
                if (p0 != null) {
                   p0 = p0.a();
                   if (p0 != null) {
                   label_0063 :
                      i = TextUtils.equals(p0, "1");
                   }
                }
                p0 = "";
                goto label_0063 ;
             }
          }
          if (i) {
             i = 0x7f1025c0;
          }else {
             i = 0x7f1025c2;
          }
       }
       return Integer.valueOf(i);
    }
}
