package m59.p;
import android.app.Activity;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import k59.j2;
import com.kwai.yoda.bridge.YodaBaseWebView;
import androidx.fragment.app.Fragment;
import com.kuaishou.webkit.WebViewClient;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import m59.o;

public final class p	// class@002e0b
{
    public boolean a;
    public final Activity b;
    public final Object c;
    public final BaseFeed d;
    public final int e;
    public final int f;
    public final int g;
    public final AdDataWrapper$AdLogParamAppender h;
    public final j2 i;

    public void p(Activity p0,Object p1,BaseFeed p2,int p3,int p4,int p5,AdDataWrapper$AdLogParamAppender p6,j2 p7){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
    }
    public final WebViewClient a(YodaBaseWebView p0,Fragment p1,j2 p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "webView");
       p tb = this.b;
       p tc = this.c;
       p td = this.d;
       p te = this.e;
       p tf = this.f;
       p tg = this.g;
       p th = this.h;
       if (p2 == null) {
          p ti = this.i;
       }
       o oo = new o(tb, p0, tc, td, te, tf, tg, th, p2, p1);
       obj.E = this.a;
       return obj;
    }
}
