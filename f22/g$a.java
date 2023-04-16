package f22.g$a;
import java.lang.Object;
import nsd.u;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Boolean;
import java.lang.CharSequence;

public final class g$a	// class@002849
{

    public void g$a(){
       super();
    }
    public void g$a(u p0){
       super();
    }
    public final void a(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, g$a.class, "2")) {
          return;
       }
       a.p(p1, "liveStreamPackage");
       a.p(p3, "buttonType");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "FIRST_AUTO_INVITE_FRIEND_POPUP";
       i3 oi3 = i3.f();
       oi3.d("btn_type", p3);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveVoicePartyPackage = p2;
       uContentPack.liveStreamPackage = p1;
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
    public final void b(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2,String p3,boolean p4,String p5,String p6){
       g$a uoa = g$a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),p5,p6};
          if (PatchProxy.applyVoid(objArray, this, uoa, "5")) {
             return;
          }
       }
       a.p(p1, "liveStreamPackage");
       a.p(p3, "source");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AOTO_INVITE_SWITCH_PANEL";
       i3 oi3 = i3.f();
       oi3.d("panel_source", p3);
       p3 = (p4)? "TRUE": "FALSE";
       oi3.d("status", p3);
       p3 = (p5 == null || !p5.length())? 1: null;
       if (!p3) {
          oi3.d("voice_nine_room_id", p5);
       }
       if (p6 != null && p6.length()) {
          i = 0;
       }
       if (!i) {
          oi3.d("voice_party_pk_id", p6);
       }
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       uContentPack.liveVoicePartyPackage = p2;
       u1.C0("", p0, 10, uElementPack, uContentPack);
       return;
    }
}
