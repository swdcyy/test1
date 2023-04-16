package kx1.e$a;
import rq5.a;
import kx1.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lx1.b;
import java.lang.Number;
import java.util.List;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantPriority;

public class e$a extends a	// class@002e1b
{
    public final e h;

    public void e$a(e p0){
       this.h = p0;
       super();
    }
    public View H(){
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, e$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h.f;
       if (obj != null) {
          objArray = obj.c();
       }
       return objArray;
    }
    public int a(){
       e obj = PatchProxy.apply(null, this, e$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.h.f;
       int i = (obj != null)? obj.a(): a.f;
       return i;
    }
    public List c(){
       return null;
    }
    public LivePendantPriority f(){
       return LivePendantPriority.INTERACTION_SCENE_PENDANT;
    }
}
