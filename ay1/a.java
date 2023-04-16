package ay1.a;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import q2b.h$b;
import k2b.u1;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;

public class a	// class@0002cd
{

    public void a(){
       super();
    }
    public static void a(ClientContent$LiveStreamPackage p0,long p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), null, a.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "TRUE_WITHOUT_MAKEUP_CARD";
       i3 oi3 = i3.f();
       oi3.d("type", String.valueOf(p2));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.timeCost = p1;
       h$b uob = h$b.e(10, "TRUE_WITHOUT_MAKEUP_CARD");
       uob.h(uContentPack);
       uob.q(resultPackag);
       uob.k(uElementPack);
       u1.r0(uob);
       return;
    }
    public static void b(ClientContent$LiveStreamPackage p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uoa, "1")) {
          return;
       }
       a.c(p0, p1, null);
       return;
    }
    public static void c(ClientContent$LiveStreamPackage p0,int p1,BaseFeed p2){
       ClientContent$PhotoPackage photoPackage;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, null, a.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action = 1428;
       i3 oi3 = i3.f();
       oi3.d("content", String.valueOf(p1));
       uElementPack.params = oi3.e();
       if (p2 != null) {
          photoPackage = w1.f(p2);
       }else {
          photoPackage = new ClientContent$PhotoPackage();
          photoPackage.authorId = Long.valueOf(p0.anchorUserId).longValue();
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.photoPackage = photoPackage;
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       showEvent.elementPackage = uElementPack;
       showEvent.contentPackage = uContentPack;
       u1.g0(showEvent);
       return;
    }
}
