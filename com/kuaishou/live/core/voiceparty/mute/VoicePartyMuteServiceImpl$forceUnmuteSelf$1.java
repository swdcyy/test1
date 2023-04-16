package com.kuaishou.live.core.voiceparty.mute.VoicePartyMuteServiceImpl$forceUnmuteSelf$1;
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

public final class VoicePartyMuteServiceImpl$forceUnmuteSelf$1 extends Lambda implements a	// class@0017fb
{
    public final boolean $unMute;
    public final VoicePartyMuteServiceImpl this$0;

    public void VoicePartyMuteServiceImpl$forceUnmuteSelf$1(VoicePartyMuteServiceImpl p0,boolean p1){
       this.this$0 = p0;
       this.$unMute = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, VoicePartyMuteServiceImpl$forceUnmuteSelf$1.class, "1")) {
          return;
       }
       if (this.$unMute != null) {
          this.this$0.R().g = false;
          this.this$0.P(MuteState.ForceUnMute);
       }else {
          this.this$0.R().g = this.this$0.a();
          VoicePartyMuteServiceImpl$forceUnmuteSelf$1 tthis$0 = this.this$0;
          MuteState mute = (tthis$0.a())? MuteState.Mute: MuteState.UnMute;
          tthis$0.P(mute);
       }
       return;
    }
}
