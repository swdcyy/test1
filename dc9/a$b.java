package dc9.a$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import fc9.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import android.widget.TextView;
import pi9.e;
import android.view.View;
import java.lang.NullPointerException;

public final class a$b implements ValueAnimator$AnimatorUpdateListener	// class@0020b3
{
    public final ValueAnimator a;
    public final a b;

    public void a$b(ValueAnimator p0,a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       float i;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$b.class, "1")) {
          return;
       }
       a$b ta = this.a;
       a.o(ta, "valueAnimator");
       ta = ta.getAnimatedValue();
       if (ta != null) {
          float f = ta.floatValue();
          TextView textView = this.b.f();
          a.o(textView, "btn.btnTextView");
          textView.setTranslationY((e.k * f));
          Object tag = this.b.d().getTag(R.id.color_btn_show_mode_key);
          if (a.g(tag, "btn_show_cover_mode")) {
             i = e.i;
          }else if(a.g(tag, "btn_normal_mode")){
             i = e.h;
          }else if(a.g(tag, "music_btn_normal_mode")){
             i = e.j;
          }else {
             i = e.h;
          }
          View view = this.b.d();
          a.o(view, "btn.btnIconView");
          float f1 = (float)1;
          f1 = f1 - ((f1 - i) * f);
          view.setScaleX(f1);
          View view1 = this.b.d();
          a.o(view1, "btn.btnIconView");
          view1.setScaleY(f1);
          view1 = this.b.e();
          if (view1 != null) {
             view1.setScaleX(f1);
          }
          view1 = this.b.e();
          if (view1 != null) {
             view1.setScaleY(f1);
          }
          PatchProxy.onMethodExit(a$b.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(a$b.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}
