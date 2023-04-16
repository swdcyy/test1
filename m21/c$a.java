package m21.c$a;
import rq5.a;
import m21.c;
import android.view.View;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantRelation;
import trd.t;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantPriority;

public final class c$a extends a	// class@00310f
{
    public final c h;

    public void c$a(c p0){
       this.h = p0;
       super();
    }
    public View H(){
       return this.h.s;
    }
    public List c(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.k(LivePendantRelation.SCREEN_LANDSCAPE);
    }
    public LivePendantPriority f(){
       return LivePendantPriority.CAROUSEL_PENDANT;
    }
}
