package i0a.y$a;
import android.view.View$OnTouchListener;
import i0a.y;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import bf5.d;
import bf5.d$a;
import com.yxcorp.gifshow.detail.view.NasaFeaturedSeekBar;
import java.util.Objects;
import android.widget.TextView;
import java.lang.Integer;
import android.animation.ValueAnimator;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;

public class y$a implements View$OnTouchListener	// class@00275e
{
    public final y b;

    public void y$a(y p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, y$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (!p1.getActionMasked()) {
          d d = this.b.d;
          if (d != null) {
             d.a();
          }
       }else if(p1.getActionMasked() == 3 || p1.getActionMasked() == 1){
          y$a tb = this.b;
          d d1 = tb.d;
          if (d1 != null) {
             d1.e(tb.f.getCurrentRation(), this.b.f.getCurrentProgress());
          }
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, y.class, "19")) {
             int i = 8;
             tb.g.setVisibility(i);
             tb.h.setVisibility(i);
             tb.i.setVisibility(i);
          }
          tb = this.b;
          tb.j = false;
          y f = tb.f;
          int currentProgr = f.getCurrentProgress();
          Objects.requireNonNull(f);
          if (!PatchProxy.isSupport(NasaFeaturedSeekBar.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(currentProgr), f, NasaFeaturedSeekBar.class, "34") && f.W != null)) {
             f.X0 = currentProgr;
             NasaFeaturedSeekBar v0 = f.V0;
             if (v0 != null) {
                v0.cancel();
             }
             f.setProgress(currentProgr);
             Object[] objArray = new Object[false];
             o.C().s("NasaFeaturedSeekBar", "onStopTracking: "+currentProgr+", "+f.getProgress(), objArray);
          }
       }
       return false;
    }
}
