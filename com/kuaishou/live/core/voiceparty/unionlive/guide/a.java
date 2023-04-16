package com.kuaishou.live.core.voiceparty.unionlive.guide.a;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.unionlive.guide.VoicePartyUnionGuideBreathTextView;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import nx2.a;

public final class a implements Runnable	// class@001a52
{
    public final VoicePartyUnionGuideBreathTextView b;

    public void a(VoicePartyUnionGuideBreathTextView p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, VoicePartyUnionGuideBreathTextView.class, "4")) {
       }else {
          tb.r(0x3f99999a);
          tb.animate().withLayer().scaleX(0x3f800000).scaleY(0x3f800000).setDuration(500).setInterpolator(new DecelerateInterpolator()).withEndAction(new a(tb)).start();
       }
       return;
    }
}
