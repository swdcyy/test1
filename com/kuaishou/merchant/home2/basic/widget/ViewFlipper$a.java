package com.kuaishou.merchant.home2.basic.widget.ViewFlipper$a;
import android.view.animation.Animation$AnimationListener;
import com.kuaishou.merchant.home2.basic.widget.ViewFlipper;
import java.lang.Object;
import android.view.animation.Animation;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.ViewFlipper;

public class ViewFlipper$a implements Animation$AnimationListener	// class@0016f5
{
    public final ViewFlipper b;

    public void ViewFlipper$a(ViewFlipper p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ViewFlipper$a.class, "1")) {
          return;
       }
       if (this.b.getDisappearingChild() >= 0) {
          ViewFlipper$a tb = this.b;
          tb.getChildAt(tb.getDisappearingChild()).setVisibility(8);
       }
       return;
    }
    public void onAnimationRepeat(Animation p0){
    }
    public void onAnimationStart(Animation p0){
    }
}
