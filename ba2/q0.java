package ba2.q0;
import vq5.b;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class q0 implements b	// class@0003a5
{
    public final h a;

    public void q0(h p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return true;
    }
    public void b(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q0.class, "1")) {
          return;
       }
       q0 ta = this.a;
       if (ta.X0 != null) {
          ta.k9(p0);
       }else {
          ta.E = p0;
       }
       return;
    }
}
