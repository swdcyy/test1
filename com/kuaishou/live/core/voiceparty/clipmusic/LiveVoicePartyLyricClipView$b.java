package com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView$b;
import com.kuaishou.live.core.voiceparty.clipmusic.a;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveClipLyricsBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import android.widget.RelativeLayout;

public class LiveVoicePartyLyricClipView$b extends a	// class@00137d
{
    public final LiveVoicePartyLyricClipView f;

    public void LiveVoicePartyLyricClipView$b(LiveVoicePartyLyricClipView p0,LiveVoicePartyLyricClipView p1,LiveClipLyricsBar p2){
       this.f = p0;
       super(p1, p2);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyLyricClipView$b.class, "2")) {
          return;
       }
       super.b();
       this.f.c.setNeedScrollWithLyric(true);
       this.f.d();
       return;
    }
    public void e(float p0){
       LiveVoicePartyLyricClipView$b uob = LiveVoicePartyLyricClipView$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.f;
       uob.j = p0 + (float)(uob.c.getHeight() / 2);
       LiveVoicePartyLyricClipView$b tf = this.f;
       LiveVoicePartyLyricClipView j = tf.j;
       LiveVoicePartyLyricClipView l = tf.l;
       if (j - (tf.i + (float)l) < 0) {
          float f = j - (float)l;
          tf.i = f;
          tf.c.b((f - (float)tf.k));
          this.f.c.setNeedScrollWithLyric(false);
       }else {
          tf.c.setNeedScrollWithLyric(true);
       }
       return;
    }
}
