package ey0.b;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import lnc.i3;

public class b	// class@00221a
{

    public void b(){
       super();
    }
    public static void a(ClientContent$LiveStreamPackage p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "1")) {
          return;
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       showEvent.elementPackage = uElementPack;
       uElementPack.action2 = "COMMENT_CARD_INPUT_LOCATION_BUTTON";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       showEvent.contentPackage = uContentPack;
       uContentPack.liveStreamPackage = p0;
       u1.g0(showEvent);
       return;
    }
    public static void b(ClientContent$LiveStreamPackage p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uob, "7")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = "LIVE_COMMENT_LOCATION_AUTH_ANDROID";
       i3 oi3 = i3.f();
       String str = (p1)? "GOSET": "NOSET";
       oi3.d("btn_name", str);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uClickEvent.contentPackage = uContentPack;
       uContentPack.liveStreamPackage = p0;
       u1.a0(uClickEvent);
       return;
    }
    public static void c(ClientContent$LiveStreamPackage p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uob, "5")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = "LIVE_COMMENT_LOCATION_AUTH_CARD";
       i3 oi3 = i3.f();
       String str = (p1)? "ALLOW": "CANCEL";
       oi3.d("btn_name", str);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uClickEvent.contentPackage = uContentPack;
       uContentPack.liveStreamPackage = p0;
       u1.a0(uClickEvent);
       return;
    }
}
