package m59.b;
import java.lang.Runnable;
import m59.o;
import com.kuaishou.webkit.WebView;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.ad.webview.blackurl.BlackUrlUtil;

public final class b implements Runnable	// class@002dfd
{
    public final o b;
    public final WebView c;

    public void b(o p0,WebView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       b tb = this.b;
       BlackUrlUtil.h(this.c, tb.k, tb.m);
    }
}
