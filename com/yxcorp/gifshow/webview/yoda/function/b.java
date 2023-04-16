package com.yxcorp.gifshow.webview.yoda.function.b;
import com.kwai.yoda.function.c;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import p55.a;
import com.yxcorp.gifshow.webview.helper.e;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.webview.yoda.function.b$a;
import f55.g;
import com.kwai.bridge.a;
import com.kwai.yoda.function.FunctionResultParams;
import com.kuaishou.webkit.WebView;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import org.json.JSONException;
import ty7.c;
import ty7.g;
import ty7.d;

public class b extends c	// class@0017b5
{
    public String f;
    public String g;

    public void b(){
       super();
    }
    public void b(String p0,String p1){
       super();
       this.f = p0;
       this.g = p1;
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       b uob2;
       b uob3;
       b uob = this;
       b uob1 = b.class;
       if (PatchProxy.isSupport(uob1)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uob1, "1")) {
             return;
          }
       }
       a uoa = e.e(p0);
       if (!TextUtils.x(uob.f) && !TextUtils.x(uob.g)) {
          uob2 = uob.f;
          uob3 = uob.g;
       }else {
          uob2 = p1;
          uob3 = p2;
       }
       String str = (p3 == null)? "": p3;
       b$a uoa1 = new b$a(this, p0, p3, p1, p2, p4);
       a.f(uoa, uob2, uob3, str, v12);
       return;
    }
    public void s(YodaBaseWebView p0,String p1,FunctionResultParams p2,String p3,String p4,String p5,String p6){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,null,p6};
          if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
             return;
          }
       }
       if (("Kwai").equalsIgnoreCase(p3)) {
          e.a(p0, this.u(p1), p2);
       }else {
          this.l(p0, p2, p3, p4, null, p6);
       }
       return;
    }
    public void t(YodaBaseWebView p0,String p1,String p2,String p3,String p4,String p5,String p6){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,null,p6};
          if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
             return;
          }
       }
       if (("Kwai").equalsIgnoreCase(p3)) {
          e.a(p0, this.u(p1), p2);
       }else {
          this.m(p0, p2, p3, p4, null, p6);
       }
       return;
    }
    public final String u(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return new JSONObject(p0).getString("callback");
       }catch(org.json.JSONException e3){
          e3.printStackTrace();
          return null;
       }
    }
    public void v(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "4")) {
             return;
          }
       }
       if (p0.getDebugKit() != null) {
          g og = new g(p1, p2, p3, p4);
          og.a = "bridgecenter";
          p0.getDebugKit().a(og);
       }
       return;
    }
}
