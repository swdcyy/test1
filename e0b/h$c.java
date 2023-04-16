package e0b.h$c;
import android.view.View$OnClickListener;
import e0b.h;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import com.kwai.library.widget.popup.common.c;

public final class h$c implements View$OnClickListener	// class@0025c6
{
    public final h b;

    public void h$c(h p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$c.class, "1")) {
          return;
       }
       h$c tb = this.b;
       Objects.requireNonNull(tb);
       h oh = h.class;
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, tb, oh, "6")) {
          tb.q(tb.s);
       }
       return;
    }
}
