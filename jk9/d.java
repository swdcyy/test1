package jk9.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import jk9.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import jk9.a;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.a;
import android.os.SystemClock;

public final class d implements ValueAnimator$AnimatorUpdateListener	// class@002afb
{
    public final int a;
    public long b;
    public final c c;

    public void d(c p0){
       int i;
       this.c = p0;
       super();
       Object obj = PatchProxy.applyWithListener(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          i = p0.k.e;
          if (i < 1) {
             i = 1;
          }else if(i > 2){
             i = 2;
          }
          PatchProxy.onMethodExit(d.class, "2");
       }
       this.a = i * 16;
       return;
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       long l = SystemClock.elapsedRealtime();
       if ((l - this.b) - (long)this.a >= 0) {
          this.c.d();
          this.b = l;
       }
       PatchProxy.onMethodExit(d.class, "1");
       return;
    }
}
