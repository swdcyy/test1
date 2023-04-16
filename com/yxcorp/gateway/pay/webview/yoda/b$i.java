package com.yxcorp.gateway.pay.webview.yoda.b$i;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsToastParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.Context;
import android.widget.Toast;

public class b$i extends p0	// class@0012b8
{
    public final b g;

    public void b$i(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$i.class, "1")) {
       }else if(!TextUtils.x(p0.mText)){
          Toast.makeText(this.g.a, p0.mText, 0).show();
       }
       return;
    }
}
