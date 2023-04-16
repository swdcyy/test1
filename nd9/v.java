package nd9.v;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import nd9.x;
import android.animation.Animator$AnimatorListener;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import kotlin.jvm.internal.a;
import th0.e;
import android.animation.TimeInterpolator;

public final class v implements PopupInterface$c	// class@00315a
{
    public final x a;
    public final Animator$AnimatorListener b;

    public void v(x p0,Animator$AnimatorListener p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, v.class, "1")) {
          return;
       }
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f4ccccd,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f4ccccd,0x3f800000})};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       a.o(objectAnimat, "ObjectAnimator.ofPropert¡­alueHolder, yValueHolder\)");
       objectAnimat.setDuration(this.a.a);
       objectAnimat.setInterpolator(new e());
       v tb = this.b;
       if (tb != null) {
          objectAnimat.addListener(tb);
       }
       if (p1 != null) {
          objectAnimat.addListener(p1);
       }
       this.a.d(p0);
       objectAnimat.start();
       return;
    }
}
