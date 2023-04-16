package e0b.j$g;
import android.view.View$OnClickListener;
import e0b.j;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b0b.a;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import java.util.Collection;
import java.lang.Boolean;
import e0b.h$a;

public final class j$g implements View$OnClickListener	// class@0025d2
{
    public final j b;

    public void j$g(j p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$g.class, "1")) {
          return;
       }
       a uoa = this.b.P.j();
       j r = this.b.R;
       boolean b = false;
       Boolean uBoolean = (r != null)? Boolean.valueOf((r.isEmpty() ^ 0x01)): b;
       boolean b1 = uBoolean.booleanValue();
       j q = this.b.Q;
       if (q != null) {
          b = Boolean.valueOf((q.isEmpty() ^ 0x01));
       }
       uoa.a(b1, b.booleanValue());
       j$g tb = this.b;
       r = tb.L;
       if (r != null) {
          r.d(tb.h0());
       }
       return;
    }
}
