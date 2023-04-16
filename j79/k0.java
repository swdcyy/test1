package j79.k0;
import android.view.View$OnClickListener;
import j79.h0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import j79.l0;

public final class k0 implements View$OnClickListener	// class@00277e
{
    public final h0 b;

    public void k0(h0 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k0.class, "1")) {
          return;
       }
       k0 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, h0.class, "8")) {
          tb.f.K0(true);
       }
       return;
    }
}
