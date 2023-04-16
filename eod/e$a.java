package eod.e$a;
import androidx.lifecycle.Observer;
import eod.e;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.widget.LinearLayout;

public final class e$a implements Observer	// class@000db8
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
       }else {
          a.o(p0, "folded");
          if (p0.booleanValue()) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, uoe, "5")) {
                p0.d.bringToFront();
                p0.d.setAlpha(0x3f800000);
             }
          }else {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, uoe, "6")) {
                p0.d.setAlpha(0);
             }
          }
       }
       return;
    }
}
