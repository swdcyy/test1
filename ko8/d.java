package ko8.d;
import ko8.d$a;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Long;
import android.view.ViewGroup;
import ko8.d$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import ko8.d$c;
import android.animation.Animator$AnimatorListener;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;

public class d	// class@002bd8
{
    public ValueAnimator a;
    public boolean b;
    public ViewPager2 c;
    public Interpolator d;
    public static final Interpolator e;

    static {
       d.e = new d$a();
    }
    public void d(ViewPager2 p0){
       super();
       this.c = p0;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       d ta = this.a;
       if (ta != null && ta.isRunning()) {
          this.a.cancel();
          this.a = null;
       }
       return;
    }
    public void b(int p0,boolean p1,long p2,boolean p3){
       int width;
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Long.valueOf(p2), Boolean.valueOf(p3), this, d.class, "1")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       this.a();
       if (!p1 || p2 - null <= 0) {
          d tc = this.c;
          if (tc != null) {
             tc.m(p0, p1);
          }
          return;
       }else {
          int i = -1;
          d tc1 = this.c;
          if (tc1 != null) {
             i = tc1.getCurrentItem();
             width = (!this.c.getOrientation())? this.c.getWidth(): this.c.getHeight();
             width = i;
             i = width;
          }else {
             width = 0;
          }
          if (i > 0 && width != p0) {
             int[] ointArray = new int[]{0,i * (p0 - width)};
             ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
             this.a = valueAnimato;
             valueAnimato.addUpdateListener(new d$b(this));
             valueAnimato.addListener(new d$c(this));
             if (p3) {
                if (this.d == null) {
                   this.d = new LinearInterpolator();
                }
                valueAnimato.setInterpolator(this.d);
             }else {
                valueAnimato.setInterpolator(d.e);
             }
             valueAnimato.setDuration(p2);
             valueAnimato.start();
          }
          return;
       }
    }
    public void c(){
       this.b = true;
    }
}
