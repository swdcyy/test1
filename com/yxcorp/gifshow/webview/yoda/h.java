package com.yxcorp.gifshow.webview.yoda.h;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Object;
import java.lang.String;
import erd.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import com.yxcorp.gifshow.webview.yoda.h$a;
import ny7.a;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o56.c;
import o56.a;
import xf6.l;
import com.kwai.yoda.model.LaunchModel;
import com.kwai.yoda.model.LaunchModelInternal;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import com.yxcorp.gifshow.webview.e;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import java.util.Set;
import java.lang.Iterable;
import brd.t;
import txc.q;
import erd.r;
import com.yxcorp.gifshow.webview.d;
import erd.o;
import txc.p;
import brd.a0;

public class h	// class@0017c5
{
    public YodaBaseWebView a;
    public final Object b;
    public StringBuilder c;
    public final String d;
    public boolean e;

    public void h(YodaBaseWebView p0,Object p1,String p2){
       super();
       this.b = p1;
       this.d = p2;
    }
    public Object a(){
       return this.b;
    }
    public String b(){
       return this.d;
    }
    public YodaBaseWebView c(){
       return this.a;
    }
    public void d(){
    }
    public void e(YodaBaseWebView p0,String p1,g p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "5")) {
          return;
       }
       p0.getJavascriptBridge().o(this.d, p1, new h$a(this, p2));
       return;
    }
    public void f(YodaBaseWebView p0){
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "1")) {
          return;
       }
       this.a = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LaunchModel obj = PatchProxy.apply(objArray, this, oh, "2");
       boolean b = true;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          boolean b1 = false;
          if (a.a().c() && l.c("key_keyconfig_yoda_evaluate", b1)) {
             b1 = true;
          }
          if (!b1) {
             obj = this.a.getLaunchModel();
             String url = (obj != null)? obj.getUrl(): objArray;
             if (!TextUtils.isEmpty(url)) {
                Uri uri = Uri.parse(url);
                Object obj1 = PatchProxy.applyOneRefs(uri, objArray, e.class, "3");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                   String host = uri.getHost();
                   if (!TextUtils.x(host)) {
                      b = t.fromIterable(e.c("yoda_disable_inject_kwai_white_list").entrySet()).filter(new q(host)).flatMapIterable(d.b).all(new p(uri)).e().booleanValue();
                   }
                }
             }
          }
       }
    label_009e :
       this.e = b;
       return;
    }
}
