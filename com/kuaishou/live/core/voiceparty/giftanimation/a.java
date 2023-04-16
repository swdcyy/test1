package com.kuaishou.live.core.voiceparty.giftanimation.a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.voiceparty.giftanimation.VoicePartyGiftAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.voiceparty.giftanimation.VoicePartyGiftAnimationView$c;

public class a extends AnimatorListenerAdapter	// class@0014fa
{
    public final VoicePartyGiftAnimationView a;

    public void a(VoicePartyGiftAnimationView p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.onAnimationCancel(p0);
       a ta = this.a;
       ta.e = false;
       ta.b.setVisibility(8);
       this.a.b.setImageDrawable(null);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       a ta = this.a;
       ta.e = false;
       ta.b.setVisibility(8);
       this.a.b.setImageDrawable(null);
       VoicePartyGiftAnimationView d = this.a.d;
       if (d != null) {
          d.a();
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       super.onAnimationStart(p0);
       p0.e = true;
       return;
    }
}
