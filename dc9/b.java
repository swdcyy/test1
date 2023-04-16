package dc9.b;
import com.yxcorp.gifshow.camera.record.assistant.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.View;
import java.lang.Math;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import dc9.b$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class b	// class@0020b6
{
    public final int a;
    public final a b;

    public void b(a p0){
       a.p(p0, "assistContext");
       super();
       this.b = p0;
       this.a = a1.e(40.00f);
    }
    public final void a(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (!this.b.D()) {
          return;
       }
       View view = this.b.s();
       if (view != null && !view.getVisibility()) {
          view = this.b.s();
       }else {
          view = this.b.c();
          view = (view != null && !view.getVisibility())? this.b.c(): null;
       }
       if (view == null) {
          return;
       }else {
          float f = Math.abs(this.b(true));
          float translationX = view.getTranslationX();
          String str = null;
          if (!p0 || (translationX - str || (!p0 && !translationX - str))) {
             return;
          }else {
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
             a.o(valueAnimato, "animator");
             valueAnimato.setInterpolator(new LinearInterpolator());
             valueAnimato.setDuration(200);
             valueAnimato.addUpdateListener(new b$a(p0, view, f));
             valueAnimato.start();
             return;
          }
       }
    }
    public final float b(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       int i = ((this.b.a() * 6) + (a1.d(0x7f07011d) * 4)) + a1.d(0x7f070f46);
       float f = (p0)? ((float)-1 * (float)((i - (this.b.a() * 2)) - this.a)) / (float)4: 0;
       return f;
    }
}
