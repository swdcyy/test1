package cn4.d;
import u07.u;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Object;
import u07.t;
import android.view.View;

public final class d implements u	// class@000498
{
    public final WebView b;
    public final String c;

    public void d(WebView p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       this.b.loadUrl(this.c);
    }
}
