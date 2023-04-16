package g59.f;
import java.lang.Boolean;
import java.lang.String;
import java.lang.reflect.Type;
import java.lang.Object;
import com.kwai.framework.abtest.f;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kp.r1;
import kotlin.jvm.internal.a;
import g59.o;
import java.lang.StringBuilder;
import yx.j0;

public final class f	// class@0023fe
{
    public static final Boolean a;
    public static final f b;

    static {
       f.b = new f();
       f.a = f.b("isUseAdLlsidAltFeedLlsid", Boolean.TYPE, Boolean.TRUE);
    }
    public void f(){
       super();
    }
    public static final long a(BaseFeed p0,PhotoAdvertisement p1){
       long l2;
       Object[] objArray;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       long l1 = (p0 != null)? r1.i1(p0): l;
       if (p1 != null) {
          Boolean a = f.a;
          a.o(a, "isUseAdLlsidAltFeedLlsid");
          if (a.booleanValue()) {
             l2 = o.b(p1.mLlsid, l);
          label_0035 :
             if (l1 - l > 0) {
                if (l2 - l <= 0) {
                   objArray = new Object[0];
                   j0.f("AdLlsidUtils", "feed has llsid, but ad\'s llsid is null. feedLlsid: "+l1, objArray);
                }else if(l1 - l2){
                   objArray = new Object[0];
                   j0.c("AdLlsidUtils", "llsids are diff. feedLlsid: "+l1+", adLlsid: "+l2, objArray);
                }
                return l1;
             }else if(l2 - l > 0){
                Object[] objArray1 = new Object[0];
                j0.f("AdLlsidUtils", "adLlsid is used, adLlsid: "+l2, objArray1);
                return l2;
             }else {
                Object[] objArray2 = new Object[0];
                j0.c("AdLogWrapper", "cannot getLLssid", objArray2);
                return l;
             }
          }
       }
       l2 = l;
       goto label_0035 ;
    }
}
