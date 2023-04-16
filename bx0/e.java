package bx0.e;
import xq5.c;
import bx0.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.b;
import tf1.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class e implements c	// class@00042b
{
    public final d b;

    public void e(d p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.b.P8();
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       if (this.b.R8() && this.b.A.isLoading()) {
          this.b.S8();
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
