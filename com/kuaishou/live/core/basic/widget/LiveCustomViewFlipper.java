package com.kuaishou.live.core.basic.widget.LiveCustomViewFlipper;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.ViewFlipper;
import d22.b;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import android.widget.ViewAnimator;
import android.view.animation.AnimationUtils;

public class LiveCustomViewFlipper extends LiveViewFlipper	// class@0008f9
{
    public Animation d;
    public Animation e;
    public static final int f;

    public void LiveCustomViewFlipper(Context p0){
       super(p0, null);
    }
    public void LiveCustomViewFlipper(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = this.getInAnimation();
       this.e = this.getOutAnimation();
       this.a(new b(this));
    }
    public void c(boolean p0){
       if (PatchProxy.isSupport(LiveCustomViewFlipper.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveCustomViewFlipper.class, "4")) {
          return;
       }
       if (!this.isFlipping()) {
          if (p0) {
             this.setInAnimation(null);
             this.setOutAnimation(null);
          }
          super.startFlipping();
       }
       return;
    }
    public void setInAnimation(Context p0,int p1){
       if (PatchProxy.isSupport(LiveCustomViewFlipper.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveCustomViewFlipper.class, "2")) {
          return;
       }
       super.setInAnimation(p0, p1);
       this.d = AnimationUtils.loadAnimation(p0, p1);
       return;
    }
    public void setOriginInAnimation(Animation p0){
       this.d = p0;
    }
    public void setOriginOutAnimation(Animation p0){
       this.e = p0;
    }
    public void setOutAnimation(Context p0,int p1){
       if (PatchProxy.isSupport(LiveCustomViewFlipper.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveCustomViewFlipper.class, "3")) {
          return;
       }
       super.setOutAnimation(p0, p1);
       this.e = AnimationUtils.loadAnimation(p0, p1);
       return;
    }
    public void startFlipping(){
       if (PatchProxy.applyVoid(null, this, LiveCustomViewFlipper.class, "1")) {
          return;
       }
       this.c(true);
       return;
    }
}
