package cr2.b;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import p91.m;
import co2.f2;
import k2b.e0;
import z12.x;
import yx2.n$a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import yx2.n;

public class b	// class@0023c9
{

    public void b(){
       super();
    }
    public static void a(ClientContent$LiveStreamPackage p0,String p1,int p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, b.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_PK_RESULT";
       i3 oi3 = i3.f();
       oi3.d("voice_party_pk_id", p1);
       int i = 1;
       if (p2) {
          i = (p2 != i)? 3: 2;
       }
    label_0034 :
       oi3.c("result_type", Integer.valueOf(i));
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.u0(9, uElementPack, uContentPack);
       return;
    }
    public static void b(m p0,f2 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "4")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_PK_BUTTON";
       n$a uoa = new n$a();
       uoa.e(uElementPack);
       uoa.h(n.h(p1));
       uoa.f(p0.a());
       n.t(x.k(p0), uoa);
       return;
    }
    public static void c(m p0,f2 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, b.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_PK_BUTTON";
       n$a uoa = new n$a();
       uoa.e(uElementPack);
       uoa.h(n.h(p1));
       uoa.f(p0.a());
       n.w(x.k(p0), uoa);
       return;
    }
}
