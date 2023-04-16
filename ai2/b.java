package ai2.b;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import com.kuaishou.live.core.show.redpacket.richcard.http.RecoRoomInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;
import java.lang.Iterable;
import yb6.d;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.util.DateUtils;
import yh2.d;
import brd.t;
import ci2.b;
import ci2.b$a;
import z12.x;
import java.util.concurrent.TimeUnit;
import cjd.e;
import erd.o;
import ai2.c;
import erd.g;
import ai2.e;
import ai2.b$a;

public final class b	// class@0000d8
{
    public List a;

    public void b(){
       super();
    }
    public final RecoRoomInfo a(List p0,long p1,String p2){
       Iterator obj;
       RecoRoomInfo recoRoomInfo;
       Long this;
       long l;
       StringBuilder str;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Long.valueOf(p1), p2, this, b.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0.isEmpty()) {
          b.P(LiveRichCardStateManager.h.f().appendTag("LiveFetchRecoRoomListHandler"), "[findRecoRoomInfo] list.isEmpty\(\)");
          return null;
       }else {
          obj = p0.iterator();
          while (true) {
             if (obj.hasNext()) {
                recoRoomInfo = obj.next();
                this = recoRoomInfo.getGrabTime();
                l = 0;
                long l1 = (this != null)? this.longValue() - d.a(): l;
                if (l1 - p1 >= 0) {
                   int i = a.g(p2, recoRoomInfo.getLiveStreamId()) ^ 0x01;
                   if (i) {
                      b.P(LiveRichCardStateManager.h.f().appendTag("LiveFetchRecoRoomListHandler"), "[findRecoRoomInfo]下一个直播间的开包时间： "+recoRoomInfo.getGrabTime());
                      str = "下一个直播间的开包时间 ";
                      Long grabTime = recoRoomInfo.getGrabTime();
                      if (grabTime != null) {
                         l = grabTime.longValue();
                         break ;
                      }
                      break ;
                   }
                }
             }else {
                b.S(LiveRichCardStateManager.h.f().appendTag("LiveFetchRecoRoomListHandler"), "[findRecoRoomInfo] 时间不够", "item", p0.get(0));
                return null;
             }
          }
          d.a(str+DateUtils.v(l));
          return recoRoomInfo;
       }
    }
    public final List b(){
       return this.a;
    }
    public final t c(long p0,long p1,String p2,String p3){
       t obj;
       String str = p3;
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyFourRefs(Long.valueOf(p0), Long.valueOf(p1), p2, p3, this, b.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       d.a("从server获取推荐直播间");
       b.P(LiveRichCardStateManager.h.f().appendTag("LiveFetchRecoRoomListHandler"), "[httpFindRechRoomInfo]从server获取推荐直播间");
       if (PatchProxy.isSupport(b.class)) {
          obj = PatchProxy.applyThreeRefs(Long.valueOf(p0), p2, p3, this, b.class, "4");
          if (obj != PatchProxyResult.class) {
          label_008f :
             obj = obj.flatMap(new b$a(this, p1, str));
             a.o(obj, "httpFindRecoRoomInfoObse…      }\n        }\n      }");
             return obj;
          }
       }
       obj = b.a.a().f(p2, str).delaySubscription(x.B(p0), TimeUnit.SECONDS).map(new e()).doOnNext(new c(this)).flatMap(new e(this));
       a.o(obj, "LiveRichCardApiService.g…      }\n        }\n      }");
       goto label_008f ;
    }
}
