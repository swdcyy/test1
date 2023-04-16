package com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$i;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController;
import java.lang.String;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qu2.a;
import mw2.e;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import co2.f2;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyTheaterPackage;
import k2b.u1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import o07.o;

public final class VoicePartyTheaterAudiencePanelController$i implements PopupInterface$h	// class@0019f5
{
    public final VoicePartyTheaterAudiencePanelController b;
    public final String c;

    public void VoicePartyTheaterAudiencePanelController$i(VoicePartyTheaterAudiencePanelController p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterAudiencePanelController$i.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       VoicePartyTheaterAudiencePanelController$i tc = this.c;
       ClientContent$LiveStreamPackage liveStreamPa = this.b.o.a();
       VoicePartyTheaterAudiencePanelController p = this.b.p;
       if (!PatchProxy.applyVoidThreeRefs(tc, liveStreamPa, p, null, e.class, "13")) {
          try{
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PLAY_VIDEO_CREATE_POPUP";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("source", tc);
             uElementPack.params = jsonObject.toString();
             ClientContentWrapper$ContentWrapper uContentWrap = new ClientContentWrapper$ContentWrapper();
             uContentWrap.liveVoicePartyPackage = n.g(p);
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             uContentPack.liveVoicePartyTheaterPackage = e.b(p);
             u1.v0(10, uElementPack, uContentPack, uContentWrap);
          }catch(java.lang.Exception e9){
             b.I(LiveLogTag.LIVE_VOICE_PARTY, "logAudienceCreateTheaterDialogShowEvent failed", e9);
          }
       }
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(VoicePartyTheaterAudiencePanelController$i.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, VoicePartyTheaterAudiencePanelController$i.class, "2")) {
          return;
       }
       a.p(p0, "popup");
       p0.j = null;
       return;
    }
    public void J(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterAudiencePanelController$i.class, "3")) {
          return;
       }
       a.p(p0, "popup");
       p0.j = null;
       return;
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
