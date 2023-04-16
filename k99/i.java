package k99.i;
import java.lang.Runnable;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.b;
import com.airbnb.lottie.LottieAnimationView;
import java.lang.Object;
import java.util.Objects;
import k99.j;
import android.animation.Animator$AnimatorListener;

public final class i implements Runnable	// class@002b82
{
    public final b b;
    public final LottieAnimationView c;

    public void i(b p0,LottieAnimationView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       i tb = this.b;
       i tc = this.c;
       Objects.requireNonNull(tb);
       tc.setSpeed(0x3fa66666);
       tc.a(new j(tb, tc));
       tc.s();
    }
}
