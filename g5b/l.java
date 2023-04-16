package g5b.l;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.magic.ui.magicemoji.seekbar.MagicSeekbarSwitcher;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.util.Objects;

public final class l implements ValueAnimator$AnimatorUpdateListener	// class@002a86
{
    public final MagicSeekbarSwitcher a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public void l(MagicSeekbarSwitcher p0,int p1,int p2,float p3,float p4,int p5,float p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p5;
       this.e = p6;
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       l ta = this.a;
       Objects.requireNonNull(ta);
       ta.R(p0.getAnimatedFraction(), this.b, this.c, 0x3f800000, 0x3f800000, (float)this.d, this.e, true);
    }
}
