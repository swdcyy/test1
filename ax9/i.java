package ax9.i;
import vxc.z;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.JsCallbackParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yo5.b;
import f55.c;
import com.kwai.bridge.a;
import ax9.h;
import f55.g;

public class i extends z	// class@0002e7
{

    public void i(WebView p0){
       super(p0);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          a.c(b.class).k9(new h(this, p0));
       }
       return;
    }
}
