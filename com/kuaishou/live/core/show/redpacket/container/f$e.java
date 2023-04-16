package com.kuaishou.live.core.show.redpacket.container.f$e;
import com.kuaishou.live.core.show.redpacket.container.LiveRedPacketContainerDialogFragment$d;
import com.kuaishou.live.core.show.redpacket.container.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.container.i;
import lnc.c3$a;
import lnc.c3;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import uw1.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import java.util.Map;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import k2b.u1;
import java.lang.Boolean;
import rg2.b0;
import java.util.HashMap;

public class f$e implements LiveRedPacketContainerDialogFragment$d	// class@000e77
{
    public final f a;

    public void f$e(f p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$e.class, "3")) {
          return;
       }
       c3.c(this.a.H, i.a);
       BaseFragment uBaseFragmen = this.a.w.b();
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = this.a.w.y();
       ClientContent$LiveStreamPackage liveStreamPa = this.a.w.a();
       if (!PatchProxy.applyVoidFourRefs(uBaseFragmen, liveVoicePar, liveStreamPa, p0, null, i.class, "4")) {
          ClientContent$ContentPackage uContentPack = i.a(liveVoicePar, liveStreamPa);
          ClientContent$RedPackPackage redPackPacka = new ClientContent$RedPackPackage();
          uContentPack.redPackage = redPackPacka;
          redPackPacka.redPackId = p0;
          u1.L("", uBaseFragmen, 1, i.b("DRAW_PRIZE_ROLL_CLOSE_CLICK", null), uContentPack);
       }
       return;
    }
    public void b(String p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(f$e.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, f$e.class, "1")) {
          return;
       }
       c3.c(this.a.H, new b0(p0));
       if (!p2) {
          BaseFragment uBaseFragmen = this.a.w.b();
          ClientContent$LiveStreamPackage liveStreamPa = this.a.w.a();
          ClientContent$LiveVoicePartyPackageV2 liveVoicePar = this.a.w.y();
          if (!PatchProxy.isSupport(i.class) || !PatchProxy.applyVoidFourRefs(uBaseFragmen, liveStreamPa, liveVoicePar, Boolean.valueOf(p1), null, i.class, "2")) {
             ClientContent$ContentPackage uContentPack = i.a(liveVoicePar, liveStreamPa);
             HashMap hashMap = new HashMap();
             String str = (p1)? "SIDESLIP": "CLICK";
             hashMap.put("switch_type", str);
             u1.L("", uBaseFragmen, 1, i.b("SWITCH_RED_PACKET_CARD", hashMap), uContentPack);
          }
       }
       return;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$e.class, "2")) {
          return;
       }
       BaseFragment uBaseFragmen = this.a.w.b();
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = this.a.w.y();
       ClientContent$LiveStreamPackage liveStreamPa = this.a.w.a();
       if (!PatchProxy.applyVoidFourRefs(uBaseFragmen, liveVoicePar, liveStreamPa, p0, null, i.class, "3")) {
          HashMap hashMap = new HashMap();
          hashMap.put("sign_type", p0);
          u1.C0("", uBaseFragmen, 9, i.b("RED_PACKET_GUIDE_SIGN", hashMap), i.a(liveVoicePar, liveStreamPa));
       }
       return;
    }
}
