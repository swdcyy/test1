package e0b.h$b;
import android.view.View$OnClickListener;
import e0b.h;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import e0b.h$a;

public final class h$b implements View$OnClickListener	// class@0025c5
{
    public final h b;

    public void h$b(h p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "1")) {
          return;
       }
       h$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, h.class, "5")) {
          h k = tb.K;
          if (k != null) {
             k.c();
          }
       }
       return;
    }
}
