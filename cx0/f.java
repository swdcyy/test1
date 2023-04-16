package cx0.f;
import ekd.f$i;
import cx0.b;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import com.kuaishou.live.widget.LivePkShimmerLayout;

public final class f extends f$i	// class@001e93
{
    public final b b;

    public void f(b p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       b c = this.b.c;
       if (c != null) {
          c.setVisibility(8);
       }
       f tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, b.class, "4")) {
          b d = tb.d;
          if (d != null) {
             d.l(3000, 2, 3050, TimeUnit.MILLISECONDS);
          }
       }
       return;
    }
    public void onAnimationStart(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       b b = this.b.b;
       if (b != null) {
          b.setTranslationY(0);
       }
       return;
    }
}
