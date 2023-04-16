package ca9.b;
import lnc.t;
import java.lang.String;
import jd6.g;
import java.lang.Class;
import ca9.a;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.c4;
import lnc.s;
import wkd.b;
import lnc.t6;
import lnc.r;

public final class b extends t	// class@000501
{
    public static final b e;

    static {
       b.e = new b();
    }
    public void b(){
       String str = "post";
       if (g.d(str)) {
       }else {
          str = "live_avatar";
       }
       super(str);
       return;
    }
    public static final a r(Class p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       a uoa = b.e.t(p0);
       if (uoa != null) {
          p1 = uoa;
       }
       return p1;
    }
    public static final a0 s(Class p0,LoadPolicy p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       a.p(p1, "loadPolicy");
       return t.b(b.e, p0, p1, null, 4, null);
    }
    public s p(Class p0){
       return this.t(p0);
    }
    public a t(Class p0){
       t6 obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clazz");
       obj = b.a(0x63126dff);
       a uoa = null;
       if (obj != null) {
          a uoa1 = obj.a(p0);
          if (uoa1 != null && uoa1.isAvailable()) {
             uoa = uoa1;
          }
       }
       return uoa;
    }
}
