package com.kuaishou.live.core.voiceparty.theater.tube.tab.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.theater.tube.tab.VoicePartyTheaterTubeTabFragment$c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.theater.tube.tab.VoicePartyTheaterTubeTabFragment;

public final class a implements View$OnClickListener	// class@001a3f
{
    public final VoicePartyTheaterTubeTabFragment$c b;

    public void a(VoicePartyTheaterTubeTabFragment$c p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a tb = this.b;
       tb.b.ch(tb.c);
       return;
    }
}
