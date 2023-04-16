package com.yxcorp.gifshow.activity.share.presenter.w2$o;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.activity.share.presenter.w2;
import android.widget.RelativeLayout$LayoutParams;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class w2$o implements Animator$AnimatorListener	// class@001450
{
    public final RelativeLayout$LayoutParams a;
    public final int b;
    public final int c;
    public final w2 d;

    public void w2$o(w2 p0,RelativeLayout$LayoutParams p1,int p2,int p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w2$o.class, "2")) {
          return;
       }
       ConstraintLayout$LayoutParams layoutParams = this.d.D.getLayoutParams();
       layoutParams.i = this.d.F.getId();
       layoutParams.h = -1;
       w2$o td = this.d;
       layoutParams.topMargin = td.Y0;
       td.D.setLayoutParams(layoutParams);
       w2$o ta = this.a;
       ta.height = this.b + this.c;
       this.d.y.setLayoutParams(ta);
       ta = this.d;
       ta.m1 = this.b + this.c;
       ta.k1 = null;
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, w2$o.class, "1")) {
          return;
       }
       ConstraintLayout$LayoutParams layoutParams = this.d.D.getLayoutParams();
       layoutParams.i = this.d.F.getId();
       layoutParams.h = -1;
       w2$o td = this.d;
       layoutParams.topMargin = td.Y0;
       td.D.setLayoutParams(layoutParams);
       w2$o ta = this.a;
       ta.height = this.b + this.c;
       this.d.y.setLayoutParams(ta);
       ta.k1 = null;
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
