package com.yxcorp.gifshow.autoplay.live.AutoLivePlayPhoneCallStateManager;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.IntentFilter;
import com.yxcorp.gifshow.autoplay.live.AutoLivePlayPhoneCallStateManager$1;
import android.content.BroadcastReceiver;
import android.content.Intent;
import java.lang.Throwable;
import u99.d;
import com.yxcorp.gifshow.autoplay.live.AutoLivePlayPhoneCallStateManager$a;
import com.yxcorp.gifshow.autoplay.live.AutoLivePlayPhoneCallStateManager$b;

public class AutoLivePlayPhoneCallStateManager	// class@001bf6
{
    public final Context a;
    public BroadcastReceiver b;
    public boolean c;
    public AutoLivePlayPhoneCallStateManager$a d;
    public AutoLivePlayPhoneCallStateManager$b e;

    public void AutoLivePlayPhoneCallStateManager(Context p0){
       super();
       this.c = false;
       this.a = p0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, AutoLivePlayPhoneCallStateManager.class, "1")) {
          return;
       }
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.intent.action.PHONE_STATE");
       AutoLivePlayPhoneCallStateManager$1 u1 = new AutoLivePlayPhoneCallStateManager$1(this);
       try{
          this.b = u1;
          this.a.registerReceiver(u1, intentFilter);
       }catch(java.lang.Exception e0){
          d.a("AutoLivePlayPhoneCallStateManager", "registerReceiver", e0);
       }
       return;
    }
    public void b(AutoLivePlayPhoneCallStateManager$a p0){
       this.d = p0;
    }
    public void c(AutoLivePlayPhoneCallStateManager$b p0){
       this.e = p0;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, AutoLivePlayPhoneCallStateManager.class, "4")) {
          return;
       }
       AutoLivePlayPhoneCallStateManager tb = this.b;
       if (tb != null) {
          try{
             this.a.unregisterReceiver(tb);
          }catch(java.lang.Exception e0){
             d.a("AutoLivePlayPhoneCallStateManager", "unregisterReceiver", e0);
          }
       }
    }
}
