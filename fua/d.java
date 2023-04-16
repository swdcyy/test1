package fua.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import fua.c;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import android.view.ViewGroup;
import com.yxcorp.gifshow.homepage.presenter.survey.HomeHotPhotoSurveyMaskBasePresenter;
import android.view.ViewGroup$LayoutParams;

public final class d implements ValueAnimator$AnimatorUpdateListener	// class@0029f7
{
    public final c a;

    public void d(c p0){
       this.a = p0;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Int");
       int i = p0.intValue();
       ViewGroup viewGroup = this.a.Z8();
       if (viewGroup != null) {
          ViewGroup$LayoutParams layoutParams = viewGroup.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.height = i;
          }
       }
       ViewGroup viewGroup1 = this.a.Z8();
       if (viewGroup1 != null) {
          viewGroup1.requestLayout();
       }
       return;
    }
}
