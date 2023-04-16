package fia.n0$g;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import l2.b;
import android.animation.TimeInterpolator;
import android.animation.Animator;

public final class n0$g implements PopupInterface$c	// class@00292c
{
    public static final n0$g a;

    static {
       n0$g.a = new n0$g();
    }
    public void n0$g(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, n0$g.class, "1")) {
          return;
       }
       a.p(p0, "toastView");
       View view = p0.findViewById(R.id.toast_content_layout);
       float[] uofloatArray = new float[]{0,(float)p0.getHeight()};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, uofloatArray);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.setInterpolator(new b());
       uAnimatorSet.setDuration(200);
       uAnimatorSet.addListener(p1);
       Animator[] uAnimatorArr = new Animator[]{objectAnimat,ObjectAnimator.ofFloat(view, View.ALPHA, new float[2]{0x3f800000,0})};
       uAnimatorSet.playTogether(uAnimatorArr);
       uAnimatorSet.start();
       return;
    }
}
