package com.kuaishou.live.core.voiceparty.giftanimation.VoicePartyGiftAnimationView$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.voiceparty.giftanimation.VoicePartyGiftAnimationView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class VoicePartyGiftAnimationView$a extends AnimatorListenerAdapter	// class@0014f6
{
    public final VoicePartyGiftAnimationView a;

    public void VoicePartyGiftAnimationView$a(VoicePartyGiftAnimationView p0){
       this.a = p0;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyGiftAnimationView$a.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.a.b.setVisibility(0);
       return;
    }
}
