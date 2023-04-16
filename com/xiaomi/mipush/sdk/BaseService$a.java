package com.xiaomi.mipush.sdk.BaseService$a;
import android.os.Handler;
import java.lang.ref.WeakReference;
import android.os.Message;
import java.lang.Object;
import com.xiaomi.mipush.sdk.BaseService;
import java.lang.StringBuilder;
import java.lang.String;
import rs8.c;
import android.app.Service;

public class BaseService$a extends Handler	// class@0010d1
{
    public WeakReference a;

    public void BaseService$a(WeakReference p0){
       this.a = p0;
    }
    public void a(){
       if (this.hasMessages(1001)) {
          this.removeMessages(1001);
       }
       this.sendEmptyMessageDelayed(1001, 1000);
       return;
    }
    public void handleMessage(Message p0){
       if (p0.what != 1001) {
       }else {
          BaseService$a ta = this.a;
          if (ta != null) {
             BaseService uBaseService = ta.get();
             if (uBaseService != null) {
                c.t("TimeoutHandler "+uBaseService.toString()+" kill self");
                if (!uBaseService.a()) {
                   uBaseService.stopSelf();
                }else {
                   c.t("TimeoutHandler has job");
                   this.sendEmptyMessageDelayed(1001, 1000);
                }
             }
          }
       }
       return;
    }
}
