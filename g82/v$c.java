package g82.v$c;
import xq5.c;
import g82.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class v$c implements c	// class@002abc
{
    public final v b;

    public void v$c(v p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, v$c.class, "2")) {
          return;
       }
       this.b.y9();
       this.b.j9();
       this.b.M = 0;
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, v$c.class, "1")) {
          return;
       }
       this.b.Z8();
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
