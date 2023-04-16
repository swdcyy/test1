package dl9.t$f;
import android.view.View$OnClickListener;
import dl9.t;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.common.c;

public final class t$f implements View$OnClickListener	// class@001fa4
{
    public final t b;

    public void t$f(t p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t$f.class, "1")) {
          return;
       }
       t w = this.b.w;
       if (w != null) {
          w.o();
       }
       return;
    }
}
