package hd2.l0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.lang.Integer;
import java.lang.Number;
import d61.v;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCPkStatistic;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PkPlayerStatistic;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.Float;
import android.os.Build$VERSION;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import va1.n0;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LivePkConfig;
import java.lang.reflect.Type;
import wg3.a;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCPkStart;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;

public class l0	// class@002d6a
{

    public void l0(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, l0.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableResizePlayerViewForNewDuetPk", false);
    }
    public static int b(int p0,int p1,int p2){
       if (PatchProxy.isSupport(l0.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), null, l0.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return v.b(p0, p1, p2);
    }
    public static String c(LiveStreamMessages$SCPkStatistic p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, l0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          LiveStreamMessages$SCPkStatistic playStat = p0.playStat;
          if (playStat == null || (playStat.length && !TextUtils.x(p1))) {
             p0 = p0.playStat;
             int len = p0.length;
             int i = 0;
             while (i < len) {
                object oobject = p0[i];
                if (!p1.equals(String.valueOf(oobject.player.userId))) {
                   return oobject.liveStreamId;
                }
                i = i + 1;
             }
          }
       }
       return "";
    }
    public static boolean d(float p0,float p1){
       LiveLogTag obj;
       l0 ol0 = l0.class;
       if (PatchProxy.isSupport(ol0)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), null, ol0, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (Build$VERSION.SDK_INT < 23) {
          b.Z(LiveLogTag.PK, "sdk less than 6.0");
          return false;
       }else {
          obj = LiveLogTag.PK;
          b.d0(obj, "screenSize", "screenWidth:", Float.valueOf(p0), "screenHeight", Float.valueOf(p1));
          if ((p1 / p0) - 0x3fe38e39 > 0) {
             b.Z(obj, "Aspect ratio more than 16£º9");
             return false;
          }else if(n0.d() - 0x4016000000000000 > 0){
             b.Z(obj, "physics screen size is more than 5.5");
             return false;
          }else {
             b.Z(obj, "allow crop");
             return true;
          }
       }
    }
    public static boolean e(){
       LiveConfigStartupResponse$LivePkConfig obj = PatchProxy.apply(null, null, l0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.B(LiveConfigStartupResponse$LivePkConfig.class);
       boolean b = (obj != null && (obj.mEnablePkSmallWindow != null && Build$VERSION.SDK_INT >= 23))? true: false;
       return b;
    }
    public static boolean f(int p0){
       boolean b = (p0 == 9 || p0 == 10)? true: false;
       return b;
    }
    public static boolean g(a0 p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       l0 ol0 = l0.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, ol0, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!l0.e()) {
          Object obj1 = PatchProxy.apply(null, null, ol0, "3");
          boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): l0.d((float)n0.f(), (float)n0.e());
          if (!b) {
          label_004b :
             b1 = false;
          label_004c :
             return b1;
          }
       }
       if (p0 != null && (!p0.l() && !p0.c.isGRPRCustomizedLive())) {
          b1 = true;
          goto label_004c ;
       }else {
          goto label_004b ;
       }
    }
    public static boolean h(LiveStreamMessages$SCPkStart p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l0.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          return p0.smallTalk;
       }
       b.Z(LiveLogTag.PK, "[LivePkUtil] [isSmallTalk] : scPkStart is null");
       return false;
    }
    public static float i(float p0){
       l0 ol0 = l0.class;
       if (PatchProxy.isSupport(ol0)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), null, ol0, "7");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return (p0 / c.c(a.b().getResources()).density);
    }
}
