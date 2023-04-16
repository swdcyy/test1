package cra.n;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$a;
import java.lang.Object;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import com.yxcorp.gifshow.growth.util.a;

public final class n implements KwaiYodaWebViewActivity$a	// class@002386
{

    public void n(){
       super();
    }
    public boolean a(KwaiYodaWebViewActivity p0,String p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, n.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       Uri uri = null;
       Intent intent = (p0 != null)? p0.getIntent(): uri;
       if (intent != null) {
          uri = intent.getData();
       }
       a.a(uri);
       return false;
    }
}
