package gj9.k;
import erd.g;
import com.yxcorp.gifshow.channel.stagger.HotChannelWebContainerFragment;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;

public final class k implements g	// class@0024b9
{
    public final HotChannelWebContainerFragment b;

    public void k(HotChannelWebContainerFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       JsNativeEventCommunication jsNativeEven = this.b.s.zh();
       if (jsNativeEven == null) {
       }else if(p0.booleanValue()){
          jsNativeEven.p();
       }else {
          jsNativeEven.q();
       }
       return;
    }
}
