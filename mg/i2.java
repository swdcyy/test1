package mg.i2;
import erd.a;
import f55.g;
import java.lang.Object;
import og.l;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;

public final class i2 implements a	// class@00260c
{
    public final g b;

    public void i2(g p0){
       this.b = p0;
    }
    public final void run(){
       Object[] objArray = new Object[0];
       l.D().w("PostBridgeModuleImpl", "post atlas success", objArray);
       this.b.onSuccess(new JsErrorResult(1, null));
    }
}
