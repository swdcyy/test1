package h62.e;
import java.lang.Object;
import u52.t;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import i62.t$c;
import nt5.a;
import com.kuaishou.live.core.show.conditionredpacket.logger.FirstReportType;
import com.kuaishou.live.core.show.conditionredpacket.logger.FirstReportType$a;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import h22.a;
import o22.b;

public final class e	// class@002c6c
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public static final int a(t p0,String p1,int p2,String p3){
       int i;
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, null, e.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "liveConditionRedPacketContext");
       a.p(p3, "key");
       LiveConditionRedPacketInfo liveConditio = p0.c.l(p2, p1);
       if (liveConditio != null) {
          liveConditio = liveConditio.x;
          if (liveConditio != null) {
             i = liveConditio.b(p3);
          label_003f :
             return i;
          }
       }
       i = -1;
       goto label_003f ;
    }
    public static final FirstReportType b(t p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Integer.valueOf(p2), p3, null, e.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "liveConditionRedPacketContext");
       a.p(p3, "key");
       int i = e.a(p0, p1, p2, p3);
       FirstReportType dEFAULT = (i == -1)? FirstReportType.DEFAULT: FirstReportType.Companion.a(i);
       return dEFAULT;
    }
    public static final long c(LiveTreasureBoxMessage$LiveTreasureBoxShow p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       a.p(p0, "redPacketShownInfo");
       p0 = p0.userInfo;
       if (p0 != null) {
          return p0.userId;
       }
       return 0;
    }
    public static final long d(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       a.p(p0, "redPacketContext");
       return p0.c.a.a();
    }
    public static final long e(t p0,String p1,int p2){
       long l;
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, e.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       a.p(p0, "liveConditionRedPacketContext");
       LiveConditionRedPacketInfo liveConditio = p0.c.l(p2, p1);
       if (liveConditio != null) {
          liveConditio = liveConditio.x;
          if (liveConditio != null) {
             l = liveConditio.a();
          label_003a :
             return l;
          }
       }
       l = 0;
       goto label_003a ;
    }
}
