package mg.d$d;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;
import android.os.Bundle;

public final class d$d implements g	// class@0025de
{
    public final g b;

    public void d$d(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       PostUtils.D("JsEditFun", "processPhotosAndGotoEdit", p0);
       this.b.a(412, p0.getMessage(), null);
    }
}
