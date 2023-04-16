package com.kuaishou.live.playback.play.LivePlaybackAnimationIconView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.drawee.view.DraweeView;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import java.lang.Float;
import android.view.animation.AccelerateInterpolator;
import android.animation.TimeInterpolator;
import com.kuaishou.live.playback.play.a;
import java.lang.Runnable;
import java.lang.Integer;

public class LivePlaybackAnimationIconView extends KwaiImageView	// class@000d2b
{
    public boolean x;
    public static final int y;

    public void LivePlaybackAnimationIconView(Context p0){
       super(p0, null, 0);
    }
    public void LivePlaybackAnimationIconView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LivePlaybackAnimationIconView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LivePlaybackAnimationIconView.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       this.animate().cancel();
       return;
    }
    public final void p0(float p0){
       if (PatchProxy.isSupport(LivePlaybackAnimationIconView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LivePlaybackAnimationIconView.class, "5")) {
          return;
       }
       this.setScaleX(p0);
       this.setScaleY(p0);
       this.setPivotX(((float)this.getWidth() / 2.00f));
       this.setPivotY(((float)this.getHeight() / 2.00f));
       return;
    }
    public final void q0(){
       if (PatchProxy.applyVoid(null, this, LivePlaybackAnimationIconView.class, "3")) {
          return;
       }
       this.p0(0x3f800000);
       this.animate().withLayer().scaleX(0x3f99999a).scaleY(0x3f99999a).setDuration(500).setInterpolator(new AccelerateInterpolator()).withEndAction(new a(this)).start();
       return;
    }
    public void r0(){
       if (PatchProxy.applyVoid(null, this, LivePlaybackAnimationIconView.class, "1")) {
          return;
       }
       this.x = true;
       this.q0();
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, LivePlaybackAnimationIconView.class, "2")) {
          return;
       }
       this.animate().cancel();
       this.x = false;
       this.p0(0x3f800000);
       return;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(LivePlaybackAnimationIconView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePlaybackAnimationIconView.class, "6")) {
          return;
       }
       if (p0 == this.getVisibility()) {
          return;
       }
       super.setVisibility(p0);
       if (p0) {
          this.animate().cancel();
       }else if(this.x != null){
          this.r0();
       }
       return;
    }
}
