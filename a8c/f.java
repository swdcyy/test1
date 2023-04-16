package a8c.f;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import com.daimajia.easing.Skill;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.daimajia.easing.BaseEasingMethod$EasingListener;
import android.animation.ValueAnimator;
import com.daimajia.easing.Glider;
import android.animation.Animator;

public final class f implements PopupInterface$c	// class@00009e
{
    public final int a;

    public void f(int p0){
       this.a = p0;
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       float[] uofloatArray = new float[]{(float)p0.getMeasuredHeight()};
       BaseEasingMethod$EasingListener[] uEasingListe = new BaseEasingMethod$EasingListener[0];
       ValueAnimator valueAnimato = Glider.glide(Skill.QuadEaseInOut, (float)this.a, ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray), uEasingListe);
       if (p1 != null) {
          valueAnimato.addListener(p1);
       }
       valueAnimato.start();
       return;
    }
}
