package k59.l2;
import k59.c2;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import k59.b2;
import android.content.Context;
import mxb.c;
import com.kwai.framework.model.feed.BaseFeed;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import android.content.Intent;
import com.yxcorp.gifshow.webview.c;
import pxb.c;

public class l2 implements c2	// class@002af3
{

    public void l2(){
       super();
    }
    public void a(Activity p0,AdDataWrapper p1,String p2,boolean p3){
       if (PatchProxy.isSupport(l2.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, l2.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "adDataWrapper");
       a.p(p2, "url");
       b2 uob2 = new b2(p0, p2).m(p1);
       uob2.l(p1.getAdPosition());
       uob2.p = p1.shouldDisplaySplashPopUpOnWeb();
       uob2.n(c.X(p1));
       uob2.r = p3;
       uob2.g(p1.getPhoto());
       c.i(p0, uob2.a());
       if (!p1 instanceof c) {
          p1 = null;
       }
       if (p1 != null && (p1.getActivityEnterAnimation() > 0 || p1.getOriginActivityExitAnimation() > 0)) {
          p0.overridePendingTransition(p1.getActivityEnterAnimation(), p1.getOriginActivityExitAnimation());
       }
       return;
    }
    public void b(Activity p0,AdDataWrapper p1,Serializable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, l2.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "adDataWrapper");
       b2 uob2 = new b2(p0, p1.getUrl()).m(p1);
       uob2.g(p2);
       c.i(p0, uob2.a());
       return;
    }
}
