package cl9.y2$a;
import sfc.a;
import cl9.y2;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ek9.k1;
import android.view.View;

public class y2$a extends a	// class@000685
{
    public final y2 c;

    public void y2$a(y2 p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y2$a.class, "1")) {
          return;
       }
       super.b(p0);
       y2$a tc = this.c;
       tc.u.a = false;
       tc.w.setVisibility(8);
       return;
    }
}
