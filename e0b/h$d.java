package e0b.h$d;
import android.view.View$OnClickListener;
import e0b.h;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e0b.h$a;

public final class h$d implements View$OnClickListener	// class@0025c7
{
    public final h b;

    public void h$d(h p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$d.class, "1")) {
          return;
       }
       this.b.g0();
       h k = this.b.K;
       if (k != null) {
          k.f();
       }
       return;
    }
}
