package ls1.g;
import java.lang.Object;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import ls1.g$b;
import ub.a;
import sz1.e;
import com.kuaishou.live.common.core.component.multiline.log.a$a;
import com.kwai.robust.PatchProxyResult;
import uz1.b;
import lh3.b;
import java.lang.Boolean;
import com.kuaishou.live.core.show.multiline.LiveMultiLineConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.lang.Number;
import p91.m;
import aq5.d;
import fq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import com.kuaishou.protobuf.livestream.nano.LiveMultiLineChatLastPkInfo;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveInteractiveUserTagConfig;
import android.content.SharedPreferences;
import km8.b;
import java.util.List;
import i81.g;
import brd.t;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager;
import com.kuaishou.live.comments.bulletin.LiveBulletinStageType;
import ls1.g$a;
import i81.c;

public class g	// class@003016
{
    public static LiveConfigStartupResponse$LiveInteractiveUserTagConfig a;

    public void g(){
       super();
    }
    public static void a(KwaiCDNImageView p0,int p1,int p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, g.class, "8")) {
          return;
       }
       p0.p0(p1, 0, new g$b(p0, p2));
       return;
    }
    public static a$a b(e p0,String p1){
       a$a obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a();
       obj.a = p0.Wi().F();
       obj.b = String.valueOf(p0.Wi().n());
       obj.c = p0.gc().f();
       obj.d = p0.gc().I1(p1);
       return obj;
    }
    public static boolean c(){
       LiveMultiLineConfig obj = PatchProxy.apply(null, null, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.A(LiveMultiLineConfig.class);
       boolean b = (obj != null && obj.isMultiLineEnable())? true: false;
       return b;
    }
    public static int d(){
       LiveMultiLineConfig obj = PatchProxy.apply(null, null, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.A(LiveMultiLineConfig.class);
       if (obj == null) {
          return 0;
       }
       Integer supportMulti = obj.getSupportMultiArenaLineChatCount();
       if (supportMulti == null) {
          return 0;
       }
       return supportMulti.intValue();
    }
    public static int e(){
       LiveMultiLineConfig obj = PatchProxy.apply(null, null, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = a.A(LiveMultiLineConfig.class);
       int i = (obj == null)? 4: obj.getSupportMultiLineChatCount();
       return i;
    }
    public static boolean f(m p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.A0().r2(AnchorBizRelation.LIVE_MULTI_LINE);
    }
    public static boolean g(m p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.A0().r2(AudienceBizRelation.LIVE_MULTI_LINE);
    }
    public static boolean h(LiveMultiLineChatLastPkInfo p0){
       boolean b = (p0 != null && p0.lastPkEndInfo == 12)? true: false;
       return b;
    }
    public static boolean i(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, og, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return g.k(p0);
    }
    public static boolean j(int p0){
       LiveConfigStartupResponse$LiveInteractiveUserTagConfig obj1;
       boolean b;
       g og = g.class;
       Object obj = null;
       if (PatchProxy.isSupport(og)) {
          obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, og, "5");
          if (obj1 != PatchProxyResult.class) {
             return obj1.booleanValue();
          }
       }
       if (g.a == null) {
          obj1 = LiveConfigStartupResponse$LiveInteractiveUserTagConfig.class;
          String str = a.a.getString("liveInteractiveUserTagConfig", "{}");
          if (str != null && str != "") {
             obj = b.a(str, obj1);
          }
          g.a = obj;
       }
       obj1 = g.a.mEnableInteractiveUserTagBizList;
       b = (obj1 != null && obj1.contains(Integer.valueOf(p0)))? true: false;
       return b;
    }
    public static boolean k(int p0){
       boolean b = (p0 == 2)? true: false;
       return b;
    }
    public static void l(g p0,t p1,t p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, g.class, "4")) {
          return;
       }
       LiveBulletinLayoutManager liveBulletin = p0.i7();
       if (liveBulletin != null) {
          liveBulletin.i(LiveBulletinStageType.MultiLine, new g$a(p1, p2));
       }
       return;
    }
}
