package mg.u;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;
import android.os.Bundle;

public final class u implements g	// class@00266b
{
    public final g b;

    public void u(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       PostUtils.D("JsGrowthBridgeFuns", "getCurrentDraftFileSize\(\) ", p0);
       u tb = this.b;
       if (tb != null) {
          tb.a(-1, p0.getMessage(), null);
       }
       return;
    }
}
