package com.kuaishou.live.core.show.luckystar.widget.LiveLuckyStarParticipateButton;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import java.lang.Boolean;

public class LiveLuckyStarParticipateButton extends FrameLayout	// class@000d11
{
    public KwaiImageView b;
    public TextView c;
    public LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo d;
    public ValueAnimator e;
    public static final int f;

    public void LiveLuckyStarParticipateButton(Context p0){
       super(p0, null);
    }
    public void LiveLuckyStarParticipateButton(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveLuckyStarParticipateButton(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, LiveLuckyStarParticipateButton.class, "8")) {
          return;
       }
       LiveLuckyStarParticipateButton te = this.e;
       if (te != null) {
          te.removeAllListeners();
          this.e.cancel();
          this.e = null;
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveLuckyStarParticipateButton.class, "6")) {
          return;
       }
       float f = 0x3f800000;
       LiveLuckyStarParticipateButton td = this.d;
       int i = 1;
       if (td == null || td.mDisplayStyle != i) {
          i = 0;
       }
       if (i && (!this.isActivated() || this.isPressed())) {
          f = 0x3f19999a;
       }
       this.setAlpha(f);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveLuckyStarParticipateButton.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       this.a();
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveLuckyStarParticipateButton.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.findViewById(0x7f0a213c);
       this.c = this.findViewById(0x7f0a213e);
       return;
    }
    public void setActivated(boolean p0){
       if (PatchProxy.isSupport(LiveLuckyStarParticipateButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveLuckyStarParticipateButton.class, "4")) {
          return;
       }
       super.setActivated(p0);
       this.b();
       return;
    }
    public void setPressed(boolean p0){
       if (PatchProxy.isSupport(LiveLuckyStarParticipateButton.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveLuckyStarParticipateButton.class, "5")) {
          return;
       }
       super.setPressed(p0);
       this.b();
       return;
    }
}
