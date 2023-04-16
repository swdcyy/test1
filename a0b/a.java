package a0b.a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.lelink.floatbutton.presenter.FloatButtonPresenter;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Integer;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager;
import com.yxcorp.gifshow.lelink.floatbutton.FloatButtonManager$a;
import java.lang.Float;
import android.widget.FrameLayout;

public final class a implements ValueAnimator$AnimatorUpdateListener	// class@000006
{
    public final FloatButtonPresenter a;
    public final Ref$IntRef b;

    public void a(FloatButtonPresenter p0,Ref$IntRef p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Int");
       int i = p0.intValue();
       FloatButtonPresenter v = this.a.v;
       if (v != null) {
          ViewGroup$LayoutParams layoutParams = v.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.width = i;
          }
       }
       v = this.a.v;
       if (v != null) {
          v.requestLayout();
       }
       FloatButtonManager uFloatButton = FloatButtonManager.i.a();
       float f = (float)(this.b.element - i);
       Objects.requireNonNull(uFloatButton);
       FloatButtonManager uFloatButton1 = FloatButtonManager.class;
       if (!PatchProxy.isSupport(uFloatButton1) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), uFloatButton, uFloatButton1, "6")) {
          uFloatButton = uFloatButton.f;
          if (uFloatButton != null) {
             uFloatButton.setX((uFloatButton.getX() + f));
          }
       }
       this.b.element = i;
       return;
    }
}
