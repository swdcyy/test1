package com.tencent.open.TDialog$FbWebViewClient;
import com.kuaishou.webkit.WebViewClient;
import com.tencent.open.TDialog;
import com.tencent.open.TDialog$1;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.tencent.open.c.b;
import android.widget.AbsoluteLayout;
import android.graphics.Bitmap;
import java.lang.StringBuilder;
import com.tencent.open.log.SLog;
import com.tencent.open.TDialog$OnTimeListener;
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
import android.net.Uri;
import android.content.Intent;
import java.lang.Exception;

public class TDialog$FbWebViewClient extends WebViewClient	// class@000f34
{
    public final TDialog a;

    public void TDialog$FbWebViewClient(TDialog p0){
       this.a = p0;
       super();
    }
    public void TDialog$FbWebViewClient(TDialog p0,TDialog$1 p1){
       super(p0);
    }
    public void onPageFinished(WebView p0,String p1){
       super.onPageFinished(p0, p1);
       TDialog.d(this.a).setVisibility(0);
    }
    public void onPageStarted(WebView p0,String p1,Bitmap p2){
       SLog.v("openSDK_LOG.TDialog", "Webview loading URL: "+p1);
       super.onPageStarted(p0, p1, p2);
    }
    public void onReceivedError(WebView p0,int p1,String p2,String p3){
       super.onReceivedError(p0, p1, p2, p3);
       TDialog.c(this.a).onError(new UiError(p1, p2, p3));
       if (TDialog.a(this.a) != null && TDialog.a(this.a).get() != null) {
          Toast.makeText(TDialog.a(this.a).get(), "网络连接异常或系统错误", 0).show();
       }
       this.a.dismiss();
       return;
    }
    public boolean shouldOverrideUrlLoading(WebView p0,String p1){
       Uri uri;
       SLog.v("openSDK_LOG.TDialog", "Redirect URL: "+p1);
       if (p1.startsWith(h.a().a(TDialog.a(this.a).get(), "auth://tauth.qq.com/"))) {
          TDialog.c(this.a).onComplete(k.c(p1));
          if (this.a.isShowing()) {
             this.a.dismiss();
          }
          return true;
       }else if(p1.startsWith("auth://cancel")){
          TDialog.c(this.a).onCancel();
          if (this.a.isShowing()) {
             this.a.dismiss();
          }
          return true;
       }else if(p1.startsWith("auth://close")){
          if (this.a.isShowing()) {
             this.a.dismiss();
          }
          return true;
       }else {
          String str = "download://";
          if (p1.startsWith(str) || p1.endsWith(".apk")) {
             try{
                if (p1.startsWith(str)) {
                   uri = Uri.parse(Uri.decode(p1.substring(11)));
                label_00bc :
                   Intent intent = new Intent("android.intent.action.VIEW", uri);
                   intent.addFlags(0x10000000);
                   if (TDialog.a(this.a) != null && TDialog.a(this.a).get() != null) {
                      TDialog.a(this.a).get().startActivity(intent);
                   }
                }else {
                   uri = Uri.parse(Uri.decode(p1));
                   goto label_00bc ;
                }
             }catch(java.lang.Exception e3){
                e3.printStackTrace();
             }
             return true;
          }else if(p1.startsWith("auth://progress")){
             return true;
          }else {
             return false;
          }
       }
    }
}
