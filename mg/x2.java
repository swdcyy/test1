package mg.x2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsRouterParams;
import f55.g;
import java.lang.Object;
import mg.v;

public final class x2 implements Runnable	// class@00267a
{
    public final JsRouterParams b;
    public final g c;

    public void x2(JsRouterParams p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       v.c(this.b, this.c);
    }
}
