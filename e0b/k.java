package e0b.k;
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

public final class k implements View$OnClickListener	// class@0025d4
{
    public final j b;

    public void k(j p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       a uoa = this.b.P.j();
       boolean b = false;
       j q = this.b.Q;
       Boolean uBoolean = (q != null)? Boolean.valueOf((q.isEmpty() ^ 0x01)): null;
       uoa.a(b, uBoolean.booleanValue());
       k tb = this.b;
       j l = tb.L;
       if (l != null) {
          l.d(tb.h0());
       }
       return;
    }
}
