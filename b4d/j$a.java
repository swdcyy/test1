package b4d.j$a;
import android.os.Handler;
import b4d.j;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import android.view.View;
import android.animation.ValueAnimator;
import b4d.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import b4d.l;
import android.animation.Animator$AnimatorListener;
import lnc.a1;
import b4d.c;
import b4d.k;

public class j$a extends Handler	// class@000375
{
    public final j a;

    public void j$a(j p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       j$a ta;
       ValueAnimator valueAnimato;
       j oj = j.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, j$a.class, "1")) {
          return;
       }
       p0 = p0.what;
       if (p0 != 1) {
          if (p0 == 2) {
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(null, ta, oj, "11")) {
                Log.g("FinishButtonAnimPr", "hideFinishButtonWithAnim: ..."+ta.p);
                if (ta.p == null) {
                   if (ta.t.getWidth() <= j.E) {
                      Log.g("FinishButtonAnimPr", "没在显示, 不需要再次消失!");
                   }else {
                      ta.t.setVisibility(0);
                      ta.P8();
                      valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                      ta.q = valueAnimato;
                      valueAnimato.setDuration(120);
                      ta.q.addUpdateListener(new d(ta));
                      ta.q.addListener(new l(ta));
                      ta.q.start();
                   }
                }
             }
          }
       }else {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, oj, "9")) {
             Log.g("FinishButtonAnimPr", "showFinishButtonWithAnim: ..."+ta.p);
             if (ta.p == null) {
                if (ta.t.getWidth() >= a1.e(56.00f)) {
                   ta.P8();
                   Log.g("FinishButtonAnimPr", "正在显示, 不需要再次显示!");
                }else {
                   ta.t.setAlpha(0);
                   ta.t.setVisibility(0);
                   ta.P8();
                   valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                   ta.q = valueAnimato;
                   valueAnimato.setDuration(120);
                   ta.q.addUpdateListener(new c(ta));
                   ta.q.addListener(new k(ta));
                   ta.q.start();
                }
             }
          }
       }
       return;
    }
}
