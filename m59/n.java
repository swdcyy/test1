package m59.n;
import java.lang.Runnable;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.webkit.ValueCallback;

public final class n implements Runnable	// class@002e09
{
    public final WebView b;
    public final String c;

    public void n(WebView p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.evaluateJavascript(this.c, null);
    }
}
