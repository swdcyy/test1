package com.yxcorp.gifshow.ad.util.i$b;
import ekd.f$j;
import android.view.View;
import com.yxcorp.gifshow.ad.util.i$c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.util.i;
import java.lang.Long;
import java.lang.Integer;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;
import g59.e0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.ad.util.j;
import android.animation.Animator$AnimatorListener;

public class i$b extends f$j	// class@001888
{
    public final View a;
    public final long b;
    public final int c;
    public final i$c d;

    public void i$b(View p0,long p1,int p2,i$c p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$b.class, "1")) {
          return;
       }
       i$b ta = this.a;
       i$b tb = this.b;
       i$b tc = this.c;
       i$b td = this.d;
       if (!PatchProxy.isSupport(i.class) || !PatchProxy.applyVoidFourRefs(ta, Long.valueOf(tb), Integer.valueOf(tc), td, null, i.class, "3")) {
          int[] ointArray = new int[]{tc,0};
          ValueAnimator valueAnimato = ObjectAnimator.ofInt(ointArray);
          valueAnimato.setDuration(tb);
          valueAnimato.addUpdateListener(new e0(ta));
          valueAnimato.addListener(new j(td));
          valueAnimato.start();
       }
       ta = this.d;
       if (ta != null) {
          ta.d();
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$b.class, "2")) {
          return;
       }
       i$b td = this.d;
       if (td != null) {
          td.b();
       }
       return;
    }
}
