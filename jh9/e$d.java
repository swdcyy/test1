package jh9.e$d;
import erd.g;
import jh9.e;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.refresh.RefreshLayout;

public final class e$d implements g	// class@002ae3
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
          if (p0.w != null) {
             p0.x = true;
          }else {
             e.R8(p0).setRefreshing(false);
          }
       }
       return;
    }
}
