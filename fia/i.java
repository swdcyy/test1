package fia.i;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import fia.f;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import cia.w;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import android.view.ViewGroup;
import java.lang.NullPointerException;

public final class i implements ValueAnimator$AnimatorUpdateListener	// class@002910
{
    public final f a;

    public void i(f p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          float f = p0.floatValue();
          SlidePlayViewModel slidePlayVie = this.a.R8().O();
          if (slidePlayVie != null) {
             VerticalViewPager verticalView = slidePlayVie.s2();
             if (verticalView != null) {
                verticalView.setTranslationY(((float)this.a.K * f));
             }
          }
          PatchProxy.onMethodExit(i.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(i.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}
