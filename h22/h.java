package h22.h;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class h	// class@002bf8
{

    public void h(){
       super();
    }
    public static ClientContent$RedPackPackage a(String p0){
       ClientContent$RedPackPackage obj = PatchProxy.applyOneRefs(p0, null, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$RedPackPackage();
       obj.redPackId = p0;
       obj.redPackType = 14;
       return obj;
    }
    public static String b(int p0,int p1,String p2,String p3){
       i3 obj;
       if (PatchProxy.isSupport(h.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, null, h.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       obj.c("biz_type", Integer.valueOf(p0));
       obj.c("box_type", Integer.valueOf(p1));
       obj.d("extra_info", p2);
       obj.d("open_source", p3);
       return obj.toString();
    }
    public static void c(ClientContent$LiveStreamPackage p0,int p1,String p2,int p3,String p4,String p5){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,Integer.valueOf(p3),p4,p5};
          if (PatchProxy.applyVoid(objArray, null, oh, "1")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ACTIVITY_RED_PACKET_ENVELOPE_SUBCARD";
       i3 oi3 = i3.f();
       oi3.d("btn_type", p4);
       oi3.c("biz_type", Integer.valueOf(p1));
       oi3.c("box_type", Integer.valueOf(p3));
       oi3.d("extra_info", p5);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.redPackage = h.a(p2);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void d(ClientContent$LiveStreamPackage p0,int p1,int p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, h.class, "6")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ACTIVITY_RED_PACKET_NOT_REPEATED_CARD";
       i3 oi3 = i3.f();
       oi3.c("biz_type", Integer.valueOf(p2));
       oi3.c("box_type", Integer.valueOf(p1));
       uElementPack.params = oi3.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void e(ClientContent$LiveStreamPackage p0,int p1,int p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, h.class, "5")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ACTIVITY_RED_PACKET_NOT_REPEATED_CARD";
       i3 oi3 = i3.f();
       oi3.c("biz_type", Integer.valueOf(p2));
       oi3.c("box_type", Integer.valueOf(p1));
       uElementPack.params = oi3.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u0(1, uElementPack, uContentPack);
       return;
    }
}
