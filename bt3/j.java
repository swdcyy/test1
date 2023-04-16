package bt3.j;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$a;
import bt3.j$a;
import nsd.u;
import java.lang.Object;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.x0;
import android.text.TextUtils;
import kotlin.text.Regex;
import tkd.b;
import tkd.d;
import kt3.a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import android.content.Context;
import bt3.j$c;
import java.lang.Long;
import la4.b;
import crd.b;
import la4.l;

public final class j implements KwaiYodaWebViewActivity$a	// class@000446
{
    public static final j$a a;

    static {
       j.a = new j$a(null);
    }
    public void j(){
       super();
    }
    public boolean a(KwaiYodaWebViewActivity p0,String p1){
       String str = "1";
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, str);
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null || (p1 != null && !TextUtils.x(p1))) {
          try{
             Uri uri = x0.f(p1);
             if (uri != null && TextUtils.equals(str, x0.a(uri, "usePingAnYodaWeb"))) {
                p1 = new Regex("\(usePingAnYodaWeb=[^&]*\)").replace(p1, "usePingAnYodaWeb=0");
                a uoa = d.a(-2094541956);
                if (uoa != null && uoa.isAvailable()) {
                   uoa.ll(ActivityContext.g().e(), p1);
                }else {
                   l.d(p0, new j$c(p0, p1), true, Long.valueOf(0x2710));
                }
                b = true;
             }
          }catch(java.lang.Exception e0){
          }
       }
    label_006b :
       return b;
    }
}
