package com.vivo.push.sdk.service.LinkProxyActivity;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import java.lang.String;
import com.vivo.push.util.p;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.Object;
import android.content.Context;
import com.vivo.push.util.z;
import java.lang.Exception;
import android.content.pm.PackageManager;
import java.util.List;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.ComponentName;
import com.kwai.plugin.dva.feature.core.hook.a;

public class LinkProxyActivity extends Activity	// class@00109c
{

    public void LinkProxyActivity(){
       super();
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       Intent intent = this.getIntent();
       if (intent == null) {
          p.d("LinkProxyActivity", "enter RequestPermissionsActivity onCreate, intent is null, finish");
          this.finish();
          return;
       }else {
          int i = 1;
          Window window = this.getWindow();
          window.setGravity(0x800033);
          WindowManager$LayoutParams attributes = window.getAttributes();
          attributes.x = 0;
          attributes.y = 0;
          attributes.height = i;
          attributes.width = i;
          window.setAttributes(attributes);
          String packageName = this.getPackageName();
          p.d("LinkProxyActivity", this.hashCode()+" enter onCreate "+packageName);
          String str = "previous_intent";
          if (("com.vivo.abe").equals(packageName)) {
             try{
                if (intent.getExtras() == null) {
                   p.d("LinkProxyActivity", "adapterToService getExtras\(\) is null");
                }else {
                   intent = intent.getExtras().get(str);
                   if (intent == null) {
                      p.d("LinkProxyActivity", "adapterToService proxyIntent is null");
                   }else {
                      z.a(this, intent);
                   }
                }
             }catch(java.lang.Exception e7){
                p.a("LinkProxyActivity", e7.toString(), e7);
             }
          }else if(intent.getExtras() != null){
             intent = intent.getExtras().get(str);
             if (intent != null) {
                PackageManager packageManag = this.getPackageManager();
                if (packageManag != null) {
                   List list = packageManag.queryIntentServices(intent, 576);
                   if (list != null && !list.isEmpty()) {
                      ResolveInfo resolveInfo = list.get(0);
                      if (resolveInfo != null) {
                         resolveInfo = resolveInfo.serviceInfo;
                         if (resolveInfo != null && resolveInfo.exported != null) {
                         label_00c4 :
                            if (i) {
                               a.e(this, intent);
                            }else {
                               p.b("LinkProxyActivity", ("service\'s exported is ").concat(String.valueOf(i)));
                            }
                         }
                      }
                   }
                }
             }
             i = 0;
             goto label_00c4 ;
          }
       }
    }
    public void onDestroy(){
       super.onDestroy();
       p.d("LinkProxyActivity", this.hashCode()+" onDestory "+this.getPackageName());
    }
}
