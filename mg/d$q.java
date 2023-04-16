package mg.d$q;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;
import android.os.Bundle;

public final class d$q implements g	// class@0025eb
{
    public final g b;

    public void d$q(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       PostUtils.D("JsEditFun", "saveTempImages FAILED", p0);
       this.b.a(412, p0.getMessage(), new Bundle());
    }
}
