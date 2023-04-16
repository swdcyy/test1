package mg.o2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsGrowthGuideCloseActionParam;
import f55.g;
import java.lang.Object;
import mg.v;

public final class o2 implements Runnable	// class@002644
{
    public final JsGrowthGuideCloseActionParam b;
    public final g c;

    public void o2(JsGrowthGuideCloseActionParam p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       v.b(this.b, this.c);
    }
}
