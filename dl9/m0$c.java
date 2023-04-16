package dl9.m0$c;
import ub.a;
import dl9.m0$a;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import hc.a;
import pk9.a;
import java.util.Objects;
import dc.a;
import dc.c;
import dc.b;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import ukd.a;
import com.facebook.fresco.animation.bitmap.wrapper.AnimatedDrawableBackendFrameRenderer;
import kotlin.jvm.internal.a;
import oc.a;
import ec.a;
import oc.d;
import com.facebook.common.references.a;

public class m0$c extends a	// class@001f82
{
    public a b;

    public void m0$c(){
       super();
    }
    public void m0$c(m0$a p0){
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       a a;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, m0$c.class, "1")) {
       }else {
          p0 = p2 instanceof a;
          if (p0) {
             p1 = p2;
             this.b = p1;
             a = a.a;
             Objects.requireNonNull(a);
             if (!PatchProxy.applyVoidOneRefs(p2, a, a.class, "1") && p0) {
                a uoa = p1.f();
                if (uoa instanceof c) {
                   uoa = uoa.a();
                }
                if (uoa instanceof BitmapAnimationBackend) {
                   p1 = a.d(uoa, "mBitmapFrameRenderer");
                   a = null;
                   if (!p1 instanceof AnimatedDrawableBackendFrameRenderer) {
                      p1 = a;
                   }
                   if (p1 != null) {
                      p1 = a.d(p1, "mAnimatedDrawableBackend");
                      a.o(p1, "JavaCalls.getField\(anima¡­AnimatedDrawableBackend\"\)");
                      uoa = a.d(uoa, "mBitmapFrameCache");
                      a.o(uoa, "JavaCalls.getField\(anima¡­end, \"mBitmapFrameCache\"\)");
                      d uod = p1.e();
                      a.o(uod, "animatedDrawableBackend.animatedImageResult");
                      a = uod.d();
                      if (a.l(a)) {
                         p1 = p1.e();
                         a.o(p1, "animatedDrawableBackend.animatedImageResult");
                         uoa.g(p1.b(), a, 0);
                      }
                      a.f(a);
                   }
                }
             }
          }
       }
       return;
    }
}
