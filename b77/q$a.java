package b77.q$a;
import oq5.c;
import b77.q;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import b77.l;
import java.lang.Integer;

public class q$a implements c	// class@0003e8
{
    public final q b;

    public void q$a(q p0){
       this.b = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$a.class, "1")) {
          return;
       }
       q d = this.b.D;
       p0 = p0.orientation;
       Objects.requireNonNull(d);
       l ol = l.class;
       if (!PatchProxy.isSupport(ol) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), d, ol, "7")) {
          if (p0 == 2) {
             d.f = true;
             d.a(false);
          }else {
             d.f = false;
          }
       }
       return;
    }
}
