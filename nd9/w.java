package nd9.w;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import nd9.x;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import kotlin.jvm.internal.a;
import th0.e;
import android.animation.TimeInterpolator;

public final class w implements PopupInterface$c	// class@00315b
{
    public final x a;

    public void w(x p0){
       this.a = p0;
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, w.class, "1")) {
          return;
       }
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3f4ccccd}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0x3f4ccccd})};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
       a.o(objectAnimat, "ObjectAnimator.ofPropert¡­alueHolder, yValueHolder\)");
       objectAnimat.setDuration(this.a.b);
       objectAnimat.setInterpolator(new e());
       if (p1 != null) {
          objectAnimat.addListener(p1);
       }
       this.a.d(p0);
       objectAnimat.start();
       return;
    }
}
