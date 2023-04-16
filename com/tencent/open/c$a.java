package com.tencent.open.c$a;
import com.kuaishou.webkit.WebViewClient;
import com.tencent.open.c;
import com.tencent.open.c$1;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.tencent.open.c.b;
import android.widget.AbsoluteLayout;
import android.graphics.Bitmap;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import com.tencent.open.c$c;
import com.tencent.tauth.UiError;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;
import android.app.Dialog;
import com.tencent.open.utils.h;
import org.json.JSONObject;
import com.tencent.open.utils.k;

public class c$a extends WebViewClient	// class@000f54
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void c$a(c p0,c$1 p1){
       super(p0);
    }
    public void onPageFinished(WebView p0,String p1){
       super.onPageFinished(p0, p1);
       c.c(this.a).setVisibility(0);
    }
    public void onPageStarted(WebView p0,String p1,Bitmap p2){
       SLog.v("openSDK_LOG.PKDialog", "Webview loading URL: "+p1);
       super.onPageStarted(p0, p1, p2);
    }
    public void onReceivedError(WebView p0,int p1,String p2,String p3){
       super.onReceivedError(p0, p1, p2, p3);
       c.b(this.a).onError(new UiError(p1, p2, p3));
       if (c.a(this.a) != null && c.a(this.a).get() != null) {
          Toast.makeText(c.a(this.a).get(), "网络连接异常或系统错误", 0).show();
       }
       this.a.dismiss();
       return;
    }
    public boolean shouldOverrideUrlLoading(WebView p0,String p1){
       SLog.v("openSDK_LOG.PKDialog", "Redirect URL: "+p1);
       if (p1.startsWith(h.a().a(c.a(this.a).get(), "auth://tauth.qq.com/"))) {
          c.b(this.a).onComplete(k.c(p1));
          this.a.dismiss();
          return true;
       }else if(p1.startsWith("auth://cancel")){
          c.b(this.a).onCancel();
          this.a.dismiss();
          return true;
       }else if(p1.startsWith("auth://close")){
          this.a.dismiss();
          return true;
       }else {
          return false;
       }
    }
}
