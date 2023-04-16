package com.alipay.sdk.app.AlipayResultActivity;
import android.app.Activity;
import java.util.concurrent.ConcurrentHashMap;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.content.Intent;
import java.lang.String;
import s6.a;
import s6.a$a;
import java.lang.StringBuilder;
import android.os.SystemClock;
import k6.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Object;
import com.alipay.sdk.app.AlipayResultActivity$a;
import android.net.Uri;
import android.util.Base64;
import org.json.JSONObject;
import java.util.Iterator;
import java.lang.Throwable;
import b6.b;
import java.util.Map;
import b6.b$a;
import u6.c;
import android.content.Context;

public class AlipayResultActivity extends Activity	// class@000e89
{
    public static final ConcurrentHashMap b;

    static {
       AlipayResultActivity.b = new ConcurrentHashMap();
    }
    public void AlipayResultActivity(){
       super();
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       String str = "|";
       String str1 = "session";
       String str2 = "result";
       super.onCreate(p0);
       Intent intent = this.getIntent();
       String stringExtra = intent.getStringExtra(str1);
       Bundle bundleExtra = intent.getBundleExtra(str2);
       String stringExtra1 = intent.getStringExtra("scene");
       a uoa = a$a.b(stringExtra);
       if (uoa == null) {
          this.finish();
          return;
       }else {
          a.c(uoa, "biz", "BSPSession", stringExtra+str+SystemClock.elapsedRealtime());
          if (TextUtils.equals("mqpSchemePay", stringExtra1)) {
             AlipayResultActivity$a uoa1 = AlipayResultActivity.b.remove(stringExtra);
             if (uoa1 == null) {
                this.finish();
             }else {
                uoa1.a(bundleExtra.getInt("endCode"), bundleExtra.getString("memo"), bundleExtra.getString(str2));
                this.finish();
             }
             return;
          }else if(TextUtils.isEmpty(stringExtra) || (bundleExtra == null && intent.getData() != null)){
             JSONObject jSONObject = new JSONObject(new String(Base64.decode(intent.getData().getQuery(), 2), "UTF-8"));
             JSONObject jSONObject1 = jSONObject.getJSONObject(str2);
             stringExtra = jSONObject.getString(str1);
             a.c(uoa, "biz", "BSPUriSession", stringExtra);
             jSONObject = new Bundle();
             Iterator iterator = jSONObject1.keys();
             while (iterator.hasNext()) {
                String str3 = iterator.next();
                jSONObject.putString(str3, jSONObject1.getString(str3));
             }
             bundleExtra = jSONObject;
          }
       label_00d7 :
          if (TextUtils.isEmpty(stringExtra) || bundleExtra == null) {
             a.g(this, uoa, "", uoa.d);
             this.finish();
          }else {
             a.c(uoa, "biz", "PgReturn", SystemClock.elapsedRealtime());
             a.c(uoa, "biz", "PgReturnV", bundleExtra.getInt("endCode", -1)+str+bundleExtra.getString("memo", "-"));
             int i = 9000;
             b$a uoa2 = b.e.remove(stringExtra);
             if (uoa2 != null) {
                uoa2.a(i, "OK", bundleExtra);
             }
             a.g(this, uoa, "", uoa.d);
             this.finish();
          }
          return;
       }
    }
}
