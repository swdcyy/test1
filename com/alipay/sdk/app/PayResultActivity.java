package com.alipay.sdk.app.PayResultActivity;
import android.app.Activity;
import java.util.HashMap;
import android.os.Handler;
import com.alipay.sdk.app.PayResultActivity$a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Intent;
import java.lang.StringBuilder;
import java.net.URLEncoder;
import android.net.Uri;
import java.lang.Throwable;
import u6.c;
import j6.b;
import com.alipay.sdk.app.PayResultActivity$b;
import java.lang.Object;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import s6.a;
import s6.a$a;
import k6.a;

public final class PayResultActivity extends Activity	// class@000e93
{
    public a b;
    public static final HashMap c;

    static {
       PayResultActivity.c = new HashMap();
    }
    public void PayResultActivity(){
       super();
       this.b = null;
    }
    public static void a(Activity p0,int p1){
       new Handler().postDelayed(new PayResultActivity$a(p0), (long)p1);
    }
    public static void b(Activity p0,String p1,String p2,String p3){
       Intent intent;
       if (!TextUtils.isEmpty(p2) && !TextUtils.isEmpty(p3)) {
          try{
             intent = new Intent();
             intent.setPackage("hk.alipay.wallet");
             intent.setData(Uri.parse("alipayhk://platformapi/startApp?appId=20000125&schemePaySession="+URLEncoder.encode(p1, "UTF-8")+"&orderSuffix="+URLEncoder.encode(p2, "UTF-8")+"&packageName="+URLEncoder.encode(p3, "UTF-8")+"&externalPkgName="+URLEncoder.encode(p3, "UTF-8")));
          }catch(java.io.UnsupportedEncodingException e5){
             c.c(e5);
          }
          p0.startActivity(intent);
       }
    label_0064 :
       return;
    }
    public static void c(String p0){
       PayResultActivity$b.b = b.a();
       PayResultActivity.d(PayResultActivity.c, p0);
    }
    public static boolean d(HashMap p0,String p1){
       if (p0 == null || p1 == null) {
          return false;
       }
       p0 = p0.get(p1);
       if (p0 == null) {
          return false;
       }
       _monitor_enter(p0);
       p0.notifyAll();
       _monitor_exit(p0);
       return true;
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       String str = "orderSuffix";
       super.onCreate(p0);
       Intent intent = this.getIntent();
       if (TextUtils.isEmpty(intent.getStringExtra(str)) ^ 0x01) {
          PayResultActivity$b.a = intent.getStringExtra("phonecashier.pay.hash");
          str = intent.getStringExtra(str);
          String stringExtra = intent.getStringExtra("externalPkgName");
          a uoa = a$a.a(intent);
          this.b = uoa;
          if (uoa == null) {
             this.finish();
          }
          PayResultActivity.b(this, PayResultActivity$b.a, str, stringExtra);
          PayResultActivity.a(this, 300);
          return;
       }else if(this.b == null){
          this.finish();
       }
       str = intent.getStringExtra("phonecashier.pay.result");
       int intExtra = intent.getIntExtra("phonecashier.pay.resultOrderHash", 0);
       if (!intExtra || !TextUtils.equals(PayResultActivity$b.a, String.valueOf(intExtra))) {
          a.h(this.b, "biz", "SchemePayWrongHashEx", "Expected "+PayResultActivity$b.a+", got "+intExtra);
          PayResultActivity.c(PayResultActivity$b.a);
          PayResultActivity.a(this, 300);
          return;
       }else if(!TextUtils.isEmpty(str)){
          PayResultActivity$b.b = str;
          PayResultActivity.d(PayResultActivity.c, PayResultActivity$b.a);
       }else {
          PayResultActivity.c(PayResultActivity$b.a);
       }
       PayResultActivity$b.a = "";
       PayResultActivity.a(this, 300);
       return;
    }
}
