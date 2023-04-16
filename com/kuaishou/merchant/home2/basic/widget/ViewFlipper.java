package com.kuaishou.merchant.home2.basic.widget.ViewFlipper;
import android.widget.ViewFlipper;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.animation.Animation;
import android.widget.ViewAnimator;
import com.kuaishou.merchant.home2.basic.widget.ViewFlipper$a;
import android.view.animation.Animation$AnimationListener;
import android.view.View;

public class ViewFlipper extends ViewFlipper	// class@0016f6
{

    public void ViewFlipper(Context p0){
       super(p0);
    }
    public void ViewFlipper(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public int getDisappearingChild(){
       Object obj = PatchProxy.apply(null, this, ViewFlipper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int displayedChi = this.getDisplayedChild();
       int i = -1;
       if (displayedChi <= 0) {
          if (!displayedChi) {
             displayedChi = this.getChildCount();
          }else {
          label_0025 :
             return i;
          }
       }
       i = displayedChi - 1;
       goto label_0025 ;
    }
    public void setOutAnimation(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewFlipper.class, "1")) {
          return;
       }
       super.setOutAnimation(p0);
       if (this.getOutAnimation() != null) {
          this.getOutAnimation().setAnimationListener(new ViewFlipper$a(this));
       }
       return;
    }
    public void showNext(){
       if (PatchProxy.applyVoid(null, this, ViewFlipper.class, "2")) {
          return;
       }
       super.showNext();
       int disappearing = this.getDisappearingChild();
       if (disappearing >= 0) {
          this.getChildAt(disappearing).setVisibility(0);
       }
       return;
    }
}
