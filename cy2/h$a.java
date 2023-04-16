package cy2.h$a;
import java.lang.Object;
import nsd.u;
import u71.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import com.kuaishou.live.basic.model.CheckResolutionResponse;
import ca7.o;
import android.os.Build;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import u71.d;
import cy2.h$a$a;
import qrd.r0;

public final class h$a	// class@002404
{

    public void h$a(){
       super();
    }
    public void h$a(u p0){
       super();
    }
    public final c a(boolean p0){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b(p0).getSecond();
    }
    public final Pair b(boolean p0){
       CheckResolutionResponse obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "2");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = new CheckResolutionResponse();
       String obj1 = PatchProxy.apply(null, this, uoa, "3");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          obj1 = null;
          if (!o.d()) {
             b = false;
          }else {
             String mODEL = Build.MODEL;
             String str = "Build.MODEL";
             a.o(mODEL, str);
             Objects.requireNonNull(mODEL, "null cannot be cast to non-null type java.lang.String");
             String str1 = mODEL.toLowerCase();
             a.o(str1, "\(this as java.lang.String\).toLowerCase\(\)");
             if (!StringsKt__StringsKt.O2(str1, "a77", obj1, 2, null)) {
                a.o(mODEL, str);
                str1 = mODEL.toLowerCase();
                a.o(str1, "\(this as java.lang.String\).toLowerCase\(\)");
                if (!StringsKt__StringsKt.O2(str1, "r9s", obj1, 2, null)) {
                   a.o(mODEL, str);
                   mODEL = mODEL.toLowerCase();
                   a.o(mODEL, "\(this as java.lang.String\).toLowerCase\(\)");
                   b = StringsKt__StringsKt.O2(mODEL, "r7plust", obj1, 2, null);
                }
             }
             b = true;
          }
       }
       d uod = (b)? d.a("320x180"): d.a("640x360");
       a.o(uod, "if \(inDaenerysBlackList\(¡­on.VIDEO_RESOLUTION_360P\)");
       return r0.a(obj, new h$a$a(p0, obj, uod));
    }
}
