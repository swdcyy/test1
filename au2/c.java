package au2.c;
import java.lang.Object;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.util.List;
import va1.d;
import java.util.Collection;
import ekd.q;
import java.lang.Integer;
import java.lang.Number;
import k2b.u1;
import q2b.h$b;

public class c	// class@0002cb
{

    public void c(){
       super();
    }
    public static void a(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, c.class, "2")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       uContentPack.liveVoicePartyPackage = p2;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_INVITE_PANEL_SUBCARD";
       i3 oi3 = i3.f();
       oi3.c("have_friend", Integer.valueOf((q.f(d.a()) ^ 1)));
       oi3.d("subcard_name", p3);
       uElementPack.params = oi3.e();
       u1.L("", p0, 1, uElementPack, uContentPack);
       return;
    }
    public static void b(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2,int p3){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, c.class, "1")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       uContentPack.liveVoicePartyPackage = p2;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_INVITE_PANEL";
       i3 oi3 = i3.f();
       oi3.c("source", Integer.valueOf(p3));
       uElementPack.params = oi3.e();
       u1.C0("", p0, 9, uElementPack, uContentPack);
       return;
    }
    public static void c(ClientContent$LiveStreamPackage p0,String p1,int p2){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, c.class, "3")) {
          return;
       }
       h$b uob = h$b.e(p2, "VOICE_PARTY_INVITE_PANEL_SUBCARD");
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       i3 oi3 = i3.f();
       oi3.c("have_friend", Integer.valueOf((q.f(d.a()) ^ 0x01)));
       oi3.d("subcard_name", p1);
       uElementPack.params = oi3.e();
       uob.h(uContentPack);
       uob.k(uElementPack);
       u1.r0(uob);
       return;
    }
}
