package kd9.f0;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.yxcorp.gifshow.camera.record.frame.l;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import java.util.Objects;
import android.util.Property;
import android.animation.ObjectAnimator;
import th0.d;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.camera.record.frame.k;

public final class f0 implements PopupInterface$c	// class@002c4f
{
    public final l a;
    public final boolean b;

    public void f0(l p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       f0 ta = this.a;
       f0 tb = this.b;
       Objects.requireNonNull(ta);
       Property aLPHA = View.ALPHA;
       float[] uofloatArray = new float[2];
       int i = 0;
       int i1 = (tb != null)? 0: 0x3f800000;
       uofloatArray[0] = i1;
       if (tb != null) {
          i = 0x3f800000;
       }
       uofloatArray[1] = i;
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, aLPHA, uofloatArray);
       objectAnimat.setDuration(300);
       objectAnimat.setInterpolator(new d());
       objectAnimat.addListener(new k(ta, tb));
       if (p1 != null) {
          objectAnimat.addListener(p1);
       }
       objectAnimat.start();
       return;
    }
}
