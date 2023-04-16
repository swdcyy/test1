package bcd.f;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.plugin.search.module.guess.GuessView;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.animation.ObjectAnimator;
import bcd.k;

public class f extends m	// class@0003e2
{
    public final GuessView c;

    public void f(GuessView p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       f tc = this.c;
       if (tc.i != null) {
          GuessView e = tc.e;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoidOneRefs(e, tc, GuessView.class, "14")) {
             tc.p();
             if (tc.h == null) {
                tc.h = GuessView.o(e);
             }
             tc.h.start();
          }
       }
       GuessView g = this.c.g;
       if (g != null) {
          g.l();
       }
       return;
    }
}
