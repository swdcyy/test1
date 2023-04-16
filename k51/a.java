package k51.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import w51.a;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.Boolean;
import xf6.l;

public class a	// class@002c8b
{

    public void a(){
       super();
    }
    public static long a(){
       long a;
       Object obj = PatchProxy.apply(null, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       a = a.a;
       if (a) {
          return a;
       }
       return a.t().u("SOURCE_LIVE").b("liveLongConnectMessageDispatchIntervalMs", 0);
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableLiveActivityTopPendantJankOpt", false);
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableLiveBottomBarJankOpt", false);
    }
    public static boolean d(){
       Object obj = PatchProxy.apply(null, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableLiveCommentJankOpt", false);
    }
    public static boolean e(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = a.h();
       boolean b = true;
       if (i == b) {
          return b;
       }
       if (i == 2) {
          return false;
       }
       return a.t().u("SOURCE_LIVE").d("liveDetailPlayJankOpt", false);
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = a.h();
       boolean b = true;
       if (i == b) {
          return b;
       }
       if (i == 2) {
          return false;
       }
       return a.t().u("SOURCE_LIVE").d("liveDetailPlayJankOpt2", false);
    }
    public static boolean g(){
       Object obj = PatchProxy.apply(null, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableLiveGiftJankOpt", false);
    }
    public static boolean h(){
       Object obj = PatchProxy.apply(null, null, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("liveHourlyRankListPerfOpt", false);
    }
    public static boolean i(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, a.class, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(objArray, objArray, a.class, "109");
       int i = (obj != patchProxyRe)? obj.intValue(): l.e("enableLiveDetailPlayMeasureJankOpt", false);
       boolean b = true;
       if (i == b) {
          return b;
       }else if(i == 2){
          return false;
       }else {
          return a.t().u("SOURCE_LIVE").d("enableLiveOnMeasureJankOpt", false);
       }
    }
}
