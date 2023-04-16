package com.kuaishou.live.core.voiceparty.giftanimation.VoicePartyGiftAnimationView$b;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.voiceparty.giftanimation.VoicePartyGiftAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class VoicePartyGiftAnimationView$b extends AnimatorListenerAdapter	// class@0014f7
{
    public final VoicePartyGiftAnimationView a;

    public void VoicePartyGiftAnimationView$b(VoicePartyGiftAnimationView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyGiftAnimationView$b.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.b.setVisibility(8);
       return;
    }
}
