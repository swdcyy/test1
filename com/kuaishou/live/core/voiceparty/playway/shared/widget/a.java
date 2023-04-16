package com.kuaishou.live.core.voiceparty.playway.shared.widget.a;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.VoicePartyHatView$b;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.VoicePartyHatView;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class a extends VoicePartyHatView$b	// class@0018a3
{
    public final VoicePartyHatView a;

    public void a(VoicePartyHatView p0){
       this.a = p0;
       super(null);
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       this.a.s0();
       return;
    }
}
