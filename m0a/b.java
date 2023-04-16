package m0a.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.sdk.switchconfig.a;
import lnc.i3;
import k2b.u1;

public class b	// class@002ef3
{
    public static String a;
    public static String b;

    public void b(){
       super();
    }
    public static boolean a(int p0,int p1){
       boolean b = (p0 <= p1)? true: false;
       return b;
    }
    public static boolean b(Boolean p0,String p1,int p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 1;
       if (TextUtils.isEmpty(p1)) {
          return (p0.booleanValue() ^ i);
       }else if(p1.length() <= p2){
          i = false;
       }
       return i;
    }
    public static boolean c(Boolean p0,String p1,int p2){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 1;
       if (TextUtils.isEmpty(p1)) {
          return (p0.booleanValue() ^ i);
       }else if(p1.getBytes().length <= p2){
          i = false;
       }
       return i;
    }
    public static boolean d(boolean p0,String p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Boolean.valueOf(p0), p1, null, uob, "5");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (!p0) {
          Object obj1 = PatchProxy.apply(null, null, uob, "6");
          b = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().d("commonFeedSlideStatisticEnable", false);
          if (b) {
             i3 oi3 = i3.f();
             oi3.d("errorType", p1);
             oi3.d("utm_source", b.b);
             oi3.d("kwaiUrl", b.a);
             p1 = oi3.e();
             u1.R("COMMON_FEED_SLIDE_PARAM_ERROR", p1, 14);
          }
       }
       return p0;
    }
}
