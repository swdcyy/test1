package com.android.kwai.platform.notification.core.config.RemoteConfigManager$fetchConfig$1;
import com.android.kwai.foundation.network.IRpcService$Callback;
import java.lang.Object;
import com.android.kwai.platform.notification.core.config.RemoteConfigManager;
import java.lang.Exception;
import n7.b;
import com.android.kwai.platform.notification.core.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.android.kwai.platform.notification.core.NotificationConfig;
import java.util.List;
import nsd.u;
import com.kwai.lib.interfacies.SpAdapter;
import com.google.gson.Gson;
import android.content.SharedPreferences$Editor;
import java.lang.System;

public final class RemoteConfigManager$fetchConfig$1 implements IRpcService$Callback	// class@00040a
{

    public void RemoteConfigManager$fetchConfig$1(){
       super();
    }
    public void onComplete(boolean p0){
       RemoteConfigManager.j.m(false);
    }
    public void onFailure(Exception p0,Object p1){
       b.b(this, p0, p1);
    }
    public void onSuccess(a p0){
       a.p(p0, "bean");
       RemoteConfigManager j = RemoteConfigManager.j;
       if (RemoteConfigManager.a(j) == null) {
          RemoteConfigManager.d(j, p0);
          NotificationConfig notification = p0.a();
          if (notification == null) {
             NotificationConfig notification1 = new NotificationConfig(null, null, false, 7, null);
          }
          RemoteConfigManager.c(j, notification);
       }
       try{
          SpAdapter.b.putString("notification_config", new Gson().q(p0));
       }catch(java.lang.Exception e9){
          e9.printStackTrace();
       }
       RemoteConfigManager j1 = RemoteConfigManager.j;
       RemoteConfigManager.e(j1, System.currentTimeMillis());
       long l = RemoteConfigManager.b(j1);
       SpAdapter.b.putLong("channel_config_timestamp", l);
       return;
    }
    public void onSuccess(Object p0){
       this.onSuccess(p0);
    }
}
