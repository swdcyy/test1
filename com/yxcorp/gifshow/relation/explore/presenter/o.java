package com.yxcorp.gifshow.relation.explore.presenter.o;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.relation.explore.presenter.n;
import android.widget.ImageView;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import hac.y0;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import java.lang.Runnable;
import hcc.b;

public class o implements Animator$AnimatorListener	// class@00185c
{
    public final ImageView a;
    public final n b;

    public void o(n p0,ImageView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       p0.f1 = false;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       o tb = this.b;
       tb.f1 = false;
       n e1 = tb.e1;
       if (e1 == null || !e1.isRunning()) {
          tb = this.b;
          tb.e1 = b.b(tb.V0, tb.Z0, 2, new y0(this, this.a));
          e1 = this.b.e1;
          if (e1 != null) {
             e1.start();
          }
       }
       return;
    }
    public void onAnimationRepeat(Animator p0){
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       o tb = this.b;
       tb.f1 = true;
       tb.q9();
       return;
    }
}
