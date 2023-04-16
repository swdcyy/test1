package gw1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import w51.a;
import android.os.Build$VERSION;
import xf6.l;
import u91.a;

public class a	// class@002594
{
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;

    public void a(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.b == null) {
          a.b = Boolean.valueOf(a.t().d("enableLiveStartAudienceAx2c", b));
          b.c0(LiveLogTag.LIVE_PRELOAD, "isLiveAudienceAx2cEnabled", "enable", a.b);
       }
       if (a.b.booleanValue() || a.p()) {
          int sDK_INT = Build$VERSION.SDK_INT;
          if (sDK_INT != 24 && sDK_INT != 25) {
             b = true;
          }
       }
       return b;
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.f == null) {
          a.f = Boolean.valueOf(a.t().d("PageMemMonitor", false));
          b.c0(LiveLogTag.LIVE_PERFORMANCE, "isLiveMemoryReportEnabled", "enable", a.f);
       }
       return a.f.booleanValue();
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.a == null) {
          a.a = Boolean.valueOf((a.t().d("disableLiveStartOptimize", false) ^ 0x01));
          b.c0(LiveLogTag.LIVE_PRELOAD, "isLiveStartPerfEnabled", "enable", a.a);
       }
       return a.a.booleanValue();
    }
    public static boolean d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, null, a.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.e == null) {
          a.e = Boolean.valueOf(a.t().d("enableLiveAudienceThreadReport", b));
          b.c0(LiveLogTag.LIVE_PERFORMANCE, "isLiveThreadReportEnabled", "enable", a.e);
       }
       if (!a.e.booleanValue()) {
          obj = PatchProxy.apply(null, null, a.class, "50");
          boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): l.c("liveAudienceThreadReport", b);
          if (!b1) {
          label_0058 :
             return b;
          }
       }
       b = true;
       goto label_0058 ;
    }
    public static boolean e(){
       Object obj = PatchProxy.apply(null, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (a.d == null) {
          boolean b = false;
          if (a.c() && a.t().d(a.c, b)) {
             b = true;
          }
          a.d = Boolean.valueOf(b);
       }
       return a.d.booleanValue();
    }
}
