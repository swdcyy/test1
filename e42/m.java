package e42.m;
import xq5.c;
import com.kuaishou.live.core.show.clearscreen.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.clearscreen.e;
import com.kuaishou.live.core.show.clearscreen.c;
import xq5.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public class m implements c	// class@00261f
{
    public final d b;

    public void m(d p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       m tb = this.b;
       if (tb.r != null && tb.p != null) {
          tb.S8().setVisible(false);
          this.b.p.e();
          tb = this.b;
          tb.r = false;
          tb.X8();
       }
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
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
