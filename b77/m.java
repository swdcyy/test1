package b77.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import b77.m$a;
import vq5.b;
import vq5.d;
import b77.m$b;
import mq5.h;
import mq5.b;
import fq5.b;

public class m extends PresenterV2	// class@0003e4
{
    public d p;
    public b q;
    public b r;
    public h s;
    public n t;

    public void m(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       this.p.t5("showsportmedalpanel", new m$a(this));
       m$b uob = new m$b(this);
       this.s = uob;
       this.r.Km(uob);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m.class, "4")) {
          return;
       }
       this.p.Z4("showsportmedalpanel");
       this.r.le(this.s);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_ROUTER_SERVICE");
       this.q = this.r8("LIVE_BASIC_CONTEXT");
       this.r = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       return;
    }
}
