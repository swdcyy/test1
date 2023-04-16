package lu1.h;
import androidx.lifecycle.Observer;
import lu1.q;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;

public final class h implements Observer	// class@003040
{
    public final q b;

    public void h(q p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else {
          h tb = this.b;
          a.o(p0, "it");
          boolean b = p0.booleanValue();
          Objects.requireNonNull(tb);
          q oq = q.class;
          if (!PatchProxy.isSupport(oq) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, oq, "33")) {
             if (b == true) {
                b = tb.w;
                if (b != null && !b.getVisibility()) {
                   b = tb.w;
                   if (b != null) {
                      b.s();
                   }
                }
             }else if(!b){
                b = tb.w;
                if (b != null) {
                   b.setProgress(0);
                }
                tb.w3(0, true);
             }
          }
       }
       return;
    }
}
