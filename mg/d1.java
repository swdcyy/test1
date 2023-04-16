package mg.d1;
import erd.g;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import f55.g;
import java.lang.Object;
import njd.a;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;

public final class d1 implements g	// class@0025ed
{
    public final ProgressFragment b;
    public final g c;

    public void d1(ProgressFragment p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       this.b.dismiss();
       this.c.onSuccess(new JsSuccessResult());
    }
}
