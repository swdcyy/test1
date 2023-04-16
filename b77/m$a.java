package b77.m$a;
import vq5.b;
import b77.m;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import b77.n;
import com.kwai.live.gzone.widget.e$a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.library.widget.popup.common.c;

public class m$a implements b	// class@0003e2
{
    public final m a;

    public void m$a(m p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return a.a(this);
    }
    public void b(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       m$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, m.class, "3")) {
          e$a uoa = new e$a(ta.getActivity());
          uoa.a0(true);
          n on = new n(uoa);
          ta.t = on;
          on.y = ta.q;
          on.Z();
       }
       return;
    }
}
