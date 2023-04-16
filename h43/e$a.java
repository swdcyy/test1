package h43.e$a;
import android.view.View$OnClickListener;
import h43.e;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.bottombar.component.widget.d;
import androidx.lifecycle.LiveData;
import z61.b;
import j61.c;

public class e$a implements View$OnClickListener	// class@002c3d
{
    public final e b;

    public void e$a(e p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       e$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, e.class, "3") && tb.i != null) {
          d f = tb.f;
          if (f != null && f.getValue() != null) {
             tb.i.a(tb.f.getValue().mFeatureId);
          }
       }
       return;
    }
}
