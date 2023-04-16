package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.CallAdBridge;
import a59.e;
import a59.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import p59.t;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.CallAdBridge$mActivityLifecycleObserver$1;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.ad.webview.jsbridge.g;
import com.yxcorp.gifshow.ad.webview.jshandler.GetDataHandler;
import zl9.b;
import u59.g;
import com.yxcorp.gifshow.ad.webview.jshandler.b;
import com.yxcorp.gifshow.ad.webview.jshandler.e;
import com.yxcorp.gifshow.ad.webview.jshandler.e$a;
import com.yxcorp.gifshow.ad.webview.jshandler.a;
import c59.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import z49.d;
import p59.y;
import org.json.JSONObject;
import a59.a;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.tuna.js_params.BusinessJsParams;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.CallAdBridge$a;
import java.util.Objects;
import java.lang.StringBuilder;
import yx.j0;
import java.util.Map;
import com.yxcorp.gifshow.ad.webview.jsbridge.i;
import f55.g;
import zl9.e;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public final class CallAdBridge extends e	// class@00180e
{
    public g b;
    public t c;
    public final LifecycleObserver d;
    public f e;

    public void CallAdBridge(f p0){
       a.p(p0, "bridgeContext");
       super();
       this.e = p0;
       this.c = new t();
       this.d = new CallAdBridge$mActivityLifecycleObserver$1(this);
       p0.a = this.e.b();
       QPhoto qPhoto = this.e.e();
       if (qPhoto != null) {
          this.c.d = qPhoto.mEntity;
       }
       g og = new g(this.e.b());
       this.b = og;
       og.f(new GetDataHandler(this.c));
       this.b.f(new g());
       this.b.f(new b(this.c));
       e$a uoa = null;
       this.b.f(new e(this.c, uoa));
       this.b.f(new a(this.c));
       CallAdBridge tb = this.b;
       CallAdBridge tc = this.c;
       String str = "2";
       if (!PatchProxy.applyVoidTwoRefs(tb, tc, uoa, d.class, str)) {
          if (!PatchProxy.applyVoidTwoRefs(tb, tc, uoa, d.class, str)) {
             a.p(tb, "kwaiAdJSBridge");
             a.p(tc, "jsBridgeContext");
             tb.f(new y(tc));
          }
          a.p(tb, "kwaiAdJSBridge");
          a.p(tc, "jsBridgeContext");
       }
       return;
    }
    public String a(){
       return "callAdYodaBridge";
    }
    public Object c(JSONObject p0,a p1){
       CallAdBridge$a obj = PatchProxy.applyTwoRefs(p0, p1, this, CallAdBridge.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       String str = "";
       String str1 = p0.optString("action", str);
       BusinessJsParams uBusinessJsP = new BusinessJsParams();
       uBusinessJsP.mAction = str1;
       uBusinessJsP.mData = p0.optString("data", str);
       uBusinessJsP.mCallback = str;
       CallAdBridge tb = this.b;
       obj = new CallAdBridge$a(p1, str1);
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidTwoRefs(uBusinessJsP, obj, tb, g.class, "4")) {
          int i = 0;
          Object[] objArray = new Object[i];
          j0.f("KwaiAdJSBridge", "callTKAdBridge =="+uBusinessJsP, objArray);
          b uob = tb.a.get(uBusinessJsP.mAction);
          if (uob == null) {
             uob = tb.d;
          }
          if (uob != null) {
             i oi = new i(tb, obj);
             if (tb.e == null) {
                uob.e(uBusinessJsP.mData, oi);
             }else {
                tb.d(obj, a.a.q(new JsErrorResult(i, "bridge has destroyed")));
             }
          }
       }
       return "call ad bridge will return data with callback";
    }
    public void g(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CallAdBridge.class, "3")) {
          return;
       }
       Activity uActivity = this.e.b();
       if (!uActivity instanceof GifshowActivity) {
          uActivity = objArray;
       }
       if (uActivity != null) {
          Lifecycle lifecycle = uActivity.getLifecycle();
          if (lifecycle != null) {
             lifecycle.removeObserver(this.d);
          }
       }
       CallAdBridge tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, g.class, "11")) {
          objArray = new Object[0];
          j0.f("KwaiAdJSBridge", "destroy jsInterface", objArray);
          Iterator iterator = tb.a.entrySet().iterator();
          while (iterator.hasNext()) {
             b value = iterator.next().getValue();
             if (value != null) {
                value.onDestroy();
             }
          }
          tb.e = true;
       }
       return;
    }
    public void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CallAdBridge.class, "2")) {
          return;
       }
       Activity uActivity = this.e.b();
       if (uActivity instanceof GifshowActivity) {
          objArray = uActivity;
       }
       if (objArray != null) {
          Lifecycle lifecycle = objArray.getLifecycle();
          if (lifecycle != null) {
             lifecycle.addObserver(this.d);
          }
       }
       return;
    }
}
