package b27.i;
import com.kwai.library.widget.specific.misc.PlayBackView$a;
import com.kwai.library.widget.specific.misc.PlayBackView;
import java.lang.Object;
import java.util.Objects;
import android.view.animation.RotateAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;

public final class i implements PlayBackView$a	// class@0003bf
{
    public final PlayBackView a;

    public void i(PlayBackView p0){
       this.a = p0;
    }
    public final void a(boolean p0){
       i ta = this.a;
       Objects.requireNonNull(ta);
       if (p0) {
          RotateAnimation rotateAnimat = new RotateAnimation(0, 360.00f, 1, 0x3f000000, 1, 0x3f000000);
          p0.setDuration(800);
          p0.setRepeatCount(-1);
          p0.setInterpolator(new LinearInterpolator());
          ta.c.startAnimation(p0);
       }else {
          ta.c.clearAnimation();
       }
       return;
    }
}
