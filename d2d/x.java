package d2d.x;
import lnc.c3$a;
import java.lang.String;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.login.userlogin.pluginimpl.LoginPluginImpl;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import jyc.b;
import java.net.URL;
import d2d.a0;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$d;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.c;

public final class x implements c3$a	// class@001469
{
    public final String a;

    public void x(String p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       x ta = this.a;
       LoginPluginImpl loginPluginI = LoginPluginImpl.class;
       if (PatchProxy.applyVoidTwoRefs(p0, ta, null, loginPluginI, "19")) {
       }else if(LoginPluginImpl.b){
          String str = (LoginPluginImpl.c == null)? 1: null;
          String str1 = b.c(ta);
          try{
             LoginPluginImpl.c = new URL(str1).getPath();
          }catch(java.net.MalformedURLException e0){
          }
          if (str && !PatchProxy.applyVoid(null, null, loginPluginI, "20")) {
             KwaiYodaWebViewActivity.A3(new a0());
          }
          if (!p0 instanceof KwaiYodaWebViewActivity || !LoginPluginImpl.g0(p0.C3())) {
             LoginPluginImpl.b = true;
             c.i(p0, KwaiWebViewActivity.N3(p0, e0).o("ks://account_appeal").a());
          }
       }
       return;
    }
}
