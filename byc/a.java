package byc.a;
import erd.g;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import java.lang.Object;
import byc.d;

public final class a implements g	// class@0004b7
{
    public final JsNativeEventCommunication b;

    public void a(JsNativeEventCommunication p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.onNativeCallJsEvent(p0);
    }
}
