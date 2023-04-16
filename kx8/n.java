package kx8.n;
import erd.g;
import com.yxcorp.gifshow.activity.web.OperateWebViewFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;

public final class n implements g	// class@002c44
{
    public final OperateWebViewFragment b;

    public void n(OperateWebViewFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.zh().p();
       }else {
          tb.zh().q();
       }
       return;
    }
}
