package nd9.b0;
import java.lang.Runnable;
import nd9.z;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import kotlin.jvm.internal.a;
import nd9.b0$a;
import com.kwai.library.widget.popup.common.f;

public final class b0 implements Runnable	// class@003133
{
    public final z b;

    public void b0(z p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
          return;
       }
       z r = this.b.r;
       if (r != null && !r.getVisibility()) {
          r = this.b.r;
          a.m(r);
          f.G(r, new b0$a(this));
       }
       return;
    }
}
