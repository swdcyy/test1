package co2.b2;
import oq5.c;
import com.kuaishou.live.core.voiceparty.f0;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import i81.g;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import op2.e;
import co2.f2;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;

public final class b2 implements c	// class@00057b
{
    public final f0 b;

    public void b2(f0 p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       b2 tb = this.b;
       Objects.requireNonNull(tb);
       int i = 1;
       int i1 = 0;
       boolean b = (p0.orientation == 2)? true: false;
       f0 uof0 = f0.class;
       if (!PatchProxy.isSupport(uof0) || (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, uof0, "5") && !tb.t.R6())) {
          ViewGroup$LayoutParams layoutParams = tb.p.getLayoutParams();
          if (tb.s.s() == null || tb.s.s().b() != TheaterDisplayMode.FULL_SCREEN_LANDSCAPE) {
             i = 0;
          }
          if (layoutParams instanceof FrameLayout$LayoutParams) {
             if (b && i) {
                i1 = a1.e(18.00f);
             }
             layoutParams.bottomMargin = i1;
          }
       }
    label_005d :
       return;
    }
}
