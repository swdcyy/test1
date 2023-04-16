package jy8.d;
import erd.g;
import com.yxcorp.gifshow.ad.award.scheme.NeoSchemeDispatchActivity;
import com.yxcorp.gifshow.commercial.bridge.model.NeoTaskLiveParam;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import yx.j0;
import tkd.b;
import tkd.d;
import nl9.e0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.a0;
import jy8.b;
import jy8.c;
import crd.b;

public final class d implements g	// class@0029d9
{
    public final NeoSchemeDispatchActivity b;
    public final NeoTaskLiveParam c;

    public void d(NeoSchemeDispatchActivity p0,NeoTaskLiveParam p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, uod, "1")) {
          int i = 0;
          String str = "NeoSchemeDispatchActivity";
          if (b) {
             b = new Object[i];
             j0.f(str, "neo live install success", b);
             d.a(-489866664).Fj(this.b, this.c).R(b.b, c.b);
          }else {
             b = new Object[i];
             j0.c(str, "scheme start neo live fail, plugin install failed", b);
          }
       }
       return;
    }
}
