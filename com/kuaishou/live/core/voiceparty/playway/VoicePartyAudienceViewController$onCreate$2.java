package com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController$onCreate$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.core.voiceparty.playway.VoicePartyAudienceViewController;
import java.lang.Object;
import android.graphics.Rect;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mrd.a;

public final class VoicePartyAudienceViewController$onCreate$2 extends Lambda implements l	// class@001844
{
    public final VoicePartyAudienceViewController this$0;

    public void VoicePartyAudienceViewController$onCreate$2(VoicePartyAudienceViewController p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Rect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyAudienceViewController$onCreate$2.class, "1")) {
          return;
       }
       a.p(p0, "it");
       this.this$0.A.onNext(p0);
       return;
    }
}
