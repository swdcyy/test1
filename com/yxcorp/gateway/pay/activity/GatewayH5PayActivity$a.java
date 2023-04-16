package com.yxcorp.gateway.pay.activity.GatewayH5PayActivity$a;
import com.kuaishou.webkit.WebViewClient;
import com.yxcorp.gateway.pay.activity.GatewayH5PayActivity;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.SslErrorHandler;
import android.net.http.SslError;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lv8.g;
import android.content.Context;
import lv8.u;
import java.lang.Exception;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class GatewayH5PayActivity$a extends WebViewClient	// class@001200
{
    public final GatewayH5PayActivity a;

    public void GatewayH5PayActivity$a(GatewayH5PayActivity p0){
       this.a = p0;
       super();
    }
    public void onReceivedSslError(WebView p0,SslErrorHandler p1,SslError p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, GatewayH5PayActivity$a.class, "2")) {
          return;
       }
       try{
          g.d("h5 pay onReceivedSslError");
          u.b(this.a, p1);
       }catch(java.lang.Exception e7){
          e7.printStackTrace();
       }
       return;
    }
    public boolean shouldOverrideUrlLoading(WebView p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, GatewayH5PayActivity$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if ((this.a.mProvider).equals("wechat")) {
          return GatewayH5PayActivity.access$100(this.a, p0, p1);
       }
       return GatewayH5PayActivity.access$200(this.a, p0, p1);
    }
}
