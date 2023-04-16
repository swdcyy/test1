package ab2.d$a;
import sb2.b;
import ab2.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.view.View;
import android.util.Property;
import th0.c;
import android.animation.TimeInterpolator;
import ab2.f;
import android.animation.Animator$AnimatorListener;
import java.lang.Integer;
import crd.b;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import ab2.b;
import bp6.a;
import erd.g;

public class d$a implements b	// class@00009a
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (p0) {
          if (this.a.P8()) {
             d$a ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(null, ta, d.class, "7")) {
                d t = ta.t;
                if (t != null && t.isRunning()) {
                   ta.t.cancel();
                }
                if (ta.u == null) {
                   PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{j.b(new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(View.SCALE_X, new float[2]{0x3f800000,0x3f000000}),PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[2]{0x3f800000,0x3f000000})};
                   ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(ta.p, propertyValu);
                   ta.u = objectAnimat;
                   objectAnimat.setDuration(200);
                   ta.u.setInterpolator(new c());
                   ta.u.addListener(new f(ta));
                }
                if (!ta.u.isRunning()) {
                   ta.u.start();
                }
             }
          }
       }else if(!this.a.P8()){
          this.a.R8();
       }
       return;
    }
    public void b(int p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       b9.a(this.a.v);
       if (!p0) {
          d$a ta = this.a;
          Objects.requireNonNull(ta);
          b uob = PatchProxy.apply(null, ta, d.class, "9");
          if (uob != PatchProxyResult.class) {
          }else {
             uob = t.timer(3000, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new b(ta), new a());
          }
          ta.v = uob;
       }
       return;
    }
}
