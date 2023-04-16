package com.kuaishou.live.core.voiceparty.emoji.play.c;
import android.animation.AnimatorListenerAdapter;
import hc.a;
import com.kuaishou.live.core.voiceparty.emoji.play.VoicePartyEmojiPlayInfo;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dc.a;
import com.kuaishou.live.core.voiceparty.emoji.play.d;
import com.kuaishou.live.core.voiceparty.emoji.play.c$a;
import hc.b;

public class c extends AnimatorListenerAdapter	// class@0014e4
{
    public final a a;
    public final VoicePartyEmojiPlayInfo b;
    public final KwaiImageView c;

    public void c(a p0,VoicePartyEmojiPlayInfo p1,KwaiImageView p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c ta = this.a;
       ta.k(d.b(ta));
       this.a.l(new c$a(this));
       this.a.start();
       return;
    }
}
