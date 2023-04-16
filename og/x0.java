package og.x0;
import erd.g;
import og.b1;
import java.lang.Object;
import java.lang.Throwable;
import og.l;
import java.lang.String;
import w46.b;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import o56.a;
import android.app.Application;

public final class x0 implements g	// class@0027ca
{
    public final b1 b;

    public void x0(b1 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       l.D().e("ShopVideoHelper", "reUploadShopVideo load plugin error", p0);
       this.b.d(new JsErrorResult(0x4e21, a.B.getString(R.string.arg_RES_7f1042c6)));
    }
}
