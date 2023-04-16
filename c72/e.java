package c72.e;
import c72.a;
import android.view.View;
import com.kwai.library.widget.specific.misc.CircleWithStrokeView;
import java.lang.Object;
import lnc.a1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import c72.d;
import android.animation.Animator$AnimatorListener;

public class e implements a	// class@0004dc
{
    public final long a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public AnimatorSet g;
    public Animator$AnimatorListener h;
    public View i;
    public CircleWithStrokeView j;

    public void e(View p0,CircleWithStrokeView p1){
       super();
       long l = 830;
       this.a = l;
       this.b = 0x3f800000;
       this.c = 0x3f4ccccd;
       float f = (float)a1.e(18.00f);
       this.d = f;
       float f1 = (float)a1.e(25.00f);
       this.e = f1;
       float f2 = 2.00f;
       float f3 = (float)a1.e(f2);
       this.f = f3;
       this.i = p0;
       this.j = p1;
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
       }else {
          this.g = new AnimatorSet();
          float[] uofloatArray = new float[]{f - (f3 / f2),f1};
          uofloatArray = new float[]{f3,0};
          this.g.setDuration(l);
          this.g.setInterpolator(new LinearInterpolator());
          Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(this.i, "scaleX", new float[3]{0x3f800000,0x3f4ccccd,0x3f800000}),ObjectAnimator.ofFloat(this.i, "scaleY", new float[3]{0x3f800000,0x3f4ccccd,0x3f800000}),ObjectAnimator.ofFloat(this.j, "radius", uofloatArray),ObjectAnimator.ofFloat(this.j, "strokeWidth", uofloatArray),j.a(this.j, new float[2]{0x3f800000,0})};
          this.g.playTogether(uAnimatorArr);
          this.h = new d(this);
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       e tg = this.g;
       if (tg != null && this.h != null) {
          tg.removeAllListeners();
          this.g.addListener(this.h);
          this.g.start();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       e tg = this.g;
       if (tg != null) {
          tg.removeAllListeners();
          this.g.cancel();
       }
       return;
    }
}
