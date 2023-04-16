package com.yxcorp.gifshow.webview.yoda.function.b$a;
import f55.g;
import com.yxcorp.gifshow.webview.yoda.function.b;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Object;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.yoda.function.FunctionResultParams;
import yz7.e;
import java.util.Objects;
import ty7.c;
import ty7.e;
import ty7.d;
import fg6.a;
import com.google.gson.Gson;
import org.json.JSONObject;
import java.lang.StringBuilder;
import sy7.b;
import java.lang.Throwable;

public class b$a implements g	// class@0017b4
{
    public final YodaBaseWebView b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final b g;

    public void b$a(b p0,YodaBaseWebView p1,String p2,String p3,String p4,String p5){
       this.g = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public void a(int p0,String p1,Bundle p2){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, b$a.class, "2")) {
          return;
       }
       FunctionResultParams uFunctionRes = new FunctionResultParams();
       uFunctionRes.mResult = p0;
       uFunctionRes.mMessage = p1;
       uFunctionRes.mMsg = p1;
       this.g.s(this.b, this.c, uFunctionRes, this.d, this.e, null, this.f);
       b$a tg = this.g;
       b$a tb = this.b;
       b$a td = this.d;
       b$a te = this.e;
       b$a tc = this.c;
       String str = e.f(uFunctionRes);
       Objects.requireNonNull(tg);
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray = new Object[]{tb,td,te,tc,str};
          if (!PatchProxy.applyVoid(objArray, tg, b.class, "5")) {
          label_006a :
             if (tb.getDebugKit() != null) {
                e uoe = new e(tc, str, td, te);
                uoe.a = "bridgecenter";
                tb.getDebugKit().a(uoe);
             }
          }
       }else {
          goto label_006a ;
       }
       return;
    }
    public void onSuccess(Object p0){
       Object obj = this;
       String str = p0;
       String str1 = "result";
       if (PatchProxy.applyVoidOneRefs(str, obj, b$a.class, "1")) {
          return;
       }
       int i = 1;
       if (str == null) {
          FunctionResultParams uFunctionRes = new FunctionResultParams();
          uFunctionRes.mResult = i;
          obj.g.s(obj.b, obj.c, uFunctionRes, obj.d, obj.e, null, obj.f);
          obj.g.v(obj.b, obj.d, obj.e, obj.c, e.f(uFunctionRes));
          return;
       }else if(str instanceof FunctionResultParams){
          obj.g.s(obj.b, obj.c, str, obj.d, obj.e, null, obj.f);
          obj.g.v(obj.b, obj.d, obj.e, obj.c, e.f(p0));
          return;
       }else if(str instanceof String){
       }else {
          str = a.a.q(str);
       }
       Object obj1 = str;
       try{
          JSONObject jSONObject = new JSONObject(obj1);
          if (!jSONObject.has(str1)) {
             jSONObject.put(str1, i);
          }
          obj.g.t(obj.b, obj.c, jSONObject.toString(), obj.d, obj.e, null, obj.f);
          obj.g.v(obj.b, obj.d, obj.e, obj.c, jSONObject.toString());
       }catch(org.json.JSONException e0){
          b.b.e("CommonBridgeFunction callback for: "+obj.d+"."+obj.e, e0);
          obj.g.t(obj.b, obj.c, obj1, obj.d, obj.e, null, obj.f);
          obj.g.v(obj.b, obj.d, obj.e, obj.c, obj1);
       }
       return;
    }
}
