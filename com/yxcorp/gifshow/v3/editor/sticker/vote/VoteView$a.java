package com.yxcorp.gifshow.v3.editor.sticker.vote.VoteView$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import java.util.Objects;
import java.lang.Boolean;
import lnc.q4;
import android.widget.ProgressBar;
import android.animation.ValueAnimator;
import vtc.i;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.FrameLayout;

public class VoteView$a extends AnimatorListenerAdapter	// class@0012c9
{
    public final boolean a;
    public final VoteView b;

    public void VoteView$a(VoteView p0,boolean p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoteView$a.class, "2")) {
          return;
       }
       this.b.k.setVisibility(8);
       VoteView$a tb = this.b;
       VoteView$a ta = this.a;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(VoteView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(ta), tb, VoteView.class, "10")) {
          VoteView y = tb.y;
          double d = (double)(tb.z + y);
          double d1 = 0;
          if (d - d1 > 0) {
             d1 = q4.c(2, ((double)y / d));
          }
          int[] ointArray = new int[]{tb.s.getProgress(),(int)(d1 * (double)tb.s.getMax())};
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          long l = (ta != null)? 400: 0;
          valueAnimato.setDuration(l);
          valueAnimato.addUpdateListener(new i(tb));
          valueAnimato.start();
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoteView$a.class, "1")) {
          return;
       }
       VoteView$a tb = this.b;
       if (tb.B != null) {
          RelativeLayout$LayoutParams layoutParams = tb.q.getLayoutParams();
          layoutParams.addRule(3, this.b.x.getId());
          this.b.q.setLayoutParams(layoutParams);
       }
       return;
    }
}
