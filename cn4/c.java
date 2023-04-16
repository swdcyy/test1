package cn4.c;
import u07.u;
import com.kuaishou.merchant.web.trilateral.b;
import com.kuaishou.webkit.WebView;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import android.app.Activity;

public final class c implements u	// class@000497
{
    public final b b;
    public final WebView c;

    public void c(b p0,WebView p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       c tb = this.b;
       c tc = this.c;
       Objects.requireNonNull(tb);
       if (tc.canGoBack()) {
          tc.goBack();
       }else {
          tb.o.finish();
       }
       return;
    }
}
