package eod.h$b;
import androidx.lifecycle.Observer;
import eod.h;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.widget.FrameLayout;

public final class h$b implements Observer	// class@000dc2
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "1")) {
       }else {
          a.o(p0, "folded");
          if (p0.booleanValue()) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, oh, "6")) {
                p0.c.setAlpha(0);
             }
          }else {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, oh, "5")) {
                p0.c.bringToFront();
                p0.c.setAlpha(0x3f800000);
             }
          }
       }
       return;
    }
}
