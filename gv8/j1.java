package gv8.j1;
import java.lang.Runnable;
import com.yxcorp.gateway.pay.webview.yoda.PayYodaWebView;
import java.lang.Object;

public final class j1 implements Runnable	// class@0024e6
{
    public final PayYodaWebView b;

    public void j1(PayYodaWebView p0){
       this.b = p0;
    }
    public final void run(){
       this.b.s();
    }
}
