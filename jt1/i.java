package jt1.i;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import ht1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import pu1.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import android.animation.AnimatorSet;
import lw1.c;
import com.kwai.robust.PatchProxyResult;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import th0.q;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import android.animation.AnimatorSet$Builder;

public final class i	// class@002c0c
{
    public final KwaiImageView a;
    public final KwaiImageView b;
    public final View c;
    public final LifecycleOwner d;
    public final a e;

    public void i(View p0,LifecycleOwner p1,a p2){
       a.p(p0, "rootView");
       a.p(p1, "lifecycleOwner");
       a.p(p2, "skinManager");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
       View view = m1.f(p0, R.id.live_multi_pk_result_left);
       a.o(view, "ViewBindUtils.bindWidget¡­ive_multi_pk_result_left\)");
       this.a = view;
       p0 = m1.f(p0, R.id.live_multi_pk_result_right);
       a.o(p0, "ViewBindUtils.bindWidget¡­ve_multi_pk_result_right\)");
       this.b = p0;
    }
    public final void a(KwaiImageView p0,d p1,a p2){
       int i;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, i.class, "2")) {
          return;
       }
       i = 0;
       p0.setVisibility(i);
       p2.d(p0, p1);
       AnimatorSet uAnimatorSet = new AnimatorSet();
       ObjectAnimator objectAnimat = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (objectAnimat != PatchProxyResult.class) {
       }else {
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0,0x3f800000})};
          objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p0, propertyValu);
          objectAnimat.setInterpolator(new q());
          objectAnimat.setDuration(300);
       }
       uAnimatorSet.play(objectAnimat);
       return;
    }
}
