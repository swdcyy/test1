package com.kuaishou.live.core.voiceparty.mute.VoicePartyMuteServiceImpl$muteSelf$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.mute.VoicePartyMuteServiceImpl;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import co2.f2;
import com.kuaishou.live.core.voiceparty.mute.MuteState;

public final class VoicePartyMuteServiceImpl$muteSelf$1 extends Lambda implements a	// class@0017fc
{
    public final VoicePartyMuteServiceImpl this$0;

    public void VoicePartyMuteServiceImpl$muteSelf$1(VoicePartyMuteServiceImpl p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, VoicePartyMuteServiceImpl$muteSelf$1.class, "1")) {
          return;
       }
       VoicePartyMuteServiceImpl$muteSelf$1 tthis$0 = this.this$0;
       tthis$0.e = true;
       tthis$0.R().g = true;
       this.this$0.P(MuteState.Mute);
       return;
    }
}
