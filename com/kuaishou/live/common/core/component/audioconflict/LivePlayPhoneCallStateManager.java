package com.kuaishou.live.common.core.component.audioconflict.LivePlayPhoneCallStateManager;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.audioconflict.LivePlayPhoneCallStateManager$a;
import android.content.IntentFilter;
import com.kuaishou.live.common.core.component.audioconflict.LivePlayPhoneCallStateManager$1;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.kuaishou.live.common.core.component.audioconflict.LivePlayPhoneCallStateManager$b;

public class LivePlayPhoneCallStateManager	// class@000f60
{
    public final Context a;
    public BroadcastReceiver b;
    public boolean c;
    public LivePlayPhoneCallStateManager$a d;
    public LivePlayPhoneCallStateManager$b e;

    public void LivePlayPhoneCallStateManager(Context p0){
       super();
       this.c = false;
       this.a = p0;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LivePlayPhoneCallStateManager.class, "2")) {
          return;
       }
       LivePlayPhoneCallStateManager td = this.d;
       if (td != null) {
          td.a();
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LivePlayPhoneCallStateManager.class, "1")) {
          return;
       }
       IntentFilter intentFilter = new IntentFilter();
       intentFilter.addAction("android.intent.action.PHONE_STATE");
       LivePlayPhoneCallStateManager$1 u1 = new LivePlayPhoneCallStateManager$1(this);
       this.b = u1;
       UniversalReceiver.e(this.a, u1, intentFilter);
       return;
    }
    public void c(LivePlayPhoneCallStateManager$a p0){
       this.d = p0;
    }
    public void d(LivePlayPhoneCallStateManager$b p0){
       this.e = p0;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LivePlayPhoneCallStateManager.class, "4")) {
          return;
       }
       LivePlayPhoneCallStateManager tb = this.b;
       if (tb != null) {
          UniversalReceiver.f(this.a, tb);
       }
       return;
    }
}
