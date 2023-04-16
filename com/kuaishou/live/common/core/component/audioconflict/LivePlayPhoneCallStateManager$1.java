package com.kuaishou.live.common.core.component.audioconflict.LivePlayPhoneCallStateManager$1;
import android.content.BroadcastReceiver;
import com.kuaishou.live.common.core.component.audioconflict.LivePlayPhoneCallStateManager;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.telephony.TelephonyManager;
import java.util.Objects;
import com.kuaishou.live.common.core.component.audioconflict.LivePlayPhoneCallStateManager$b;

public class LivePlayPhoneCallStateManager$1 extends BroadcastReceiver	// class@000f5d
{
    public final LivePlayPhoneCallStateManager a;

    public void LivePlayPhoneCallStateManager$1(LivePlayPhoneCallStateManager p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       LivePlayPhoneCallStateManager$1 ta;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePlayPhoneCallStateManager$1.class, "1")) {
          return;
       }
       int callState = p0.getSystemService("phone").getCallState();
       if (callState) {
          if (callState != 1) {
             if (callState == 2) {
                ta = this.a;
                if (ta.c == null) {
                   ta.a();
                   ta.c = true;
                }
             }
          }else {
             ta = this.a;
             if (ta.c == null) {
                ta.a();
                ta.c = true;
             }
          }
       }else {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, LivePlayPhoneCallStateManager.class, "3")) {
             LivePlayPhoneCallStateManager e = ta.e;
             if (e != null) {
                e.b();
             }
          }
          ta.c = false;
       }
    label_0059 :
       return;
    }
}
