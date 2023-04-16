package com.kuaishou.live.core.voiceparty.unionlive.guide.VoicePartyUnionGuideBreathTextView;
import com.yxcorp.plugin.live.widget.LiveMediumTextView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import android.view.animation.AccelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.live.core.voiceparty.unionlive.guide.a;
import java.lang.Runnable;
import android.view.View;
import java.lang.Float;

public class VoicePartyUnionGuideBreathTextView extends LiveMediumTextView	// class@001a51
{
    public static final int g;

    public void VoicePartyUnionGuideBreathTextView(Context p0){
       super(p0, null, 0);
    }
    public void VoicePartyUnionGuideBreathTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void VoicePartyUnionGuideBreathTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public static void q(VoicePartyUnionGuideBreathTextView p0){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoid(null, p0, VoicePartyUnionGuideBreathTextView.class, "3")) {
       }else {
          p0.r(0x3f800000);
          p0.animate().withLayer().scaleX(0x3f99999a).scaleY(0x3f99999a).setDuration(500).setInterpolator(new AccelerateInterpolator()).withEndAction(new a(p0)).start();
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, VoicePartyUnionGuideBreathTextView.class, "6")) {
          return;
       }
       super.onDetachedFromWindow();
       this.animate().cancel();
       return;
    }
    public final void r(float p0){
       if (PatchProxy.isSupport(VoicePartyUnionGuideBreathTextView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, VoicePartyUnionGuideBreathTextView.class, "5")) {
          return;
       }
       this.setScaleX(p0);
       this.setScaleY(p0);
       this.setPivotX(((float)this.getWidth() / 2.00f));
       this.setPivotY(((float)this.getHeight() / 2.00f));
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, VoicePartyUnionGuideBreathTextView.class, "2")) {
          return;
       }
       this.animate().cancel();
       this.r(0x3f800000);
       return;
    }
}
