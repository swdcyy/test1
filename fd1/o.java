package fd1.o;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$MoreInfoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Long;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import q2b.h$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import k2b.u1;

public class o	// class@0022fd
{

    public void o(){
       super();
    }
    public static String a(String p0,String p1,String p2){
       i3 obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, o.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.d("btn_type", p0);
       obj.d("questionnaire_id", p1);
       obj.d("questionId", p2);
       return obj.e();
    }
    public static ClientContentWrapper$MoreInfoPackage b(String p0){
       ClientContentWrapper$MoreInfoPackage obj = PatchProxy.applyOneRefs(p0, null, o.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContentWrapper$MoreInfoPackage();
       obj.id = p0;
       obj.type = String.valueOf(22);
       return obj;
    }
    public static void c(long p0,ClientContent$LiveStreamPackage p1,int p2,String p3,String p4,String p5){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),p1,Integer.valueOf(p2),p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, null, oo, "4")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.params = o.a(p3, p4, p5);
       h$b uob = h$b.e(p2, "QUESTIONNAIRE_TIME_COST");
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       uob.h(uContentPack);
       uob.k(uElementPack);
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.timeCost = p0;
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
    public static void d(ClientContent$LiveStreamPackage p0,int p1,String p2,String p3,String p4){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, oo, "3")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.params = o.a(p2, p3, p4);
       h$b uob = h$b.e(p1, "LIVE_QUESTIONNAIRE");
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uob.h(uContentPack);
       uob.k(uElementPack);
       u1.r0(uob);
       return;
    }
}
