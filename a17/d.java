package a17.d;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;

public final class d implements PopupInterface$c	// class@000013
{
    public final int a;

    public void d(int p0){
       this.a = p0;
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       a.p(p0, "view");
       float[] uofloatArray = new float[]{(float)p0.getMeasuredHeight(),0};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray).setDuration((long)this.a);
       a.o(objectAnimat, "ObjectAnimator.ofFloat\(v��ration\(duration.toLong\(\)\)");
       if (p1 != null) {
          objectAnimat.addListener(p1);
       }
       objectAnimat.start();
       return;
    }
}