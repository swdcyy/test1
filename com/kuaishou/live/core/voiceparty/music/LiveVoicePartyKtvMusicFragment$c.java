package com.kuaishou.live.core.voiceparty.music.LiveVoicePartyKtvMusicFragment$c;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyKtvMusicFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import java.lang.CharSequence;

public class LiveVoicePartyKtvMusicFragment$c implements Runnable	// class@0017c4
{
    public final int b;
    public final LiveVoicePartyKtvMusicFragment c;

    public void LiveVoicePartyKtvMusicFragment$c(LiveVoicePartyKtvMusicFragment p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyKtvMusicFragment$c.class, "1")) {
          return;
       }
       LiveVoicePartyKtvMusicFragment$c tb = this.b;
       if (tb == null) {
          this.c.J.setVisibility(8);
       }else if(tb > null){
          if (this.c.J.getVisibility()) {
             this.c.J.setVisibility(0);
          }
          this.c.J.setText(String.valueOf(this.b));
       }
       return;
    }
}
