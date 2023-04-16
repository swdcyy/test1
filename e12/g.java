package e12.g;
import lm9.a$b;
import e12.f;
import brd.v;
import com.kuaishou.live.core.basic.model.QLiveLaunchInfo;
import java.lang.Object;
import lm9.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;

public class g implements a$b	// class@0025fb
{
    public final v a;
    public final QLiveLaunchInfo b;
    public final f c;

    public void g(f p0,v p1,QLiveLaunchInfo p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(){
       b.d(this);
    }
    public void b(){
       b.c(this);
    }
    public void onError(){
       b.a(this);
    }
    public void onFinish(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.a.onNext(this.b);
       return;
    }
}
