package h41.c;
import xq5.c;
import h41.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public final class c implements c	// class@00261f
{
    public final b b;

    public void c(b p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       c tb = this.b;
       if (tb.e != null && tb.f == null) {
          tb.b();
          tb = this.b;
          tb.e = false;
          tb.f = true;
       }
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       c tb = this.b;
       if (tb.e == null) {
          tb.a();
          tb = this.b;
          tb.e = true;
          tb.f = false;
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
