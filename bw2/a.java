package bw2.a;
import qu2.a;
import co2.f2;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTeamPkPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import np2.a;
import np2.j;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;
import k2b.e0;

public class a	// class@00046d
{
    public a a;
    public f2 b;

    public void a(a p0,f2 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static ClientContent$LiveVoicePartyTeamPkPackage a(f2 p0){
       ClientContent$LiveVoicePartyTeamPkPackage obj = PatchProxy.applyOneRefs(p0, null, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$LiveVoicePartyTeamPkPackage();
       a uoa = p0.q();
       if (uoa != null) {
          obj.teamPkRoomId = uoa.c();
          obj.pkId = uoa.m();
          obj.pkStatus = uoa.a().a();
       }
       return obj;
    }
    public static void e(ClientContent$LiveStreamPackage p0,f2 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "2")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_TEAM_PK_BUTTON";
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.liveVoicePartyPackage = n.g(p1);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public static void f(ClientContent$LiveStreamPackage p0,f2 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_TEAM_PK_BUTTON";
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.liveVoicePartyPackage = n.g(p1);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.v0(9, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public void b(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "10")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_TEAMPK_JOIN_TEAM";
       i3 oi3 = i3.f();
       oi3.c("source", Integer.valueOf(p1));
       uElementPack.params = oi3.e();
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.liveVoicePartyPackage = n.g(this.b);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = this.a.a();
       ClientContent$LiveVoicePartyTeamPkPackage liveVoicePar = a.a(this.b);
       liveVoicePar.teamHolder = p0;
       uContentPack.liveVoicePartyTeampkPackage = liveVoicePar;
       u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public void c(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_TEAMPK_JOIN_TEAM";
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       i3 oi3 = i3.f();
       oi3.c("source", Integer.valueOf(p1));
       uElementPack.params = oi3.e();
       uContentWrap.liveVoicePartyPackage = n.g(this.b);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = this.a.a();
       ClientContent$LiveVoicePartyTeamPkPackage liveVoicePar = a.a(this.b);
       liveVoicePar.teamHolder = p0;
       uContentPack.liveVoicePartyTeampkPackage = liveVoicePar;
       u1.D0("", this.a.c(), 1, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_TEAMPK_START";
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.liveVoicePartyPackage = n.g(this.b);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = this.a.a();
       uContentPack.liveVoicePartyTeampkPackage = a.a(this.b);
       u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_TEAMPK_GIFT_EFFECTS";
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.liveVoicePartyPackage = n.g(this.b);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = this.a.a();
       u1.v0(9, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public void h(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "4")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_TEAMPK_INVITE";
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.liveVoicePartyPackage = n.g(this.b);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = this.a.a();
       ClientContent$LiveVoicePartyTeamPkPackage liveVoicePar = a.a(this.b);
       liveVoicePar.teamHolder = p0;
       uContentPack.liveVoicePartyTeampkPackage = liveVoicePar;
       u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       return;
    }
}
