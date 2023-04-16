package k59.c;
import myc.h;
import android.app.Activity;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.SslErrorHandler;
import android.net.http.SslError;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import mxb.c;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$H5ControlInfo;
import yx.j0;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.yoda.kernel.cookie.YodaCookie;
import com.kwai.yoda.Yoda;
import com.kwai.yoda.bridge.YodaBridgeHandler;
import java.util.Objects;
import ny7.h;
import tb7.g;
import java.util.Map;
import java.util.Set;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.sdk.switchconfig.a;
import k59.c$a;
import java.lang.reflect.Type;
import ekd.p0;
import java.util.Collection;
import ekd.q;

public class c extends h	// class@002ad0
{
    public final BaseFeed l;

    public void c(Activity p0,YodaBaseWebView p1,BaseFeed p2){
       super(p0, p1);
       this.l = p2;
    }
    public boolean c(WebView p0,SslErrorHandler p1,SslError p2){
       boolean b;
       Object[] objArray;
       int b1;
       c$a uoa;
       PhotoAdvertisement photoAdverti;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "1");
       if (p0 != patchProxyRe) {
          return p0.booleanValue();
       }
       c tl = this.l;
       String obj = null;
       p1 = PatchProxy.applyOneRefs(tl, obj, c.class, "15");
       if (p1 != patchProxyRe) {
          b = p1.booleanValue();
       }else if(tl != null){
          photoAdverti = tl.get("AD");
       }else {
          photoAdverti = obj;
       }
       if (photoAdverti != null) {
          PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
          if (adData != null) {
             adData = adData.mH5ControlInfo;
             if (adData != null) {
                b = adData.mDisallowShowSslErrorDialog;
             }
          }
       }
       b = null;
       if (b != null) {
          objArray = new Object[0];
          j0.f("AdKwaiPageActionManager", "disallow show ssl error dialog by photo", objArray);
          return true;
       }else {
          String url = p2.getUrl();
          p2 = PatchProxy.applyOneRefs(url, this, c.class, "2");
          if (p2 != patchProxyRe) {
             b = p2.booleanValue();
          }else if(!TextUtils.x(url) && !YodaCookie.f.m(url)){
             YodaBridgeHandler yodaBridgeHa = Yoda.get().getYodaBridgeHandler();
             Objects.requireNonNull(yodaBridgeHa);
             Object h obj1 = PatchProxy.applyOneRefs(url, yodaBridgeHa, YodaBridgeHandler.class, "31");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                h oh = yodaBridgeHa.e();
                Objects.requireNonNull(oh);
                obj1 = h.class;
                Object obj2 = PatchProxy.applyOneRefs(url, oh, obj1, "23");
                if (obj2 != patchProxyRe) {
                   b1 = obj2.booleanValue();
                }else {
                   obj1 = PatchProxy.applyOneRefs(url, oh, obj1, "24");
                   if (obj1 != patchProxyRe) {
                   }else if(url == null || !url.length()){
                      uoa = 1;
                   }else {
                      uoa = null;
                   }
                   if (!uoa) {
                      String str = g.a(url);
                      obj1 = (!str.length())? 1: null;
                      if (!obj1) {
                         obj1 = g.c(str, CollectionsKt___CollectionsKt.G5(oh.e().keySet()));
                      }
                   }
                   obj1 = obj;
                   b1 = (obj1 == null || !obj1.length())? 1: 0;
                   b1 = b1 ^ true;
                }
             }
             if (!b1) {
                c$a value = a.t().getValue("enableShowAdWebSSLDialog", c$a.class, obj);
                if (value != null) {
                   obj = p0.n(url);
                   if (value.enable != null) {
                      if (!q.f(value.disableHostList)) {
                         b = value.disableHostList.contains(obj) ^ true;
                      }
                   }else if(q.f(value.enableHostList)){
                      b = 0;
                   }else {
                      b = value.enableHostList.contains(obj);
                   }
                }
             }
          }
       label_0071 :
          b = true;
          if (!b) {
             objArray = new Object[0];
             j0.f("AdKwaiPageActionManager", "disallow show ssl error dialog by switch", objArray);
             return true;
          }else {
             return 0;
          }
       }
    }
}
