package im1.a;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import k2b.u1;

public class a	// class@002946
{

    public void a(){
       super();
    }
    public static String a(int p0){
       if (p0 == 1) {
          return "50";
       }
       return "100";
    }
    public static void b(ClientContent$LiveStreamPackage p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, a.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "GIFT_RAMPAGE_PENDANT";
       i3 oi3 = i3.f();
       oi3.d("gift_time", a.a(p2));
       uElementPack.params = oi3.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
       giftPackage.identity = String.valueOf(p1);
       uContentPack.giftPackage = giftPackage;
       u1.u0(9, uElementPack, uContentPack);
       return;
    }
}
