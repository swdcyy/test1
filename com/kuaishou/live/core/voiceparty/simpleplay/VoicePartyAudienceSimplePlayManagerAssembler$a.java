package com.kuaishou.live.core.voiceparty.simpleplay.VoicePartyAudienceSimplePlayManagerAssembler$a;
import zo2.p0;
import com.kuaishou.live.core.voiceparty.simpleplay.VoicePartyAudienceSimplePlayManagerAssembler;
import java.lang.Object;
import hp2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import k2b.e0;
import qu2.a;
import hp2.c$c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import msd.a;
import xs2.m;
import co2.f2;
import co2.q1;

public final class VoicePartyAudienceSimplePlayManagerAssembler$a implements p0	// class@00190d
{
    public final VoicePartyAudienceSimplePlayManagerAssembler a;

    public void VoicePartyAudienceSimplePlayManagerAssembler$a(VoicePartyAudienceSimplePlayManagerAssembler p0){
       this.a = p0;
       super();
    }
    public void a(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyAudienceSimplePlayManagerAssembler$a.class, "1")) {
          return;
       }
       a.p(p0, "closeReason");
       e0 uoe0 = this.a.g.c();
       VoicePartyAudienceSimplePlayManagerAssembler f = this.a.f;
       int i = (a.g(p0, c$c.d))? 2: 1;
       q1.o(uoe0, f, i, this.a.g.a(), this.a.k.invoke());
       return;
    }
    public void b(){
    }
}
