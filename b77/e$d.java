package b77.e$d;
import erd.g;
import b77.e;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.View;
import mkc.b;
import mkc.c;

public class e$d implements g	// class@0003d5
{
    public final e b;

    public void e$d(e p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$d.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, e.class, "6")) {
             p0.D.setVisibility(0);
             p0.C.setVisibility(0);
             b[] uobArray = new b[]{b.g};
             c.d(p0.C, uobArray);
          }
       }
       return;
    }
}
