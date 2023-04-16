package ev1.a;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;

public class a	// class@0021fc
{

    public void a(){
       super();
    }
    public static void a(ClientContent$LiveStreamPackage p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uoa, "2")) {
          return;
       }
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uClickEvent.elementPackage = uElementPack;
       uElementPack.action2 = "LIVE_INDICATOR_RIGHT_PENDANT_PACK_UP";
       i3 oi3 = i3.f();
       oi3.c("pendant_num", Integer.valueOf(p1));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uClickEvent.contentPackage = uContentPack;
       uContentPack.liveStreamPackage = p0;
       u1.a0(uClickEvent);
       return;
    }
    public static void b(ClientContent$LiveStreamPackage p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uoa, "1")) {
          return;
       }
       ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       showEvent.elementPackage = uElementPack;
       uElementPack.action2 = "LIVE_INDICATOR_RIGHT_PENDANT_PACK_UP";
       i3 oi3 = i3.f();
       oi3.c("pendant_num", Integer.valueOf(p1));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       showEvent.contentPackage = uContentPack;
       uContentPack.liveStreamPackage = p0;
       u1.g0(showEvent);
       return;
    }
}
