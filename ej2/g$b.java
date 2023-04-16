package ej2.g$b;
import xq5.c;
import ej2.g;
import java.lang.Object;
import xq5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class g$b implements c	// class@00272c
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public void P(){
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, g$b.class, "1")) {
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
