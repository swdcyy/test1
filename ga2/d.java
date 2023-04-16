package ga2.d;
import androidx.lifecycle.Observer;
import ga2.f;
import java.lang.Object;
import java.lang.Integer;
import java.util.Objects;
import android.animation.Animator;
import va1.l0;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import ga2.e;
import android.animation.Animator$AnimatorListener;
import th0.d;
import android.animation.TimeInterpolator;

public final class d implements Observer	// class@002aee
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       int i = p0.intValue();
       if (i != 1) {
          int i1 = 2;
          if (i != i1) {
             if (i == 3) {
                l0.m(tb.e);
                tb.a.setVisibility(8);
             }
          }else if(PatchProxy.applyVoid(null, tb, f.class, "3")){
             i = tb.e;
             if (i == null || !i.isRunning()) {
                l0.m(tb.e);
                i = j.a(tb.a, new float[i1]{0,0x3f800000});
                tb.e = i;
                i.addListener(new e(tb));
                tb.e.setDuration(500);
                tb.e.setInterpolator(new d());
                tb.e.start();
             }
          }
       }else {
          l0.m(tb.e);
          tb.a.setAlpha(0x3f800000);
          tb.a.setVisibility(0);
       }
       return;
    }
}
