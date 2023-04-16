package com.kuaishou.live.core.voiceparty.emoji.play.c$a;
import hc.c;
import com.kuaishou.live.core.voiceparty.emoji.play.c;
import hc.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.emoji.play.VoicePartyEmojiPlayInfo;
import vr2.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Runnable;
import ekd.k1;

public class c$a extends c	// class@0014e3
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       c b;
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.EMOJI, "Emoji Animation End");
       c$a ta = this.a;
       b = ta.b;
       int i = (b.mEmojiType == 2)? 1000: 500;
       k1.r(new b(ta.c, b), (long)i);
       return;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.EMOJI, "Emoji Animation Reset");
       return;
    }
}
