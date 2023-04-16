package com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$d;
import ee3.f;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import n91.f;

public final class LivePreviewVoicePartyLogic$d implements f	// class@001905
{
    public final LivePreviewVoicePartyLogic a;

    public void LivePreviewVoicePartyLogic$d(LivePreviewVoicePartyLogic p0){
       this.a = p0;
       super();
    }
    public final long a(){
       Object obj = PatchProxy.apply(null, this, LivePreviewVoicePartyLogic$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.h().s();
    }
}
