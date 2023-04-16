package com.yxcorp.gateway.pay.webview.b$l;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsExitParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import android.content.Intent;
import android.app.Activity;

public class b$l extends d	// class@00128a
{
    public final String e;
    public final b f;

    public void b$l(b p0,PayWebViewActivity p1,String p2){
       this.f = p0;
       this.e = p2;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$l.class, "1")) {
       }else {
          g.d("PayJsInject exitWebViewWithData params:"+this.e);
          Intent intent = new Intent();
          intent.putExtra("exit_data", p0.mData);
          this.f.a.setResult(-1, intent);
          this.f.a.handleFinished(p0.mData);
       }
       return;
    }
}
