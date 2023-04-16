package com.yxcorp.gifshow.webview.bridge.a$h;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.a;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.component.JsHttpRequestParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vxc.s;
import vxc.t;
import wkd.b;
import eyc.a;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.HashMap;
import com.yxcorp.gifshow.retrofit.service.KwaiHttpsService;
import java.util.Map;
import brd.t;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiApiService;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;

public class a$h extends z	// class@001714
{
    public final a k;

    public void a$h(a p0,Activity p1,WebView p2){
       this.k = p0;
       super(p1, p2);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$h.class, "1")) {
       }else {
          s os = new s(this, p0);
          t ot = new t(this, p0);
          if (b.a(-1275906972).isKwaiUrl(p0.mUrl)) {
             HashMap hashMap = new Gson().h(p0.mHeader.toString(), HashMap.class);
             if ((p0.mUrl).startsWith("https://")) {
                b.a(-171002483).webHttpCall(p0.mUrl, hashMap, p0.mBody).subscribe(os, ot);
             }else if((p0.mUrl).startsWith("http://")){
                b.a(0x330163e).webHttpCall(p0.mUrl, hashMap, p0.mBody).subscribe(os, ot);
             }
          }else {
             this.d(p0.mCallback, new JsErrorResult(412, R.string.arg_RES_7f1038e7));
          }
       }
       return;
    }
}
