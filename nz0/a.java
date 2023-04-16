package nz0.a;
import nz0.a$a;
import nsd.u;
import lnc.a1;
import android.view.View;
import ql1.d$b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nz0.a$c;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import nz0.a$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Number;
import va1.n0;
import android.view.View$MeasureSpec;

public final class a	// class@003432
{
    public Animator a;
    public Animator b;
    public boolean c;
    public boolean d;
    public final a$c e;
    public final View f;
    public final View g;
    public final View h;
    public final d$b i;
    public static final int j;
    public static final int k;
    public static final a$a l;

    static {
       a.l = new a$a(null);
       a.j = a1.e(16.00f);
       a.k = a1.e(8.00f);
    }
    public void a(View p0,View p1,View p2,d$b p3){
       a.p(p0, "closeButton");
       a.p(p1, "closeButtonSpace");
       a.p(p2, "popupCloseButton");
       a.p(p3, "liveGiftPanelEventService");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.d = true;
       this.e = new a$c(this);
    }
    public final Animator a(float p0,float p1){
       float[] uofloatArray;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uoa, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, uofloatArray)};
       uofloatArray = new float[]{p0,p1};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.f, propertyValu);
       a.o(objectAnimat, "it");
       objectAnimat.setDuration(200);
       a.o(objectAnimat, "ObjectAnimator.ofPropert¡­ION_DURATION_MS\n        }");
       return objectAnimat;
    }
    public final Animator b(float p0,float p1){
       float[] obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, uoa, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new float[]{p0,p1};
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(obj);
       valueAnimato.addUpdateListener(new a$b(this));
       a.o(valueAnimato, "ValueAnimator.ofFloat\(st¡­}\n            }\n        }");
       return valueAnimato;
    }
    public final int c(){
       int i;
       Object obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.f.getWidth()) {
          i = n0.i(this.f);
       }else {
          this.f.measure(View$MeasureSpec.makeMeasureSpec(0x3fffffff, Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(this.f.getMeasuredHeight(), Integer.MIN_VALUE));
          i = this.f.getMeasuredWidth();
       }
       return ((i - a.k) + a.j);
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.e(this.a);
       this.e(this.b);
       return;
    }
    public final void e(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       if (p0 != null && p0.isRunning()) {
          p0.end();
       }
       return;
    }
}
