package mg.d0;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;
import android.os.Bundle;

public final class d0 implements g	// class@0025ec
{
    public final g b;

    public void d0(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       PostUtils.D("JsGrowthBridgeFuns", "processCurrentDraftFile\(\) ", p0);
       d0 tb = this.b;
       if (tb != null) {
          tb.a(-1, p0.getMessage(), null);
       }
       return;
    }
}
