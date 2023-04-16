package com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyApplaudAnimationView$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyApplaudAnimationView;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.ArrayList;

public class LiveVoicePartyApplaudAnimationView$a extends AnimatorListenerAdapter	// class@0014a9
{
    public final int a;
    public final View b;
    public final LiveVoicePartyApplaudAnimationView c;

    public void LiveVoicePartyApplaudAnimationView$a(LiveVoicePartyApplaudAnimationView p0,int p1,View p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyApplaudAnimationView$a.class, "1")) {
          return;
       }
       super.onAnimationStart(p0);
       this.c.e.set((this.a / 200), Boolean.TRUE);
       this.b.setVisibility(0);
       return;
    }
}
