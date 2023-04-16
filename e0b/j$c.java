package e0b.j$c;
import android.view.View$OnClickListener;
import e0b.j;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.library.widget.popup.common.c;

public final class j$c implements View$OnClickListener	// class@0025cd
{
    public final j b;

    public void j$c(j p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$c.class, "1")) {
          return;
       }
       j$c tb = this.b;
       Objects.requireNonNull(tb);
       j oj = j.class;
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, tb, oj, "7")) {
          tb.q(tb.t);
       }
       return;
    }
}
