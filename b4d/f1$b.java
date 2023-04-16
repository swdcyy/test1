package b4d.f1$b;
import erd.g;
import b4d.f1;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Objects;
import android.view.ViewGroup;
import java.lang.Float;
import d4d.a;
import com.yxcorp.plugin.emotion.append.AppendedWidget;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import java.lang.Number;
import android.view.View;
import android.view.ViewPropertyAnimator;
import th0.k;
import android.animation.TimeInterpolator;
import b4d.g1;
import android.animation.Animator$AnimatorListener;
import io.reactivex.subjects.PublishSubject;

public final class f1$b implements g	// class@000366
{
    public final f1 b;

    public void f1$b(f1 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f1$b.class, "1")) {
       }else {
          String str = "EmotionFloatPanelPresenter";
          Log.d(str, "widget text show: ..."+p0);
          if (!p0.booleanValue()) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, p0, f1.class, "4")) {
                StringBuilder str1 = "onWidgetStartHide: ...";
                f1 t = p0.t;
                if (t != null) {
                   objArray = Float.valueOf(t.getTranslationX());
                }
                Log.g(str, str1+objArray);
                a.g.f(p0.w);
                f1 t1 = p0.t;
                int i = 0;
                Float uFloat = (t1 != null)? Float.valueOf(t1.getTranslationX()): Integer.valueOf(i);
                if (a.g(uFloat, Integer.valueOf(i))) {
                   Log.g(str, "onWidgetStartHide: ...mQuickSendEmotionRcy is full screen!");
                }else {
                   int i1 = p0.P8().component2().intValue();
                   f1 t2 = p0.t;
                   if (t2 != null) {
                      View childAt = t2.getChildAt(i1);
                      if (childAt != null) {
                         childAt.setAlpha(0x3f800000);
                      }
                   }
                   t1 = p0.t;
                   if (t1 != null) {
                      ViewPropertyAnimator viewProperty = t1.animate();
                      if (viewProperty != null) {
                         viewProperty = viewProperty.translationX(0);
                         if (viewProperty != null) {
                            viewProperty.setDuration(f1.x);
                            viewProperty.setInterpolator(new k());
                            viewProperty.setListener(new g1(p0));
                            viewProperty.start();
                         }
                      }
                   }
                }
             }
          }else {
             this.b.v.onNext(Boolean.TRUE);
          }
       }
       return;
    }
}
