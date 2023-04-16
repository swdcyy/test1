package com.yxcorp.gateway.pay.webview.yoda.b$m;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsExitParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import android.content.Intent;
import lv8.l;

public class b$m extends p0	// class@0012bc
{
    public final b g;

    public void b$m(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$m.class, "1")) {
       }else {
          g.d("bridge:exitWebViewWithData. params="+p0.mData+", url="+b.a(this.g).getUrl());
          Intent intent = new Intent();
          intent.putExtra("exit_data", p0.mData);
          this.g.a.setResult(-1, intent);
          this.g.c.handleFinished(p0.mData);
       }
       return;
    }
}
