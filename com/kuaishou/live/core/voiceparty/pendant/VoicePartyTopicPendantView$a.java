package com.kuaishou.live.core.voiceparty.pendant.VoicePartyTopicPendantView$a;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.pendant.VoicePartyTopicPendantView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.widget.MarqueeTextView;

public class VoicePartyTopicPendantView$a implements Runnable	// class@00180d
{
    public final VoicePartyTopicPendantView b;

    public void VoicePartyTopicPendantView$a(VoicePartyTopicPendantView p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTopicPendantView$a.class, "1")) {
          return;
       }
       this.b.e.onWindowFocusChanged(true);
       return;
    }
}
