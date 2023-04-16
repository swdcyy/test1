package f3a.g$a;
import android.view.View$OnClickListener;
import f3a.g;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import com.smile.gifmaker.mvps.utils.observable.ObservableMap;

public final class g$a implements View$OnClickListener	// class@002280
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       g$a tb = this.b;
       g s = tb.s;
       if (s == null) {
          a.S("mChooseText");
       }
       tb.P8((s.containsKey(Integer.valueOf(this.b.t)) ^ 0x01));
       return;
    }
}
