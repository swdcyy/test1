package l05.a;
import com.yxcorp.gifshow.webview.yoda.g;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import smc.c;
import com.yxcorp.gifshow.tuna.webview.config.IPolicyDataModel;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class a extends g	// class@0028cd
{
    public c j;
    public IPolicyDataModel k;

    public void a(YodaBaseWebView p0,JsNativeEventCommunication p1,c p2,IPolicyDataModel p3){
       super(p0);
       this.A(p1);
       this.j = p2;
       this.k = p3;
    }
    public boolean shouldOverrideUrlLoading(WebView p0,String p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.j;
       if (obj != null && obj.a(p1, this.k)) {
          return true;
       }
       return super.shouldOverrideUrlLoading(p0, p1);
    }
    public boolean z(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!TextUtils.x(p0) && (!p0.startsWith("http") && (!p0.startsWith("https") && (!p0.equalsIgnoreCase("ks") && !p0.equalsIgnoreCase("kwai"))))) {
          return true;
       }
       return false;
    }
}
