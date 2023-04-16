package com.alipay.sdk.app.APayEntranceActivity;
import android.app.Activity;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import s6.a;
import k6.a;
import j6.b;
import java.lang.Object;
import com.alipay.sdk.app.APayEntranceActivity$a;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.content.Intent;
import android.os.Bundle;
import s6.a$a;
import android.os.SystemClock;

public class APayEntranceActivity extends Activity	// class@000e87
{
    public String b;
    public String c;
    public a d;
    public static final ConcurrentHashMap e;

    static {
       APayEntranceActivity.e = new ConcurrentHashMap();
    }
    public void APayEntranceActivity(){
       super();
    }
    public void finish(){
       APayEntranceActivity tc = this.c;
       a.c(this.d, "biz", "BSAFinish", this.c+"|"+TextUtils.isEmpty(this.b));
       if (TextUtils.isEmpty(this.b)) {
          this.b = b.a();
       }
       if (tc != null) {
          APayEntranceActivity$a uoa = APayEntranceActivity.e.remove(tc);
          if (uoa != null) {
             uoa.a(this.b);
          }
       }
       super.finish();
       return;
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       super.onActivityResult(p0, p1, p2);
       if (p0 == 1000) {
          this.b = (p2 != null)? p2.getStringExtra("result"): b.a();
       label_001f :
          this.finish();
       }
       return;
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       p0 = this.getIntent().getExtras();
       if (p0 == null) {
          this.finish();
          return;
       }else {
          String str = p0.getString("ap_order_info");
          String str1 = p0.getString("ap_target_packagename");
          this.c = p0.getString("ap_session");
          String str2 = p0.getString("ap_local_info", "{}");
          if (!TextUtils.isEmpty(this.c)) {
             a uoa = a$a.b(this.c);
             this.d = uoa;
             a.c(uoa, "biz", "BSAEntryCreate", this.c+"|"+SystemClock.elapsedRealtime());
          }
          Intent intent = new Intent();
          intent.putExtra("order_info", str);
          intent.putExtra("localInfo", str2);
          intent.setClassName(str1, "com.alipay.android.app.flybird.ui.window.FlyBirdWindowActivity");
          this.startActivityForResult(intent, 1000);
          return;
       }
    }
}
