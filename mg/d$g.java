package mg.d$g;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gifshow.util.PostUtils;
import android.os.Bundle;

public final class d$g implements g	// class@0025e1
{
    public final g b;

    public void d$g(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       PostUtils.D("JsEditFun", "editDraft", p0);
       this.b.a(412, p0.getMessage(), new Bundle());
    }
}
