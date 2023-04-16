package lv8.t;
import java.lang.Runnable;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.webkit.ValueCallback;

public final class t implements Runnable	// class@002dbe
{
    public final WebView b;
    public final String c;

    public void t(WebView p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       t tb = this.b;
       t tc = this.c;
       if (tb != null) {
          tb.evaluateJavascript(tc, null);
       }
       return;
    }
}
