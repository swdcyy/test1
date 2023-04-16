package dm1.b;
import dm1.b$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.models.Gift;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import ekd.k1;
import lnc.i3;
import java.lang.Number;
import k2b.u1;

public final class b	// class@001fc1
{
    public static final b$a a;

    static {
       b.a = new b$a(null);
    }
    public void b(){
       super();
    }
    public static final void a(Gift p0,String p1,int p2,String p3,boolean p4){
       boolean b;
       b uob = b.class;
       String str = "1";
       int i = 4;
       int i1 = 2;
       int i2 = 5;
       int i3 = 1;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[i2];
          objArray[0] = p0;
          objArray[i3] = p1;
          objArray[i1] = Integer.valueOf(p2);
          objArray[3] = p3;
          objArray[i] = Boolean.valueOf(p4);
          if (PatchProxy.applyVoid(objArray, null, uob, str)) {
             return;
          }
       }
       b$a a = b.a;
       Objects.requireNonNull(a);
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray1 = new Object[i2];
          objArray1[0] = p0;
          objArray1[i3] = p1;
          objArray1[i1] = Integer.valueOf(p2);
          objArray1[3] = p3;
          objArray1[i] = Boolean.valueOf(p4);
          if (!PatchProxy.applyVoid(objArray1, a, uoa, str)) {
          label_0054 :
             a.p(p1, "source");
             i3 obj = PatchProxy.apply(null, a, uoa, "2");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(k1.k(0x2710) - a.t().u("SOURCE_LIVE").b("GiftIconCacheHitLogRatio", 1000) < 0){
                i3 = 0;
             }
             b = i3;
             if (b) {
                obj = i3.f();
                if (p0 != null) {
                   obj.c("giftId", Integer.valueOf(p0.mId));
                }
                obj.d("source", p1);
                obj.c("code", Integer.valueOf(p2));
                obj.d("failReason", p3);
                obj.a("isCacheKeyNewStrategy", Boolean.valueOf(p4));
                u1.R("LIVE_GIFT_ICON_CACHE_QUALITY", obj.toString(), 3);
             }
          }
       }else {
          goto label_0054 ;
       }
       return;
    }
}
