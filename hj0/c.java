package hj0.c;
import java.lang.Object;
import com.kuaishou.krn.instance.JsFramework;
import gu6.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.kxb.KxbManager;
import com.kwai.kxb.PlatformType;
import hj0.b;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;

public final class c	// class@0026eb
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final b a(JsFramework p0){
       PlatformType kDS_VUE;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoc, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "jsFramework");
       KxbManager g = KxbManager.g;
       PlatformType platformType = PatchProxy.applyOneRefs(p0, this, uoc, "3");
       if (platformType != patchProxyRe) {
       }else {
          a.p(p0, "jsFramework");
          int i = b.a[p0.ordinal()];
          if (i != 1) {
             if (i == 2) {
                kDS_VUE = PlatformType.KDS_VUE;
             }else {
                throw new NoWhenBranchMatchedException();
             }
          }else {
             kDS_VUE = PlatformType.KDS_REACT;
          }
          platformType = kDS_VUE;
       }
       return g.f(platformType);
    }
}
