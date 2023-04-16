package com.kuaishou.live.core.voiceparty.playway.shared.service.LiveVoicePartyPlayViewServiceImpl$b;
import ie2.b;
import com.kuaishou.live.core.voiceparty.playway.shared.service.LiveVoicePartyPlayViewServiceImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import co2.f2;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import fu2.h;
import android.widget.FrameLayout;

public final class LiveVoicePartyPlayViewServiceImpl$b implements b	// class@001886
{
    public final LiveVoicePartyPlayViewServiceImpl a;

    public void LiveVoicePartyPlayViewServiceImpl$b(LiveVoicePartyPlayViewServiceImpl p0){
       this.a = p0;
       super();
    }
    public final void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveVoicePartyPlayViewServiceImpl$b.class, "1")) {
          return;
       }
       LiveVoicePartyPlayViewServiceImpl$b ta = this.a;
       ta.b = true;
       Objects.requireNonNull(ta);
       LiveVoicePartyPlayViewServiceImpl liveVoicePar = LiveVoicePartyPlayViewServiceImpl.class;
       if (!PatchProxy.applyVoid(objArray, ta, liveVoicePar, "5")) {
          int i = ta.d.h();
          b.Z(LiveLogTag.LIVE_VOICE_PARTY, "updatePlayViewTagIfNeed "+i);
          if (i) {
             Integer integer = Integer.valueOf(i);
             if (!PatchProxy.applyVoidOneRefs(integer, ta, liveVoicePar, "6")) {
                ta.f.setTag(h.e.a(), integer);
             }
          }else {
             ta.m();
          }
       }
       return;
    }
}
