package g31.i;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.topbar.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.animation.Animator;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import d61.l;
import android.animation.TimeInterpolator;
import com.kuaishou.live.audience.component.topbar.d$b;
import android.animation.Animator$AnimatorListener;

public final class i implements Runnable	// class@002410
{
    public final d b;
    public final boolean c;

    public void i(d p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       ObjectAnimator objectAnimat;
       i tb = this.b;
       i tc = this.c;
       d p = tb.P;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          objectAnimat = PatchProxy.applyTwoRefs(p, Boolean.valueOf(tc), tb, uod, "14");
          if (objectAnimat != PatchProxyResult.class) {
          label_0057 :
             tb.R = objectAnimat;
             objectAnimat.start();
             return;
          }
       }
       long l = (tc != null)? 130: 250;
       float[] uofloatArray = new float[]{0,(float)(- tb.d9())};
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(p, View.TRANSLATION_X, uofloatArray);
       objectAnimat1.setDuration(l);
       objectAnimat1.setInterpolator(new l(0.40f, 0, 0x3f000000, 0x3f800000));
       objectAnimat1.addListener(new d$b(tb));
       objectAnimat = objectAnimat1;
       goto label_0057 ;
    }
}
