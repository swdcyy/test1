package com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView$c;
import com.kwai.library.widget.scrollview.ScrollViewEx$c;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveVoicePartyLyricClipView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.clipmusic.LiveClipLyricsBar;

public class LiveVoicePartyLyricClipView$c implements ScrollViewEx$c	// class@00137e
{
    public final LiveVoicePartyLyricClipView a;

    public void LiveVoicePartyLyricClipView$c(LiveVoicePartyLyricClipView p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       LiveVoicePartyLyricClipView$c uoc = LiveVoicePartyLyricClipView$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       uoc = this.a;
       uoc.k = p0;
       float f = (float)(p0 - uoc.k);
       uoc.c.c(f);
       this.a.d.c(f);
       return;
    }
}
