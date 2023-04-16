package a32.e$c;
import xq5.c;
import a32.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class e$c implements c	// class@000022
{
    public final e b;

    public void e$c(e p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "2")) {
          return;
       }
       this.b.R8();
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, e$c.class, "1")) {
          return;
       }
       e$c tb = this.b;
       if (tb.s != null && tb.P8()) {
          this.b.S8();
       }else {
          this.b.R8();
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
