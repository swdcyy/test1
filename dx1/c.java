package dx1.c;
import java.lang.Object;
import dx1.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import kotlin.jvm.internal.a;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import com.kwai.robust.PatchProxyResult;
import uw1.i;

public final class c	// class@00205e
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final void a(b p0,boolean p1,long p2,String p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Long.valueOf(p2), p3, this, c.class, "6")) {
          return;
       }
       a.p(p0, "redPacketData");
       a.p(p3, "path");
       i3 oi3 = i3.f();
       oi3.d("leeeId", p0.a());
       oi3.c("leeeType", Integer.valueOf(this.c(p0.b())));
       oi3.c("isNewStyle", Integer.valueOf(p0.c()));
       oi3.c("result", Integer.valueOf(p1));
       oi3.c("costTime", Long.valueOf(p2));
       oi3.d("path", TextUtils.k(p3));
       u1.R("LEEE_SKIN_RENDER_ACTION", oi3.e(), 3);
       return;
    }
    public final void b(b p0,boolean p1,long p2,String p3,String p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,Boolean.valueOf(p1),Long.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoc, "4")) {
             return;
          }
       }
       a.p(p0, "redPacketData");
       i3 oi3 = i3.f();
       oi3.d("leeeId", p0.a());
       oi3.c("leeeType", Integer.valueOf(this.c(p0.b())));
       oi3.c("isNewStyle", Integer.valueOf(p0.c()));
       oi3.c("result", Integer.valueOf(p1));
       oi3.c("costTime", Long.valueOf(p2));
       oi3.d("errorReason", p3);
       oi3.d("path", TextUtils.k(p4));
       u1.R("LEEE_SKIN_RESOURCE_DOWNLOAD", oi3.e(), 3);
       return;
    }
    public final int c(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return i.c(p0);
    }
}
