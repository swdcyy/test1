package com.xiaomi.mipush.sdk.NotificationClickedActivity;
import android.app.Activity;
import android.content.Intent;
import java.lang.String;
import android.os.Parcelable;
import android.content.ComponentName;
import rs8.c;
import android.content.Context;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.Throwable;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import android.os.Handler;
import vs8.p;
import java.lang.Runnable;
import android.content.IntentFilter;
import com.xiaomi.mipush.sdk.ad;
import vs8.h0;
import android.content.BroadcastReceiver;
import java.lang.Object;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public final class NotificationClickedActivity extends Activity	// class@0010e1
{
    public BroadcastReceiver a;
    public Handler a;

    public void NotificationClickedActivity(){
       super();
    }
    public final void a(Intent p0){
       if (p0 != null) {
          try{
             p0 = p0.getParcelableExtra("mipush_serviceIntent");
             if (p0 != null) {
                p0.setComponent(new ComponentName(this.getPackageName(), "com.xiaomi.mipush.sdk.PushMessageHandler"));
                p0.putExtra("is_clicked_activity_call", true);
                c.s("clicked activity start service.");
                a.e(this, p0);
             }
          }catch(java.lang.Exception e4){
             c.o(e4);
          }
       }
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       Window window = this.getWindow();
       WindowManager$LayoutParams attributes = window.getAttributes();
       attributes.height = 1;
       attributes.width = 1;
       attributes.gravity = 0x800033;
       window.setAttributes(attributes);
       Handler handler = new Handler();
       this.a = handler;
       handler.postDelayed(new p(this), 3000);
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("action_clicked_activity_finish");
       ad uoad = new ad(this);
       try{
          this.a = uoad;
          this.registerReceiver(uoad, intentFilter, h0.a(this), null);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void onDestroy(){
       super.onDestroy();
       NotificationClickedActivity ta = this.a;
       try{
          ta.removeCallbacksAndMessages(null);
          UniversalReceiver.f(this, this.a);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void onNewIntent(Intent p0){
       super.onNewIntent(p0);
       this.setIntent(p0);
    }
    public void onResume(){
       super.onResume();
       this.a(this.getIntent());
    }
}
