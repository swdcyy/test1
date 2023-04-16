package com.yxcorp.gifshow.autoplay.live.AutoLivePlayPhoneCallStateManager$1;
import android.content.BroadcastReceiver;
import com.yxcorp.gifshow.autoplay.live.AutoLivePlayPhoneCallStateManager;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.telephony.TelephonyManager;
import java.util.Objects;
import com.yxcorp.gifshow.autoplay.live.AutoLivePlayPhoneCallStateManager$a;
import com.yxcorp.gifshow.autoplay.live.AutoLivePlayPhoneCallStateManager$b;

public class AutoLivePlayPhoneCallStateManager$1 extends BroadcastReceiver	// class@001bf3
{
    public final AutoLivePlayPhoneCallStateManager a;

    public void AutoLivePlayPhoneCallStateManager$1(AutoLivePlayPhoneCallStateManager p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       AutoLivePlayPhoneCallStateManager$1 ta;
       AutoLivePlayPhoneCallStateManager d;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AutoLivePlayPhoneCallStateManager$1.class, "1")) {
          return;
       }
       int callState = p0.getSystemService("phone").getCallState();
       Object[] objArray = null;
       if (callState) {
          if (callState == 1 || callState == 2) {
             ta = this.a;
             if (ta.c == null) {
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoid(objArray, ta, AutoLivePlayPhoneCallStateManager.class, "2")) {
                   d = ta.d;
                   if (d != null) {
                      d.a();
                   }
                }
                ta.c = true;
             }
          }
       }else {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, AutoLivePlayPhoneCallStateManager.class, "3")) {
             d = ta.e;
             if (d != null) {
                d.b();
             }
          }
          ta.c = false;
       }
       return;
    }
}
