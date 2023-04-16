package j79.g0;
import android.view.View$OnClickListener;
import j79.d0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import j79.l0;

public final class g0 implements View$OnClickListener	// class@002775
{
    public final d0 b;

    public void g0(d0 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0.class, "1")) {
          return;
       }
       g0 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, d0.class, "8")) {
          tb.f.K0(true);
       }
       return;
    }
}
