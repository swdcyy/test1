package bra.i;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cra.w;
import q87.c;
import ekd.k1;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import bra.i$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import bra.i$b;
import android.animation.Animator$AnimatorListener;

public final class i implements Runnable	// class@000437
{
    public final UnmuteTipView b;
    public final int c;

    public void i(UnmuteTipView p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       w.C().w("VolumeTipView", "start change anim", objArray);
       k1.m(this.b.P);
       ValueAnimator valueAnimato = ValueAnimator.ofInt(new int[2]{0,200});
       valueAnimato.setDuration((long)200);
       valueAnimato.setInterpolator(new LinearInterpolator());
       valueAnimato.addUpdateListener(new i$a(this));
       valueAnimato.addListener(new i$b(this));
       valueAnimato.start();
       return;
    }
}
