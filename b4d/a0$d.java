package b4d.a0$d;
import erd.g;
import b4d.a0;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.utility.Log;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import usd.q;
import android.content.Context;
import com.yxcorp.utility.n;
import android.animation.ValueAnimator;
import b4d.f0;
import android.animation.Animator$AnimatorListener;
import b4d.g0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import qrd.l1;
import b4d.d0;
import b4d.e0;

public final class a0$d implements g	// class@000350
{
    public final a0 b;

    public void a0$d(a0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       int[] ointArray;
       ValueAnimator valueAnimato;
       a0 uoa0 = a0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$d.class, "1")) {
       }else {
          String str = "it";
          a.o(p0, str);
          int i = 1;
          float f = 0x42f00000;
          int i1 = 2;
          int i2 = 0;
          String str1 = "EmotionAtFloatPanelPresenter";
          Object[] objArray = null;
          if (p0.booleanValue()) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(objArray, p0, uoa0, "10")) {
                Log.g(str1, "showPanel");
                uoa0 = p0.u;
                if (uoa0 != null) {
                   if (p0.X8() && uoa0.getVisibility()) {
                      p0.W8();
                      ointArray = new int[i1];
                      ointArray[i2] = q.n(i2, uoa0.getLayoutParams().height);
                      ointArray[i] = n.c(uoa0.getContext(), f);
                      valueAnimato = ValueAnimator.ofInt(ointArray);
                      a.o(valueAnimato, str);
                      valueAnimato.setDuration(300);
                      valueAnimato.addListener(new f0(uoa0, p0));
                      valueAnimato.addUpdateListener(new g0(uoa0, p0));
                      valueAnimato.start();
                      p0.z = valueAnimato;
                   }
                }else {
                   Log.n(str1, "showPanel: mAtFloatPanelContainer is null");
                   p0 = l1.a;
                }
             }
          }else {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(objArray, p0, uoa0, "15")) {
                Log.g(str1, "hidePanel");
                uoa0 = p0.u;
                if (uoa0 != null) {
                   if (uoa0.getVisibility() == 8) {
                      p0.B = i2;
                   }else {
                      p0.W8();
                      ointArray = new int[i1];
                      ointArray[i2] = q.u(n.c(uoa0.getContext(), f), uoa0.getLayoutParams().height);
                      ointArray[i] = i2;
                      valueAnimato = ValueAnimator.ofInt(ointArray);
                      a.o(valueAnimato, str);
                      valueAnimato.setDuration(300);
                      valueAnimato.addListener(new d0(uoa0, p0));
                      valueAnimato.addUpdateListener(new e0(uoa0, p0));
                      valueAnimato.start();
                      p0.A = valueAnimato;
                   }
                }else {
                   Log.n(str1, "hidePanel: mAtFloatPanelContainer is null");
                   p0 = l1.a;
                }
             }
          }
       }
       return;
    }
}
