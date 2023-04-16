package com.yxcorp.gateway.pay.webview.b$h;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsToastParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import android.widget.Toast;

public class b$h extends d	// class@001286
{
    public final b e;

    public void b$h(b p0,PayWebViewActivity p1){
       this.e = p0;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$h.class, "1")) {
       }else if(!TextUtils.x(p0.mText)){
          Toast.makeText(this.e.a, p0.mText, 0).show();
       }
       return;
    }
}
