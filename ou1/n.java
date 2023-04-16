package ou1.n;
import androidx.lifecycle.Observer;
import ou1.o;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import zsd.t;
import ou1.f;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import d61.l;
import android.animation.TimeInterpolator;
import ou1.e;
import android.widget.TextView;
import android.animation.Animator$AnimatorListener;
import java.lang.CharSequence;

public final class n implements Observer	// class@0035a3
{
    public final o b;

    public void n(o p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       AnimatorSet uAnimatorSet;
       float f;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, str)) {
       }else {
          o v = this.b.v;
          if (v != null) {
             a.o(p0, "it");
             p0 = t.X0(p0);
             f uof = f.class;
             if (!PatchProxy.applyVoidOneRefs(p0, v, uof, str)) {
                int i = 1;
                int i1 = (p0 != null)? p0.intValue(): 1;
                if (v.e != i1 && i1 != i) {
                   v.a(v.f);
                   f e = v.e;
                   if (PatchProxy.isSupport(uof)) {
                      uAnimatorSet = PatchProxy.applyTwoRefs(Integer.valueOf(e), Integer.valueOf(i1), v, uof, "5");
                      if (uAnimatorSet != PatchProxyResult.class) {
                      label_00c3 :
                         v.f = uAnimatorSet;
                         if (uAnimatorSet != null) {
                            uAnimatorSet.start();
                         }
                      }
                   }
                   int i2 = 0;
                   Property property = (i1 < e)? 1: null;
                   f c = (a.g(v.d, v.b))? v.c: v.b;
                   f = (float)a1.e(14.00f);
                   if (!property) {
                      f = - f;
                   }
                   float[] uofloatArray = new float[]{f,0};
                   float[] uofloatArray1 = new float[]{0,- f};
                   AnimatorSet uAnimatorSet1 = new AnimatorSet();
                   uAnimatorSet1.setDuration(300);
                   uAnimatorSet1.setInterpolator(new l(0.39f, 0x3f11eb85, 0x3f0f5c29, 0x3f800000));
                   Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(c, View.TRANSLATION_Y, uofloatArray),ObjectAnimator.ofFloat(v.d, View.TRANSLATION_Y, uofloatArray1)};
                   uAnimatorSet1.playTogether(uAnimatorArr);
                   uAnimatorSet1.addListener(new e(v, c, i1, e));
                   uAnimatorSet = uAnimatorSet1;
                   goto label_00c3 ;
                }else {
                   v.d.setText(String.valueOf(i1));
                }
                v.e = i1;
             }
          }
       }
       return;
    }
}
