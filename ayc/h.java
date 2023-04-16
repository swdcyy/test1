package ayc.h;
import java.lang.Runnable;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.webkit.ValueCallback;
import uv8.g1;
import java.lang.Throwable;
import q87.c;

public final class h implements Runnable	// class@00030b
{
    public final WebView b;
    public final String c;

    public void h(WebView p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       h tb = this.b;
       h tc = this.c;
       ValueCallback valueCallbac = null;
       try{
          tb.evaluateJavascript(tc, valueCallbac);
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          g1.C().u("WebViewUtils", e0, objArray);
       }
       return;
    }
}
