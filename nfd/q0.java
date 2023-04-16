package nfd.q0;
import erd.g;
import java.lang.Runnable;
import java.lang.Object;
import com.yxcorp.plugin.search.response.SearchPoiCollectResponse;

public final class q0 implements g	// class@001df4
{
    public final Runnable b;

    public void q0(Runnable p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q0 tb = this.b;
       if (p0.isValid() && tb != null) {
          tb.run();
       }
       return;
    }
}
