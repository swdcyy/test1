package com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler$a;
import zo2.p0;
import com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler;
import java.lang.Object;
import hp2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import t02.a0;
import k2b.e0;
import z12.x;
import hp2.c$c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import msd.a;
import xs2.m;
import co2.f2;
import co2.q1;
import tj3.k;
import tj3.e;
import java.lang.Long;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveVoicePartyPackage;
import yx2.n;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import java.lang.Integer;
import q2b.h$b;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class VoicePartyAudienceManagerAssembler$a implements p0	// class@001315
{
    public final VoicePartyAudienceManagerAssembler a;

    public void VoicePartyAudienceManagerAssembler$a(VoicePartyAudienceManagerAssembler p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyAudienceManagerAssembler$a.class, "1")) {
          return;
       }
       a.p(p0, "closeReason");
       e0 uoe0 = x.l(this.a.g);
       VoicePartyAudienceManagerAssembler f = this.a.f;
       int i = (a.g(p0, c$c.d))? 2: 1;
       a0 z2 = this.a.g.Z2;
       a.o(z2, "callerContext.mLiveBasicContext");
       q1.o(uoe0, f, i, z2.a(), this.a.k.invoke());
       return;
    }
    public void b(){
       h$b uob;
       ClientContentWrapper$ContentWrapper uContentWrap;
       ClientContent$ContentPackage uContentPack;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyAudienceManagerAssembler$a.class, "2")) {
          return;
       }
       VoicePartyAudienceManagerAssembler$a ta = this.a;
       VoicePartyAudienceManagerAssembler f = ta.f;
       a0 z2 = ta.g.Z2;
       a.o(z2, "callerContext.mLiveBasicContext");
       ClientContent$LiveStreamPackage liveStreamPa = z2.a();
       a0 d3 = this.a.g.d3;
       a.o(d3, "callerContext.mLiveLogReporter");
       k ok = d3.x();
       a.o(ok, "callerContext.mLiveLogReporter.qualityStatistics");
       long l = ok.M();
       if (!PatchProxy.isSupport(q1.class) || !PatchProxy.applyVoidThreeRefs(f, liveStreamPa, Long.valueOf(l), null, q1.class, "101")) {
          ClientContentWrapper$LiveVoicePartyPackage liveVoicePar = n.g(f);
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("start_time", Long.valueOf(l));
          uElementPack.params = jsonObject.toString();
          if (PatchProxy.isSupport(n.class)) {
             Object[] objArray1 = new Object[]{Integer.valueOf(10),"LIVE_VOICE_PARTY_TIME",liveVoicePar,liveStreamPa,uElementPack};
             if (!PatchProxy.applyVoid(objArray1, objArray, n.class, "21")) {
             }
          }else {
          }
       }
    label_00b5 :
       return;
    }
}
