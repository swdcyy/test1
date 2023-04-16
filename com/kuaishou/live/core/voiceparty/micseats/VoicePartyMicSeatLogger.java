package com.kuaishou.live.core.voiceparty.micseats.VoicePartyMicSeatLogger;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.micseats.VoicePartyMicSeatLogger$InvitationDialogRelationshipType;
import co2.f2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.live.core.voiceparty.micseats.VoicePartyMicSeatLogger$InvitationDialogButtonType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Enum;
import yx2.n;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class VoicePartyMicSeatLogger	// class@001562
{

    public void VoicePartyMicSeatLogger(){
       super();
    }
    public static VoicePartyMicSeatLogger$InvitationDialogRelationshipType a(int p0){
       VoicePartyMicSeatLogger$InvitationDialogRelationshipType aUDIENCE = VoicePartyMicSeatLogger$InvitationDialogRelationshipType.AUDIENCE;
       if (p0 != 1) {
          if (p0 == 2) {
             aUDIENCE = VoicePartyMicSeatLogger$InvitationDialogRelationshipType.FRIEND;
          }
       }else {
          aUDIENCE = VoicePartyMicSeatLogger$InvitationDialogRelationshipType.FUNS;
       }
       return aUDIENCE;
    }
    public static void b(f2 p0,ClientContent$LiveStreamPackage p1,ClientContent$LiveVoicePartyPackageV2 p2,VoicePartyMicSeatLogger$InvitationDialogButtonType p3,int p4){
       VoicePartyMicSeatLogger voicePartyMi = VoicePartyMicSeatLogger.class;
       if (PatchProxy.isSupport(voicePartyMi)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, voicePartyMi, "2")) {
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ANCHOR_INVITE_MIC_AUTOMATION_SUBCARD";
       i3 oi3 = i3.f();
       oi3.d("btn_name", p3.name());
       oi3.d("relationship_type", VoicePartyMicSeatLogger.a(p4).name());
       oi3.d("invite_type", "MIC");
       n.b(p0, oi3);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       uContentPack.liveVoicePartyPackage = p2;
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public static void c(f2 p0,ClientContent$LiveStreamPackage p1,int p2){
       if (PatchProxy.isSupport(VoicePartyMicSeatLogger.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, VoicePartyMicSeatLogger.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "ANCHOR_INVITE_MIC_AUTOMATION_CARD";
       i3 oi3 = i3.f();
       oi3.d("relationship_type", VoicePartyMicSeatLogger.a(p2).name());
       oi3.d("invite_type", "MIC");
       n.b(p0, oi3);
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveStreamPackage = p1;
       uContentPack.liveVoicePartyPackage = n.h(p0);
       u1.u0(4, uElementPack, uContentPack);
       return;
    }
}
