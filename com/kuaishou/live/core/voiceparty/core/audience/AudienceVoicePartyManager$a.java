package com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager$a;
import com.kuaishou.live.core.voiceparty.core.shared.a$a;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager$a$c;
import java.lang.String;
import com.kwai.statechart.StateChart$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.statechart.a;
import java.util.Set;
import trd.d1;
import com.kuaishou.live.core.voiceparty.core.shared.MaybeAudioChatOpen;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager$a$a;
import ut7.o;
import com.kuaishou.live.core.voiceparty.core.shared.MaybeVideoChatOpen;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager$a$b;

public final class AudienceVoicePartyManager$a extends a$a	// class@00138b
{
    public final a j;
    public final AudienceVoicePartyManager k;

    public void AudienceVoicePartyManager$a(AudienceVoicePartyManager p0){
       this.k = p0;
       super(p0);
       this.j = new AudienceVoicePartyManager$a$c(this, "VoicePartyBlank");
    }
    public void a(StateChart$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceVoicePartyManager$a.class, "1")) {
          return;
       }
       a.p(p0, "builder");
       super.a(p0);
       a[] uoaArray = new a[]{this.i(),this.h()};
       StateChart$b uob = p0;
       uob.i("open_audio_chat", d1.u(uoaArray), this.b(), MaybeAudioChatOpen.class, AudienceVoicePartyManager$a$a.a);
       a[] uoaArray1 = new a[]{this.i(),this.b()};
       uob.i("open_video_chat", d1.u(uoaArray1), this.h(), MaybeVideoChatOpen.class, AudienceVoicePartyManager$a$b.a);
       return;
    }
    public a i(){
       return this.j;
    }
}
