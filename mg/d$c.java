package mg.d$c;
import erd.g;
import f55.g;
import java.lang.Object;
import java.lang.Boolean;
import og.l;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;

public final class d$c implements g	// class@0025dd
{
    public final g b;

    public void d$c(g p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray = new Object[0];
       l.D().w("JsEditFun", "processPhotosAndGotoEdit SUCCESS", objArray);
       this.b.onSuccess(new JsErrorResult(1, null));
    }
}
