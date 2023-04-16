package a32.n$b;
import xq5.c;
import a32.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import oq5.c;
import jv1.b;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class n$b implements c	// class@00002d
{
    public final n b;

    public void n$b(n p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, n$b.class, "2")) {
          return;
       }
       n$b tb = this.b;
       tb.q.x.Q0(tb.u);
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, n$b.class, "1")) {
          return;
       }
       n$b tb = this.b;
       tb.q.x.H6(tb.u);
       this.b.P8();
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
