package b01.h;
import vg1.m$b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.props.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lz0.c;
import mk1.h;
import cl1.c;
import android.content.Context;
import com.kwai.robust.PatchProxyResult;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import s51.c;
import lp3.c;
import lp3.e;

public class h implements m$b	// class@0002eb
{
    public final c a;

    public void h(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       this.a.v.t.d();
       return;
    }
    public Context b(){
       Object obj = PatchProxy.apply(null, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getContext();
    }
    public c c(){
       Object obj = PatchProxy.apply(null, this, h.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.v.n.a(c.class);
    }
    public void m0(){
       this.a.v.K = null;
    }
}
