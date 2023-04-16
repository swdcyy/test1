package com.kuaishou.live.core.show.fansgroupv2.share.fragment.LiveAudienceFansGroupShareItemIconView;
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
import com.kuaishou.live.core.show.fansgroupv2.share.fragment.b;
import java.lang.Runnable;
import java.lang.Integer;

public class LiveAudienceFansGroupShareItemIconView extends KwaiImageView	// class@000b55
{
    public static final int x;

    public void LiveAudienceFansGroupShareItemIconView(Context p0){
       super(p0, null, 0);
    }
    public void LiveAudienceFansGroupShareItemIconView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudienceFansGroupShareItemIconView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceFansGroupShareItemIconView.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       this.animate().cancel();
       return;
    }
    public final void p0(float p0){
       if (PatchProxy.isSupport(LiveAudienceFansGroupShareItemIconView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveAudienceFansGroupShareItemIconView.class, "5")) {
          return;
       }
       this.setScaleX(p0);
       this.setScaleY(p0);
       return;
    }
    public void q0(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceFansGroupShareItemIconView.class, "1")) {
          return;
       }
       this.animate().cancel();
       this.r0();
       return;
    }
    public final void r0(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceFansGroupShareItemIconView.class, "3")) {
          return;
       }
       this.p0(0x3f800000);
       this.animate().withLayer().scaleX(0x3f99999a).scaleY(0x3f99999a).setDuration(500).setInterpolator(new AccelerateInterpolator()).withEndAction(new b(this)).start();
       return;
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceFansGroupShareItemIconView.class, "2")) {
          return;
       }
       this.animate().cancel();
       this.p0(0x3f800000);
       return;
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(LiveAudienceFansGroupShareItemIconView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveAudienceFansGroupShareItemIconView.class, "6")) {
          return;
       }
       if (p0 == this.getVisibility()) {
          return;
       }
       super.setVisibility(p0);
       if (!p0) {
          this.q0();
       }else {
          this.animate().cancel();
       }
       return;
    }
}
