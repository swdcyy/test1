package com.kuaishou.live.core.voiceparty.mute.VoicePartyMuteServiceImpl$unmuteSelf$1;
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

public final class VoicePartyMuteServiceImpl$unmuteSelf$1 extends Lambda implements a	// class@0017fd
{
    public final VoicePartyMuteServiceImpl this$0;

    public void VoicePartyMuteServiceImpl$unmuteSelf$1(VoicePartyMuteServiceImpl p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, VoicePartyMuteServiceImpl$unmuteSelf$1.class, "1")) {
          return;
       }
       VoicePartyMuteServiceImpl$unmuteSelf$1 tthis$0 = this.this$0;
       tthis$0.e = false;
       tthis$0.R().g = false;
       this.this$0.P(MuteState.UnMute);
       return;
    }
}
