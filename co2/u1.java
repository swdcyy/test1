package co2.u1;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import android.app.Activity;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.utility.n;
import android.util.Property;
import android.animation.ObjectAnimator;

public final class u1 implements PopupInterface$c	// class@0005b2
{
    public final Activity a;

    public void u1(Activity p0){
       this.a = p0;
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       int i = n.k(this.a);
       float[] uofloatArray = new float[]{(float)i,(float)(i - p0.getWidth())};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_X, uofloatArray);
       objectAnimat.setDuration(300);
       if (p1 != null) {
          objectAnimat.addListener(p1);
       }
       objectAnimat.start();
       return;
    }
}
