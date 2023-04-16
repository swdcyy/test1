package bg3.f;
import xq5.c;
import bg3.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class f implements c	// class@0003a5
{
    public final e b;

    public void f(e p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       this.b.reset();
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.b.S8();
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
