package mr1.h;
import androidx.lifecycle.Observer;
import mr1.l;
import j83.b;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import sq1.f$d;
import sq1.f;
import kr1.b;

public final class h implements Observer	// class@0031f9
{
    public final l b;
    public final b c;

    public void h(l p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          h tb = this.b;
          a.o(p0, "isFollowed");
          boolean b = p0.booleanValue();
          h tc = this.c;
          Objects.requireNonNull(tb);
          l ol = l.class;
          if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), tc, tb, ol, "2")) {
             if (b == true) {
                b = tb.a;
                if (b == null) {
                   a.S("followLottie");
                }
                if (!b.getVisibility()) {
                   b = tb.a;
                   if (b == null) {
                      a.S("followLottie");
                   }
                   if (!b.p()) {
                      b = tb.a;
                      if (b == null) {
                         a.S("followLottie");
                      }
                      b.s();
                   }
                }
             }else if(!b){
                b = tb.a;
                if (b == null) {
                   a.S("followLottie");
                }
                b.f();
                tc.g(f$d.a);
                b = tb.a;
                if (b == null) {
                   a.S("followLottie");
                }
                b.setVisibility(0);
                b = tb.a;
                if (b == null) {
                   a.S("followLottie");
                }
                b.setProgress(0);
                tb.c.c();
             }
          }
       }
       return;
    }
}
