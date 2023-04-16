package ef1.e;
import java.lang.Object;
import ef1.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import k2b.u1;

public class e	// class@002146
{

    public void e(){
       super();
    }
    public static void a(c p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, e.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "LIVE_FREQUENTLY_ACTION_GUIDE_BUBBLE";
       i3 oi3 = i3.f();
       oi3.d("biz_id", p0.a());
       oi3.c("count", Integer.valueOf(p0.b()));
       oi3.d("style", p0.d());
       oi3.d("business_params", p0.e());
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       if (p2 != null) {
          uContentPack.liveVoicePartyPackage = p2;
       }
       int i = p0.f();
       if (i > 0) {
          ClientContent$GiftPackage giftPackage = new ClientContent$GiftPackage();
          uContentPack.giftPackage = giftPackage;
          giftPackage.identity = String.valueOf(i);
       }
       u1.u0(3, uElementPack, uContentPack);
       return;
    }
}
