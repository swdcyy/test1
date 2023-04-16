package c12.l;
import xq5.c;
import c12.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class l implements c	// class@0004a6
{
    public final k b;

    public void l(k p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       l tb = this.b;
       if (tb.G != null && tb.H == null) {
          tb.Q(true);
          this.b.X8();
          tb = this.b;
          tb.G = false;
          tb.H = true;
       }
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       l tb = this.b;
       if (tb.G == null) {
          tb.x(true);
          this.b.W8();
          tb = this.b;
          tb.G = true;
          tb.H = false;
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
