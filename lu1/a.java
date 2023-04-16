package lu1.a;
import androidx.lifecycle.Observer;
import lu1.c;
import java.lang.Object;
import ut1.o;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkDuetContinuousWinView;
import java.lang.Integer;
import com.kuaishou.live.common.core.component.pk.combowin.LivePkComboWinNumberScrollView;
import d61.v;
import jw1.c;
import android.view.ViewGroup;

public final class a implements Observer	// class@003039
{
    public final c b;

    public void a(c p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          this.b.y3();
          c k = this.b.K;
          a.m(k);
          int i = p0.a();
          Objects.requireNonNull(k);
          if (!PatchProxy.isSupport(LiveMultiPkDuetContinuousWinView.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), k, LiveMultiPkDuetContinuousWinView.class, "3") && k.L())) {
             LiveMultiPkDuetContinuousWinView n = k.N;
             if (n != i) {
                if (n == -1) {
                   k.setContinuousWinCountsWithoutScrollAnim(i);
                }else if(PatchProxy.isSupport(LiveMultiPkDuetContinuousWinView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(n), Integer.valueOf(i), k, LiveMultiPkDuetContinuousWinView.class, "6")){
                   k.L();
                   boolean b = true;
                   if (k.M == b) {
                      k.D.M(n, i, b);
                      if (!PatchProxy.isSupport(LiveMultiPkDuetContinuousWinView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(n), Integer.valueOf(i), k, LiveMultiPkDuetContinuousWinView.class, "8")) {
                         if (v.c(n)) {
                            if (!v.c(i)) {
                               k.C.setTranslationX((float)c.a);
                            }
                         }else if(v.c(i)){
                            k.C.setTranslationX((float)c.b);
                         }
                      }
                   }else {
                      k.H.M(n, i, false);
                      if (!PatchProxy.isSupport(LiveMultiPkDuetContinuousWinView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(n), Integer.valueOf(i), k, LiveMultiPkDuetContinuousWinView.class, "9")) {
                         if (v.c(n)) {
                            if (!v.c(i)) {
                               k.G.setTranslationX((float)(- c.a));
                            }
                         }else if(v.c(i)){
                            k.G.setTranslationX((float)(- c.b));
                         }
                      }
                   }
                }
                k.N = i;
             }
          }
       }
       return;
    }
}
