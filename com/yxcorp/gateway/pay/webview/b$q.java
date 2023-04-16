package com.yxcorp.gateway.pay.webview.b$q;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsPageTitleParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import java.lang.CharSequence;
import android.widget.TextView;

public class b$q extends d	// class@00128f
{
    public final String e;
    public final b f;

    public void b$q(b p0,PayWebViewActivity p1,String p2){
       this.f = p0;
       this.e = p2;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$q.class, "1")) {
       }else {
          g.d("PayJsInject: setPageTitle: params="+this.e);
          this.f.a.mTitleTv.setText(p0.mTitle);
       }
       return;
    }
}
