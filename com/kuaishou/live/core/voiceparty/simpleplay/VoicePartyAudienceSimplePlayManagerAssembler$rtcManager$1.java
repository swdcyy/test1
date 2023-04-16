package com.kuaishou.live.core.voiceparty.simpleplay.VoicePartyAudienceSimplePlayManagerAssembler$rtcManager$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.aryainstance.config.SnowConfig;
import jw4.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import pv2.f;

public final class VoicePartyAudienceSimplePlayManagerAssembler$rtcManager$1 extends Lambda implements p	// class@001910
{
    public static final VoicePartyAudienceSimplePlayManagerAssembler$rtcManager$1 INSTANCE;

    static {
       VoicePartyAudienceSimplePlayManagerAssembler$rtcManager$1.INSTANCE = new VoicePartyAudienceSimplePlayManagerAssembler$rtcManager$1();
    }
    public void VoicePartyAudienceSimplePlayManagerAssembler$rtcManager$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final a invoke(String p0,SnowConfig p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, VoicePartyAudienceSimplePlayManagerAssembler$rtcManager$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "aryaSign");
       a.p(p1, "config");
       return new f();
    }
}
