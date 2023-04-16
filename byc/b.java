package byc.b;
import erd.g;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import java.lang.Object;
import com.yxcorp.gifshow.model.ShakeEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fg6.a;
import com.google.gson.Gson;

public final class b implements g	// class@0004b8
{
    public final JsNativeEventCommunication b;

    public void b(JsNativeEventCommunication p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       JsNativeEventCommunication jsNativeEven = JsNativeEventCommunication.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, jsNativeEven, "36")) {
       }else {
          p0 = a.a.q(p0);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, jsNativeEven, "14")) {
             tb.b("native_shake", p0);
          }
       }
       return;
    }
}
