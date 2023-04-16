package gv8.i1;
import java.lang.Runnable;
import com.yxcorp.gateway.pay.webview.yoda.PayYodaWebView;
import java.lang.Object;

public final class i1 implements Runnable	// class@0024e3
{
    public final PayYodaWebView b;

    public void i1(PayYodaWebView p0){
       this.b = p0;
    }
    public final void run(){
       this.b.p();
    }
}
