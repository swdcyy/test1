package com.yxcorp.gifshow.v3.previewer.ktv.j;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.v3.previewer.ktv.l;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.previewer.ktv.i;
import java.lang.Runnable;

public class j implements Animator$AnimatorListener	// class@0015c5
{
    public final l a;

    public void j(l p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       j ta = this.a;
       ta.b.setText(ta.y);
       ta = this.a;
       ta.b.postDelayed(new i(this), (long)ta.w);
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
    }
}
