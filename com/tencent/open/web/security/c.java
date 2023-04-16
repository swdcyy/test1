package com.tencent.open.web.security.c;
import com.tencent.open.a$a;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.tencent.open.log.SLog;
import java.lang.Object;
import java.lang.StringBuilder;
import org.json.JSONObject;
import com.tencent.open.c.c;
import org.json.JSONException;
import java.lang.ref.WeakReference;
import java.lang.StringBuffer;

public class c extends a$a	// class@000f8b
{
    public String d;

    public void c(WebView p0,long p1,String p2,String p3){
       super(p0, p1, p2);
       this.d = p3;
    }
    public void a(){
       SLog.d("openSDK_LOG.SecureJsListener", "-->onNoMatchMethod...");
    }
    public void a(Object p0){
       SLog.v("openSDK_LOG.SecureJsListener", "-->onComplete, result: "+p0);
    }
    public void a(String p0){
       SLog.v("openSDK_LOG.SecureJsListener", "-->onCustomCallback, js: "+p0);
       JSONObject jSONObject = new JSONObject();
       int i = (!c.a)? -4: 0;
       try{
          jSONObject.put("result", i);
          jSONObject.put("sn", this.b);
          jSONObject.put("data", p0);
       }catch(org.json.JSONException e5){
          e5.printStackTrace();
       }
       this.b(jSONObject.toString());
       return;
    }
    public final void b(String p0){
       WebView webView = this.a.get();
       if (webView != null) {
          p0 = "javascript:"+"if\(!!"+this.d+"\){"+this.d+"\("+p0+"\)}";
          SLog.v("openSDK_LOG.SecureJsListener", "-->callback, callback: "+p0);
          webView.loadUrl(p0);
       }
       return;
    }
}
