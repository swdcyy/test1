package c72.f;
import c72.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.basic.widget.LiveKidLottieAnimationView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import c72.f$a;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.Animator;
import com.yxcorp.utility.n;
import com.airbnb.lottie.LottieAnimationView;

public class f implements a	// class@0004de
{
    public final long a;
    public final float b;
    public final float c;
    public AnimatorSet d;
    public final LiveKidLottieAnimationView e;
    public final KwaiImageView f;

    public void f(KwaiImageView p0,LiveKidLottieAnimationView p1){
       super();
       this.a = 1250;
       this.b = 0x3f666666;
       this.c = 0x3f800000;
       this.f = p0;
       this.e = p1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.b();
       this.d = new AnimatorSet();
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(this.f, View.SCALE_X, new float[3]{0x3f666666,0x3f800000,0x3f666666});
       objectAnimat.addListener(new f$a(this));
       objectAnimat.setRepeatCount(-1);
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(this.f, View.SCALE_Y, new float[3]{0x3f666666,0x3f800000,0x3f666666});
       objectAnimat1.setRepeatCount(-1);
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
       this.d.playTogether(uAnimatorArr);
       this.d.setDuration(1250);
       this.d.start();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       View[] viewArray = new View[]{this.e};
       n.Z(8, viewArray);
       f td = this.d;
       if (td != null && td.isRunning()) {
          this.d.cancel();
          this.d = null;
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       if (this.e.p()) {
          this.e.f();
       }
       return;
    }
}
