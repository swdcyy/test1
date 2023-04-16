package com.kuaishou.live.core.show.redpacket.activity.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import q2b.h$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import k2b.u1;
import com.kuaishou.live.core.show.redpacket.activity.LiveRedPacketActivityManager$LiveGrabErrorReason;

public class a	// class@000e52
{

    public void a(){
       super();
    }
    public static String a(int p0){
       i3 obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoa, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = (p0 == 1)? "PENDANT_TITLE_CARD": "OPEN_CHEST_CARD";
       obj = i3.f();
       obj.d("source", str);
       return obj.e();
    }
    public static void b(ClientContent$LiveStreamPackage p0,ClientContent$RedPackPackage p1,int p2,int p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, a.class, "4")) {
          return;
       }
       h$b uob = h$b.e(p2, "GET_CHEST_REWARD");
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.redPackage = p1;
       uob.h(uContentPack);
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.code = p3;
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
    public static void c(ClientContent$LiveStreamPackage p0,ClientContent$RedPackPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "3")) {
          return;
       }
       a.b(p0, p1, 7, 0);
       return;
    }
    public static void d(ClientContent$LiveStreamPackage p0,ClientContent$RedPackPackage p1,int p2,LiveRedPacketActivityManager$LiveGrabErrorReason p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, null, a.class, "6")) {
          return;
       }
       h$b uob = h$b.e(p2, "GRAB_ACTIVITY_RED_PACKET_RESULT");
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       uContentPack.redPackage = p1;
       uob.h(uContentPack);
       ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
       resultPackag.code = p3.mCode;
       resultPackag.message = p3.mMessage;
       uob.q(resultPackag);
       u1.r0(uob);
       return;
    }
}
