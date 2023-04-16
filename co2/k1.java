package co2.k1;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.f2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import ss2.f;
import ss2.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTheaterPackage;
import mw2.e;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.lang.Boolean;
import java.util.Arrays;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;

public final class k1	// class@000597
{

    public void k1(){
       super();
    }
    public static void a(ClientContent$LiveStreamPackage p0,f2 p1,int p2,int p3){
       if (PatchProxy.isSupport(k1.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, k1.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MIC_SELECT_POPUP";
       i3 oi3 = i3.f();
       oi3.c("btn_name", Integer.valueOf(p3));
       oi3.c("if_user", Integer.valueOf(p2));
       uElementPack.params = oi3.e();
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.liveVoicePartyPackage = n.g(p1);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public static void b(ClientContent$LiveStreamPackage p0,f2 p1,VoicePartyMicSeatData p2,String p3,int p4,int p5){
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p3;
       k1 ok1 = k1.class;
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 6;
       if (PatchProxy.isSupport(ok1)) {
          Object[] objArray = new Object[i3];
          objArray[0] = oobject;
          objArray[1] = oobject1;
          objArray[2] = p2;
          objArray[i2] = oobject2;
          objArray[i1] = Integer.valueOf(p4);
          objArray[i] = Integer.valueOf(p5);
          if (PatchProxy.applyVoid(objArray, null, ok1, "11")) {
             return;
          }
       }
       f uof = (p2 != null)? g.a(p2): null;
       if (PatchProxy.isSupport(ok1)) {
          Object[] objArray1 = new Object[i3];
          objArray1[0] = oobject;
          objArray1[1] = oobject1;
          objArray1[2] = uof;
          objArray1[i2] = oobject2;
          objArray1[i1] = Integer.valueOf(p4);
          objArray1[i] = Integer.valueOf(p5);
          if (PatchProxy.applyVoid(objArray1, null, ok1, "10")) {
          label_00a4 :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MIC_SELECT_POPUP";
       i3 oi3 = i3.f();
       oi3.c("btn_name", Integer.valueOf(p5));
       oi3.c("if_user", Integer.valueOf(p4));
       uElementPack.params = oi3.e();
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       ClientContentWrapper$LiveVoicePartyPackage liveVoicePar = n.k(p1, uof);
       liveVoicePar.selectedMicSeatUserId = oobject2;
       uContentWrap.liveVoicePartyPackage = liveVoicePar;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = oobject;
       uContentPack.liveVoicePartyTheaterPackage = e.b(p1);
       u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       goto label_00a4 ;
    }
    public static void c(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2,int p3,String p4,boolean p5,String[] p6,boolean p7){
       k1 ok1 = k1.class;
       int i = 2;
       if (PatchProxy.isSupport(ok1)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,Boolean.valueOf(p5),p6,Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, null, ok1, "13")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MIC_MODEL_PANEL_AUDIENCE_ITEM";
       i3 oi3 = i3.f();
       oi3.d("label", Arrays.toString(p6));
       if (p5) {
          i = 1;
       }
       oi3.c("type", Integer.valueOf(i));
       oi3.d("if_manager", (Boolean.toString(p7)).toUpperCase());
       uElementPack.params = oi3.e();
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = p4;
       userPackage.index = p3;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveVoicePartyPackage = p2;
       uContentPack.liveStreamPackage = p1;
       uContentPack.userPackage = userPackage;
       u1.L("", p0, 9, uElementPack, uContentPack);
       return;
    }
    public static void d(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2,int p3,String p4,boolean p5,String[] p6,boolean p7){
       k1 ok1 = k1.class;
       int i = 2;
       if (PatchProxy.isSupport(ok1)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,Boolean.valueOf(p5),p6,Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, null, ok1, "12")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MIC_MODEL_PANEL_AUDIENCE_ITEM";
       i3 oi3 = i3.f();
       oi3.d("label", Arrays.toString(p6));
       if (p5) {
          i = 1;
       }
       oi3.c("type", Integer.valueOf(i));
       oi3.d("if_manager", (Boolean.toString(p7)).toUpperCase());
       uElementPack.params = oi3.e();
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = p4;
       userPackage.index = p3;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveVoicePartyPackage = p2;
       uContentPack.liveStreamPackage = p1;
       uContentPack.userPackage = userPackage;
       u1.C0("", p0, 9, uElementPack, uContentPack);
       return;
    }
    public static void e(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2,int p3,String p4,String p5,String[] p6,boolean p7){
       k1 ok1 = k1.class;
       if (PatchProxy.isSupport(ok1)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,p5,p6,Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, null, ok1, "17")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MIC_MODEL_PANEL_INVITE_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("label", Arrays.toString(p6));
       oi3.d("area_type", p5);
       oi3.d("if_manager", (Boolean.toString(p7)).toUpperCase());
       uElementPack.params = oi3.e();
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = p4;
       userPackage.index = p3;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveVoicePartyPackage = p2;
       uContentPack.liveStreamPackage = p1;
       uContentPack.userPackage = userPackage;
       u1.L("", p0, 6, uElementPack, uContentPack);
       return;
    }
    public static void f(e0 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2,int p3,String p4,String p5,String[] p6,boolean p7){
       k1 ok1 = k1.class;
       if (PatchProxy.isSupport(ok1)) {
          Object[] objArray = new Object[]{p0,p1,p2,Integer.valueOf(p3),p4,p5,p6,Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, null, ok1, "14")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MIC_MODEL_PANEL_INVITE_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("label", Arrays.toString(p6));
       oi3.d("area_type", p4);
       oi3.d("if_manager", (Boolean.toString(p7)).toUpperCase());
       uElementPack.params = oi3.e();
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = p5;
       userPackage.index = p3 + 1;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveVoicePartyPackage = p2;
       uContentPack.liveStreamPackage = p1;
       uContentPack.userPackage = userPackage;
       u1.C0("", p0, 6, uElementPack, uContentPack);
       return;
    }
    public static void g(ClientContent$LiveStreamPackage p0,f2 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, k1.class, "4")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "VOICE_PARTY_BOTTOM_INVITE_MIC_BUTTON";
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.liveVoicePartyPackage = n.g(p1);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       return;
    }
    public static void h(ClientContent$LiveStreamPackage p0,f2 p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, k1.class, "19")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MIC_INVITE_POPUP";
       i3 oi3 = i3.f();
       oi3.d("btn_name", p2);
       uElementPack.params = oi3.e();
       ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
       uContentWrap.liveVoicePartyPackage = n.g(p1);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p0;
       u1.H("", 1, uElementPack, uContentPack, uContentWrap);
       return;
    }
}
