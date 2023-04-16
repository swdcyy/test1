package com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView$a;
import com.kuaishou.live.core.voiceparty.clipmusic.a;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveClipLyricsBar;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import android.widget.RelativeLayout;

public class LiveVoicePartyLyricClipView$a extends a	// class@00137c
{
    public final LiveVoicePartyLyricClipView f;

    public void LiveVoicePartyLyricClipView$a(LiveVoicePartyLyricClipView p0,LiveVoicePartyLyricClipView p1,LiveClipLyricsBar p2){
       this.f = p0;
       super(p1, p2);
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyLyricClipView$a.class, "2")) {
          return;
       }
       super.b();
       this.f.d.setNeedScrollWithLyric(true);
       this.f.d();
       return;
    }
    public void e(float p0){
       LiveVoicePartyLyricClipView$a uoa = LiveVoicePartyLyricClipView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.f;
       uoa.i = p0 - (float)(uoa.c.getHeight() / 2);
       LiveVoicePartyLyricClipView$a tf = this.f;
       LiveVoicePartyLyricClipView i = tf.i;
       LiveVoicePartyLyricClipView l = tf.l;
       if (i - (tf.j - (float)l) > 0) {
          float f = i + (float)l;
          tf.j = f;
          LiveVoicePartyLyricClipView d = tf.d;
          d.b(((f - (float)d.getHeight()) - (float)this.f.k));
          this.f.d.setNeedScrollWithLyric(false);
       }else {
          tf.d.setNeedScrollWithLyric(true);
       }
       return;
    }
}
