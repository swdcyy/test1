package com.kuaishou.live.core.voiceparty.customview.LiveVoicePartyApplaudAnimationView$b;
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

public class LiveVoicePartyApplaudAnimationView$b extends AnimatorListenerAdapter	// class@0014aa
{
    public final View a;
    public final float b;
    public final float c;
    public final int d;
    public final LiveVoicePartyApplaudAnimationView e;

    public void LiveVoicePartyApplaudAnimationView$b(LiveVoicePartyApplaudAnimationView p0,View p1,float p2,float p3,int p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyApplaudAnimationView$b.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.setVisibility(4);
       this.a.setAlpha(0x3f800000);
       this.a.setScaleX(0x3f800000);
       this.a.setScaleY(0x3f800000);
       this.a.setX(this.b);
       this.a.setY(this.c);
       this.e.e.set((this.d / 200), Boolean.FALSE);
       return;
    }
}
