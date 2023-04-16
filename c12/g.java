package c12.g;
import xq5.c;
import c12.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class g implements c	// class@0004a0
{
    public final f b;

    public void g(f p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       g tb = this.b;
       if (tb.D != null && tb.E == null) {
          tb.Q(true);
          this.b.Z8();
          tb = this.b;
          tb.D = false;
          tb.E = true;
       }
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       g tb = this.b;
       if (tb.D == null) {
          tb.x(true);
          this.b.Y8();
          tb = this.b;
          tb.D = true;
          tb.E = false;
       }
       return;
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
